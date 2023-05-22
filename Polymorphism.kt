

            polymorphism = Greek word that means to "have many forms"
                           Objects can be identified by more than one type
                           Ex. A Dog is also: Canine, Animal, Organism


using System;

namespace MyFirstProgram
{
    class Program
    {
        static void Main(string[] args) {

            // polymorphism = Greek word that means to "have many forms"
            //                Objects can be identified by more than one type
            //                Ex. A Dog is also: Canine, Animal, Organism

            Car car = new Car();
            Bicycle bicycle = new Bicycle();
            Boat boat = new Boat();

            Vehicle[] vehicles = {car, bicycle, boat};           // We can put this objects in this array becuse they all share the same parent, of vehicle, thu have that in common

            foreach (Vehicle vehicle in vehicles)
            {
                vehicle.Go();
            }
           
            Console.ReadKey();
        }
    }
    class Vehicle
    {
        public virtual void Go()
        {

        }
    }
    class Car: Vehicle
    {
        public override void Go()
        {
            Console.WriteLine("The car is moving!");
        }
    }
    class Bicycle : Vehicle
    {
        public override void Go()
        {
            Console.WriteLine("The bicycle is moving!");
        }
    }
    class Boat : Vehicle
    {
        public override void Go()
        {
            Console.WriteLine("The boat is moving!");
        }
    }
}



POLYMORPHISM EXPLAINED IN C#
********************************************************************************************************************************************************************8

Polymorphism in C# refers to the ability of objects of different classes to be treated interchangeably when they share a common base class or interface.
This allows for code reusability, flexibility, and extensibility.

Polymorphism can be achieved through method overriding and interface implementation.
Lets explore both concepts with code samples:


class Shape
{
    public virtual void Draw()
    {
        Console.WriteLine("Drawing a shape.");
    }
}

class Circle : Shape
{
    public override void Draw()
    {
        Console.WriteLine("Drawing a circle.");
    }
}

class Rectangle : Shape
{
    public override void Draw()
    {
        Console.WriteLine("Drawing a rectangle.");
    }
}

class Program
{
    static void Main(string[] args)
    {
        Shape shape = new Shape();
        shape.Draw();  // Output: "Drawing a shape."

        Circle circle = new Circle();
        circle.Draw();  // Output: "Drawing a circle."

        Rectangle rectangle = new Rectangle();
        rectangle.Draw();  // Output: "Drawing a rectangle."

        // Polymorphism: Calling the overridden method through a base class reference
        Shape shape2 = new Circle();
        shape2.Draw();  // Output: "Drawing a circle."

        shape2 = new Rectangle();
        shape2.Draw();  // Output: "Drawing a rectangle."
    }
}
In this example, we have a base class Shape with a virtual method Draw(). 
The derived classes Circle and Rectangle override the Draw() method and provide their own implementations. 
The Main method demonstrates polymorphism by creating objects of different derived classes (Circle and Rectangle) but treating them as instances of the base class (Shape).
When we call the Draw() method on these objects, the overridden method in the respective derived class is executed.

Interface Polymorphism:

interface IShape
{
    void Draw();
}

class Circle : IShape
{
    public void Draw()
    {
        Console.WriteLine("Drawing a circle.");
    }
}

class Rectangle : IShape
{
    public void Draw()
    {
        Console.WriteLine("Drawing a rectangle.");
    }
}

class Program
{
    static void Main(string[] args)
    {
        IShape shape = new Circle();
        shape.Draw();  // Output: "Drawing a circle."

        shape = new Rectangle();
        shape.Draw();  // Output: "Drawing a rectangle."
    }
}
In this example, we define an interface IShape that declares the Draw() method. 
The Circle and Rectangle classes implement this interface by providing their own implementations of the Draw() method. 
In the Main method, we create objects of the Circle and Rectangle classes but treat them as instances of the IShape interface.
This allows us to call the Draw() method on these objects interchangeably, achieving polymorphism.

Both method overriding and interface implementation enable polymorphism in C#. 
They allow objects of different classes to be treated uniformly through a common base class or interface, promoting code flexibility and extensibility.





POLYMORPHISM EXPLAINED IN C#
********************************************************************************************************************************************************************8

