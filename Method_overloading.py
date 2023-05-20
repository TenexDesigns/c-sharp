            // method overloading  = methods share same name, but different parameters
            //                       name + parameters = signature
            //                       methods must have a unique signature, if they deo decide to share the same name.










using System;

namespace MyFirstProgram
{
    class Program
    {
        static void Main(string[] args)
        {
            // method overloading  = methods share same name, but different parameters
            //                       name + parameters = signature
            //                       methods must have a unique signature

            double total;
            
            total = Multiply(2, 3, 4);

            Console.WriteLine(total);
            Console.ReadKey();
        }

        static double Multiply(double a, double b)
        {      
            return a * b;
        }
        static double Multiply(double a, double b, double c)
        {
            return a * b * c;
        }
    }
}




METHOD OERLOADING 
**********************************************************************************************************************************************************************

Method overloading in C# allows you to define multiple methods with the same name but different parameter lists. The compiler determines which method to invoke based on the number, types, and order of the arguments provided when calling the method. Method overloading provides flexibility and convenience by allowing methods with similar functionality to share the same name.

Here's an explanation of method overloading in C# along with code samples:


// Example 1: Overloaded methods with different parameter types
void DisplayMessage(string message)
{
    Console.WriteLine(message);
}

void DisplayMessage(int number)
{
    Console.WriteLine("The number is: " + number);
}
In this example, we have two overloaded methods named DisplayMessage. 
The first method accepts a string parameter, and the second method accepts an int parameter. Depending on the argument type provided when calling the method, the corresponding DisplayMessage method will be invoked.

// Example 2: Overloaded methods with different number of parameters
void Add(int num1, int num2)
{
    int sum = num1 + num2;
    Console.WriteLine("The sum is: " + sum);
}

void Add(int num1, int num2, int num3)
{
    int sum = num1 + num2 + num3;
    Console.WriteLine("The sum is: " + sum);
}
In this example, we have two overloaded methods named Add. The first method accepts two int parameters, and the second method accepts three int parameters.
Depending on the number of arguments provided when calling the method, the corresponding Add method will be invoked.

Method overloading allows you to provide different versions of a method that perform similar operations but with variations in the types or number of parameters.
This can enhance code readability and reduce the need for different method names for slight variations in functionality.

Note that method overloading is determined at compile-time based on the arguments provided, so the compiler selects the appropriate method based on the argument types.
If the arguments do not match any available overload, a compilation error will occur.

Example usage of method overloading:


DisplayMessage("Hello!");           // Invokes DisplayMessage(string message)
DisplayMessage(10);                 // Invokes DisplayMessage(int number)

Add(5, 10);                         // Invokes Add(int num1, int num2)
Add(2, 4, 6);                       // Invokes Add(int num1, int num2, int num3)
In summary, method overloading in C# allows you to define multiple methods with the same name but different parameters. 
The compiler selects the appropriate method based on the arguments provided when calling the method.

Method overloading provides flexibility and convenience by allowing you to define multiple versions of a method with similar functionality.
























































































































































































....
