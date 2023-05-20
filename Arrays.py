
Array  - An array that can store multiple values, it is fixed size



Pinned by Bro Code
Bro Code
1 year ago
using System;

namespace MyFirstProgram
{
    class Program
    {
        static void Main(string[] args)
        {
            // array = a variable that can store multiple values. fixed size

            //String[] cars = {"BMW", "Mustang", "Corvette"};

            String[] cars = new string[3];  // We have to give the array size, if we are going to intialze the array and not declared it.

            cars[0] = "Tesla";
            cars[1] = "Mustang";
            cars[2] = "Corvette";

            for (int i = 0; i < cars.Length; i++)
            {
                Console.WriteLine(cars[i]);
            }

            Console.ReadKey();
        }
    }
}


ARRAYS, FOREACHLOOP AND FOR LOOP
___________________________________________________________________________________________________________________________________________-

Arrays in C# are data structures used to store a fixed number of elements of the same type. They provide an efficient way to manage and access collections of items.
In C#, arrays are zero-based, which means the first element is accessed using the index 0.

Here's an example of declaring and initializing an array in C#:


int[] numbers = new int[5];
numbers[0] = 1;
numbers[1] = 2;
numbers[2] = 3;
numbers[3] = 4;
numbers[4] = 5;
In this example, we declare an integer array named numbers with a length of 5. We then assign values to each element using the index notation ([]).

Foreach loops in C# provide a concise and convenient way to iterate over arrays (or other enumerable collections) without explicitly using an index. 
The foreach loop automatically iterates through each element of the array.

Here's an example of using a foreach loop to iterate over an array:


int[] numbers = { 1, 2, 3, 4, 5 };

foreach (int number in numbers)
{
    Console.WriteLine(number);
}
In this example, the foreach loop iterates over each element number in the numbers array and prints its value. The output will be:


1
2
3
4
5
On the other hand, for loops in C# provide more control and flexibility over array iteration by using an index variable.
The for loop allows you to define the starting index, condition, and increment/decrement logic explicitly.

Heres an example of using a for loop to iterate over an array:


int[] numbers = { 1, 2, 3, 4, 5 };

for (int i = 0; i < numbers.Length; i++)
{
    Console.WriteLine(numbers[i]);
}
In this example, the for loop initializes the index variable i to 0, continues the loop while i is less than the length of the numbers array (numbers.Length), 
and increments i by 1 in each iteration.
The loop accesses each element of the array using the index i and prints its value. The output will be the same as the previous example:

1
2
3
4
5
Differences between foreach loops and for loops for iterating over arrays:

Foreach loops are simpler and more concise, as they handle the iteration automatically without the need for an explicit index variable.
Foreach loops are read-only, meaning you cannot modify the elements of the array within the loop.
However, for loops allow for modifying array elements.
For loops provide more control and flexibility by allowing explicit control of the iteration variables,
such as starting index, condition, and increment/decrement logic.
For loops are better suited when you need to modify the array elements or when you require precise control over the iteration, 
such as iterating backwards or skipping elements based on certain conditions.
Foreach loops are generally preferred when you only need to iterate over the elements of an array without requiring direct access to the index.
In summary, foreach loops are simpler and more convenient for iterating over arrays when you only need to access the elements without modifying them.
For loops provide more control and flexibility for iterating over arrays and are suitable when you need to modify array elements
or require precise control over the iteration process.














