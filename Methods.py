            // method  = performs a section of code, whenever it's called "invoked".
            //           benefit = Let's us reuse code w/o writing it multiple times
            //           Good practice is to capitalize method names (I forgot in this video)




In C#, methods are blocks of code that perform a specific task. They can accept input parameters and return a value. Parameters are variables defined in a method's signature that receive values from the caller, while arguments are the actual values passed to the parameters when calling a method.

Here's an explanation of methods, parameters, and arguments in C# with code samples:

Method Declaration and Invocation:
Methods are declared using the following syntax:

accessModifier returnType MethodName(ParameterType parameter1, ParameterType parameter2, ...)
{
    // Method body
    // Code to perform the desired task
    // Optional: return a value using the 'return' keyword
}
To invoke (call) a method, you use its name followed by parentheses:


MethodName(argument1, argument2, ...);
Parameters:
Parameters are variables declared within the method's parentheses and are used to receive values from the caller. They specify the type and name of the data expected to be passed into the method.
Example:


void PrintName(string name)
{
    Console.WriteLine("Hello, " + name + "!");
}
In this example, the method PrintName accepts a single parameter of type string named name. The method can access and use the value passed to name within its code block.

Arguments:
Arguments are the actual values provided to the method when calling it. They correspond to the parameters of the method based on their position and type.
Example:

PrintName("John");
In this example, we call the PrintName method and pass the argument "John". The value "John" is passed to the name parameter of the method.

Code Sample Combining Method, Parameter, and Argument:
csharp
Copy code
int AddNumbers(int num1, int num2)
{
    int sum = num1 + num2;
    return sum;
}

int result = AddNumbers(5, 3);
Console.WriteLine(result); // Output: 8
In this example, we declare a method AddNumbers that accepts two parameters num1 and num2 of type int. The method adds the two numbers together and returns the sum. We then invoke the method and pass the arguments 5 and 3 to the respective parameters. The returned value is stored in the variable result and printed to the console.

Parameters allow methods to be more flexible and reusable by accepting different values. Arguments provide specific values to those parameters when calling the method.

Its important to ensure that the number, order, and type of arguments passed when calling a method match the parameters declared in the method's signature to avoid errors.





























































