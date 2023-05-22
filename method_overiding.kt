

            method overriding = provides a new version of a method inherited from a parent class
                                The inherited method must be: abstract, virtual, or already overriden
                               Used with ToString(), polymorphism 









using System;

namespace MyFirstProgram
{
    class Program
    {
        static void Main(string[] args) {

            //method overriding = provides a new version of a method inherited from a parent class
            //                    inherited method must be: abstract, virtual, or already overriden
            //                    Used with ToString(), polymorphism 

            Dog dog = new Dog();
            Cat cat = new Cat();

            dog.Speak();
            cat.Speak();

            Console.ReadKey();
        }
    }
    class Animal 
    {
        public virtual void Speak()
        {
            Console.WriteLine("The animal goes *brrr*");
        }
    }
    class Dog : Animal
    {
        public override void Speak()
        {
            Console.WriteLine("The dog goes *woof*");
        }
    }
    class Cat : Animal
    {

    }
}




METHOD OVERIDING
**************************************************************************************************************************************************


  Method overriding in C# allows a derived class to provide its own implementation of a method that is already defined in its base class.
This enables polymorphism, where objects of different classes can be treated interchangeably when calling the overridden method.

To override a method in C#, follow these steps:

Create a base class that contains a virtual method that can be overridden. The virtual keyword is used to mark the method as overridable.
In the derived class, use the override keyword to indicate that you want to override the base class method.
The method signature (name, return type, and parameters) in the derived class must match the method signature in the base class.
Heres an example that demonstrates method overriding in C#:


// Base class
class Shape
{
    public virtual void Draw()
    {
        Console.WriteLine("Drawing a shape.");
    }
}

// Derived class
class Circle : Shape
{
    public override void Draw()
    {
        Console.WriteLine("Drawing a circle.");
    }
}

// Main program
class Program
{
    static void Main(string[] args)
    {
        Shape shape = new Shape();
        shape.Draw();  // Output: "Drawing a shape."

        Circle circle = new Circle();
        circle.Draw();  // Output: "Drawing a circle."

        // Polymorphism: Calling the overridden method through a base class reference
        Shape shape2 = new Circle();
        shape2.Draw();  // Output: "Drawing a circle."
    }
}
In the example above, the base class Shape has a virtual method called Draw().
The derived class Circle overrides the Draw() method and provides its own implementation. When the Draw() method is called on an instance of Circle, 
the overridden method in the Circle class is executed.

In the Main method, we create an instance of Shape and call the Draw() method, which outputs "Drawing a shape." 
We also create an instance of Circle and call its Draw() method, which outputs "Drawing a circle."

Finally, we demonstrate polymorphism by creating a Shape reference that points to a Circle object. When we call Draw() using this reference, 
the overridden method in the Circle class is executed, outputting "Drawing a circle." 
This showcases how the overridden method can be called through a base class reference, 
allowing objects of different derived classes to be treated interchangeably.





METHOD OVERIDING
**************************************************************************************************************************************************

Method overriding in C# is a form of implementing polymorphism, also known as "run-time" polymorphism.
It allows a derived class to provide its own implementation of a method that the base class already defines,
maintaining the same method signature. Method overriding is used when the derived class wants to change or extend the behavior of a method in the base class code-maze.com.

To override a method in C#, you need to use the override keyword when defining the method in the derived class.
The method in the derived class must have the same name, return type, and parameter list. 
The base method must be marked as virtual or abstract for the derived class to override it code-maze.com.

Here is an example of method overriding in C#:

public abstract class Shape
{
    public string Color { get; set; }
    public abstract string Draw();
}

public class Circle : Shape
{
    public double Radius { get; set; }

    public override string Draw()
    {
        return $"Drawing a {Color} colored circle with a radius of {Radius} units.";
    }
}

public class Square : Shape
{
    public double Side { get; set; }

    public override string Draw()
    {
        return $"Drawing a square of color {Color} with its sides having length and width of {Side} units";
    }
}
In this example, the Shape class is an abstract class with an abstract Draw method.
The Circle and Square classes are derived from the Shape class and override the Draw method to provide their own implementation.
You can create instances of the Circle and Square classes and call the Draw method on them:

var circle = new Circle { Color = "Red", Radius = 5.5 };
Console.WriteLine(circle.Draw());

var square = new Square { Color = "Blue", Side = 12 };
Console.WriteLine(square.Draw());
Output:

Drawing a Red colored circle with a radius of 5.5 units.
Drawing a square of color Blue with its sides having length and width of 12 units
Method overriding is different from method overloading. Method overloading is when a 
class has multiple methods with the same name but different parameter lists,
allowing the class to provide different behaviors for the same method based on the parameters passed in code-maze.com.

In summary, method overriding in C# is a way to implement polymorphism by allowing a derived class to provide its own implementation 
for a method that already exists in the base class. This allows for more flexible and extensible code, 
as the derived class can modify or extend the behavior of a base class method without changing the base class itself.






METHOD OVERIDING
**************************************************************************************************************************************************


1
Sure. Here is an example of method overriding in C#:

C#
public class Animal
{
    public virtual void Speak()
    {
        Console.WriteLine("I am an animal!");
    }
}

public class Dog : Animal
{
    public override void Speak()
    {
        Console.WriteLine("Woof!");
    }
}

public class Program
{
    public static void Main()
    {
        // Create a Dog object
        Dog dog = new Dog();

        // Call the Speak() method on the Dog object
        dog.Speak();
    }
}
Use code with caution. Learn more
This code will print the following output to the console:

Code snippet
Woof!
Use code with caution. Learn more
In this example, the Animal class has a method called Speak(). 
The Dog class inherits from the Animal class and overrides the Speak() method. 
This means that when the Speak() method is called on a Dog object, the overridden method in the Dog class will be called.

Here are some additional details about method overriding in C#:

Method overriding is a feature that allows a subclass to provide a specific implementation of a method that is already provided by its superclass.
The method in the subclass must have the same name, same parameters, and same return type as the method in the superclass.
The method in the subclass must be declared using the override keyword.
Method overriding can be used to provide different implementations of a method for different types of objects.
Method overriding is a powerful feature that can be used to improve the flexibility and readability of your code.
























































































































....
