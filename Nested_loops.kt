

Nested Lops - These are loop inside other loops



Nested loops in C# are loops that are placed within the body of another loop. They are used to perform repetitive actions in a structured and controlled manner, where each iteration of the outer loop triggers a complete iteration of the inner loop. Nested loops are commonly used for tasks that require multiple levels of iteration, such as working with multi-dimensional arrays or performing matrix operations.

Heres an example to illustrate nested loops:

csharp
Copy code
for (int i = 1; i <= 3; i++)
{
    for (int j = 1; j <= 3; j++)
    {
        Console.WriteLine($"({i}, {j})");
    }
}
In this example, we have a nested for loop. The outer loop iterates from 1 to 3, and for each iteration of the outer loop, the inner loop iterates from 1 to 3 as well. The output will be:

scss
Copy code
(1, 1)
(1, 2)
(1, 3)
(2, 1)
(2, 2)
(2, 3)
(3, 1)
(3, 2)
(3, 3)
Nested loops can also be used to traverse and manipulate multi-dimensional arrays. Heres an example:


int[,] matrix = new int[3, 3] { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

for (int row = 0; row < 3; row++)
{
    for (int col = 0; col < 3; col++)
    {
        Console.Write(matrix[row, col] + " ");
    }
    Console.WriteLine();
}
In this example, the nested loops traverse a 2-dimensional array (matrix) and print its elements row by row. The output will be:


1 2 3
4 5 6
7 8 9
Nested loops can be extended to any level required, depending on the complexity of the problem. They are particularly useful when working with multi-dimensional data structures, performing nested iterations, or implementing algorithms that require nested iterations or patterns.

However, its important to consider the efficiency of nested loops, especially when dealing with large datasets. Nested loops can have a high time complexity, and excessive nesting can result in slower performance. In such cases, it might be worth exploring alternative algorithms or optimizing the code structure to reduce the number of nested loops.