Polymorphism is a fundamental concept in object-oriented programming that allows the same entity (method, operator, or object) to perform different
operations in different scenarios. In C#, polymorphism can be achieved through method overloading, operator overloading, and method overriding programiz.com.

Example of Polymorphism with Method Overloading

In this example, the greet() method is overloaded to perform different actions based on the number of parameters passed:

using System;
class Program
{
    // method does not take any parameter 
    public void greet()
    {
        Console.WriteLine("Hello");
    }
    // method takes one string parameter
    public void greet(string name)
    {
        Console.WriteLine("Hello " + name);
    }
    static void Main(string[] args)
    {
        Program p1 = new Program();
        // calls method without any argument
        p1.greet();
        //calls method with an argument
        p1.greet("Tim");
    }
}
Output:

Hello
Hello Tim
Example of Polymorphism with Operator Overloading

In this example, the + operator is overloaded to perform addition and concatenation:

int x = 7;
int y = 5;
int sum = x + y;
Console.WriteLine(sum);
// Output: 12

string firstString = "Harry";
string secondString = "Styles";
string concatenatedString = firstString + secondString;
Console.WriteLine(concatenatedString);
// Output: HarryStyles
Example of Polymorphism with Method Overriding (Runtime Polymorphism)

In this example, the print() method is overridden in the derived class, allowing for different implementations based on the object type:

using System;

class BaseClass
{
    public virtual void print()
    {
        Console.WriteLine("print base class");
    }
}

class DerivedClass : BaseClass
{
    public override void print()
    {
        Console.WriteLine("print derived class");
    }
}

class Program
{
    static void Main(string[] args)
    {
        BaseClass baseObject = new BaseClass();
        DerivedClass derivedObject = new DerivedClass();
        BaseClass polymorphicObject = derivedObject;

        baseObject.print(); // Output: print base class
        derivedObject.print(); // Output: print derived class
        polymorphicObject.print(); // Output: print derived class
    }
}
In this example, the print() method is declared as virtual in the base class, which allows it to be overridden in the derived class.
When the print() method is called on a polymorphicObject instance, 
which is of type BaseClass but points to a DerivedClass object, the overridden method in the DerivedClass is executed





POLYMORPHISM EXPLAINED IN C#
********************************************************************************************************************************************************************8

Sure. Polymorphism is a feature of object-oriented programming that allows you to use the same interface for different types of objects. This means that you can write code that works with different types of objects without having to change the code.

There are two types of polymorphism in C#:

Method overloading
Method overriding
Method overloading is when you have two or more methods with the same name, but different parameters. The compiler will choose the correct method to call based on the number and types of parameters that are passed to the method.

Method overriding is when a derived class has a method with the same name, parameters, and return type as a method in the base class. The compiler will call the method in the derived class, even if the method is called through a reference to the base class.

Here is an example of method overloading:

C#
public class Shape
{
    public void Draw()
    {
        Console.WriteLine("Drawing a shape");
    }

    public void Draw(string color)
    {
        Console.WriteLine("Drawing a shape in {0}", color);
    }
}

public class Circle : Shape
{
    public override void Draw()
    {
        Console.WriteLine("Drawing a circle");
    }
}

public class Square : Shape
{
    public override void Draw()
    {
        Console.WriteLine("Drawing a square");
    }
}

public class Program
{
    public static void Main()
    {
        Shape shape = new Circle();
        shape.Draw(); // Prints "Drawing a circle"

        shape = new Square();
        shape.Draw(); // Prints "Drawing a square"

        shape.Draw("red"); // Prints "Drawing a shape in red"
    }
}
Use code with caution. Learn more
In this example, the Shape class has two methods named Draw(). The first method has no parameters, 
and the second method has one parameter of type string. The Circle and Square classes both inherit from the Shape class, 
and they both override the Draw() method. The Circle classs override of the Draw() method prints "Drawing a circle",
and the Square classs override of the Draw() method prints "Drawing a square".

Here is an example of method overriding:

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
In this example, the Animal class has a method called Speak(). The Dog class inherits from the Animal class and overrides the Speak() method. This means that when the Speak() method is called on a Dog object, the overridden method in the Dog class will be called.

Polymorphism is a powerful feature of object-oriented programming that can make your code more flexible and reusable. By using polymorphism, you can write code that works with different types of objects without having to change the code.










































































































































....
