           class = A bundle of related code.
                        Can be used as a blueprint to create objects (OOP)





using System;

namespace MyFirstProgram
{
    class Program
    {
        static void Main(string[] args)
        {
            // class = A bundle of related code.
            //              Can be used as a blueprint to create objects (OOP)
            
            Messages.Hello();
            Messages.Waiting();
            Messages.Bye();

            Console.ReadKey();
        }
    }
    static class Messages
    {
        public static void Hello()
        {
            Console.WriteLine("Hello! Welcome to the program");
        }
        public static void Waiting()
        {
            Console.WriteLine("I am waiting for something");
        }
        public static void Bye()
        {
            Console.WriteLine("Bye! Thanks for visiting");
        }
    }
}





*********************************************************************************************************************************************************************8


In C#, classes are the fundamental building blocks of object-oriented programming. They serve as templates or blueprints for creating objects,
which are instances of a class. Heres an explanation of classes in C#, along with code samples to demonstrate how to create and instantiate them, 
and how to access their members.

Creating a Class:
To create a class in C#, you need to define its structure and members. This includes fields, properties, methods, and constructors.
Heres an example of a simple class called "Person":


public class Person
{
    // Fields
    private string name;
    private int age;
    
    // Constructor
    public Person(string name, int age)
    {
        this.name = name;
        this.age = age;
    }
    
    // Property
    public string Name
    {
        get { return name; }
        set { name = value; }
    }
    
    // Method
    public void SayHello()
    {
        Console.WriteLine($"Hello, my name is {name} and I'm {age} years old.");
    }
}
In the above code, the Person class has two private fields (name and age), a constructor that takes the name and age as parameters, 
a property (Name) to get and set the name, and a method (SayHello) to print a greeting.

Creating an Instance of a Class:
To create an instance (object) of a class, you use the new keyword, followed by the class name and parentheses.
Heres an example of creating an instance of the Person class:


Person person1 = new Person("John", 25);
In the above code, we create a Person object named person1 with the name "John" and age 25.

Accessing Class Members:
Once you have an instance of a class, you can access its members (fields, properties, and methods) using the dot notation (.). Here are a few examples:


// Accessing fields
Console.WriteLine(person1.Name);  // Output: John

// Accessing properties
person1.Name = "Jane";
Console.WriteLine(person1.Name);  // Output: Jane

// Calling methods
person1.SayHello();  // Output: Hello, my name is Jane and I'm 25 years old.
In the above code, we access the Name property and modify it by assigning a new value. Then, we call the SayHello method to print a greeting.

You can create multiple instances of a class and access their members independently:


Person person2 = new Person("Mike", 30);

Console.WriteLine(person2.Name);  // Output: Mike
person2.SayHello();  // Output: Hello, my name is Mike and I'm 30 years old.
In this example, we create another Person object named person2 and access its members in a similar manner.

Thats a basic explanation of creating and using classes in C#.
You can define more complex classes with additional members and methods, as needed, to model the behavior and properties of the objects you want to represent
in your application.
















































































































...
