            params keyword = a method parameter that takes a variable number of arguments.
                            The parameter type must be a single - dimensional array



using System;

namespace MyFirstProgram
{
    class Program
    {
        static void Main(string[] args)
        {
            //params keyword = a method parameter that takes a variable number of arguments.
            //                 The parameter type must be a single - dimensional array

            double total = CheckOut(3.99, 5.75, 15, 1.00, 10.25);

            Console.WriteLine(total);
            Console.ReadKey();
        }

        static double CheckOut(params double[] prices)
        {
            double total = 0;

            foreach (double price in prices)
            {
                total += price;
            }
            return total;
        }

    }
}








MORE EXPLANTION ABOUT THE PARAMS KEYWORD
**************************************************************************************************************************************************************************

The params keyword in C# allows you to specify a variable number of parameters of the same type in a method signature.
It simplifies the process of passing a variable number of arguments to a method. 
The params keyword is used in combination with an array parameter, allowing you to pass a comma-separated list 
of values directly to the method without explicitly creating an array.

Heres an explanation of the params keyword in C# with code samples:



void DisplayNames(params string[] names)
{
    foreach (string name in names)
    {
        Console.WriteLine("Hello, " + name + "!");
    }
}



In this example, the DisplayNames method accepts a variable number of string parameters using the params keyword. 
The method body then iterates through each name in the names array and displays a greeting.

Usage of the DisplayNames method:

DisplayNames("John", "Jane");  // Hello, John! Hello, Jane!
DisplayNames("Alice", "Bob", "Charlie");  // Hello, Alice! Hello, Bob! Hello, Charlie!







The params keyword allows you to pass any number of string arguments directly to the method, without explicitly creating an array.
It provides a more convenient syntax when dealing with a variable number of arguments of the same type.

Comparison with Method Overloading:
Method overloading and the params keyword serve similar purposes of providing flexibility in method parameterization.
However, there are some differences:

Parameters: Method overloading requires defining multiple methods with different parameter lists
, whereas the params keyword allows a single method with a variable number of parameters.

Invocation: When using method overloading, you need to call the specific method with the matching parameter list.
With the params keyword, you can pass a varying number of arguments directly to the method.

Array Handling: Method overloading can handle different types of arguments, including arrays,
explicitly defined parameters, or other objects. The params keyword, on the other hand, simplifies passing multiple values of the same type as an array.

Readability: Method overloading can be useful when you have distinct variations of a method with different functionalities.
The params keyword is more suitable when you have a single method that needs to handle a varying number of similar parameters.

In summary, the params keyword in C# allows you to define methods with a variable number of parameters of the same type.
It simplifies the process of passing a varying number of arguments directly to the method. Method overloading, on the other hand, involves defining multiple methods 
with different parameter lists. Both approaches provide flexibility, but the params keyword is more suitable when dealing with a variable number of similar arguments.











































































































































...
