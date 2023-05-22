
     ToString() = converts an object to its string representation so that it is suitable for display


In C#, the ToString() method is a built-in method defined in the Object class, which is the base class for all types.
This method returns a string representation of an object. By default, it returns the fully qualified name of the objects type.

The ToString() method is often overridden in derived classes to provide a customized string representation of the objects state.
By overriding this method, you can define how your object should be converted to a string when it is called.

To override the ToString() method in C#, follow these steps:

In the class where you want to override ToString(), include a method with the same name and return type (string).
Apply the override keyword to indicate that youre overriding the base class method.
Implement the custom logic inside the method to return the desired string representation of the object.
Heres an example that demonstrates overriding the ToString() method in a custom class:


class Person
{
    public string Name { get; set; }
    public int Age { get; set; }

    public override string ToString()
    {
        return $"Person: Name={Name}, Age={Age}";
    }
}

class Program
{
    static void Main(string[] args)
    {
        Person person = new Person { Name = "John Doe", Age = 30 };
        Console.WriteLine(person.ToString());  // Output: "Person: Name=John Doe, Age=30"
    }
}
In the example above, we have a Person class with Name and Age properties. We override the ToString() method in the Person class and provide a custom
implementation that returns a formatted string representation of the objects properties.

In the Main method, we create an instance of the Person class, set its properties, and then call the ToString() method.
The overridden ToString() method is executed, returning the custom string representation of the object, which is then printed to the console.

By overriding the ToString() method, you can define how your objects should be represented as strings,
making it easier to display or log their state in a human-readable format.






MORE EXPLANATION
************************************************************************************************************************************************************************8

The ToString method in C# is a method that is inherited from the Object class, which is the superclass of all .NET types. 
It returns a string that represents the current object [2]. Every object in C# gets the ToString method,
which returns a string representation of that object. For example, all variables of type int have a ToString method, 
which enables them to return their contents as a string [3].

When you create a custom class or struct, you should override the ToString method in order to provide information about your type to client code [3]. 
The ToString method is automatically created for every class in .NET Framework, but most of the time it is not useful at all because all it will return 
is the class name. So to make it more useful, we can override it and return our own value instead – for example, a string representation of the object [0].

Here is how to override the ToString method in C# [3]:

Declare a ToString method with the following modifiers and return type:
public override string ToString(){}
Implement the method so that it returns a string.
For example, lets say we have a class called Automobile, and we want to override the ToString method to return a more useful 
string representation of the object. Here is how we can do it [0]:

using System;
namespace OverridingMethods
{
    public class Automobile
    {
        #region Private Members
        private string brand;
        private string name;
        private string model;
        private int year;
        private string colour;
        #endregion

        #region Public Properties
        public string Brand
        {
            get { return brand; }
            set { brand = value; }
        }

        public string Name
        {
            get { return name; }
            set { name = value; }
        }

        public string Model
        {
            get { return model; }
            set { model = value; }
        }

        public int Year
        {
            get { return year; }
            set { year = value; }
        }

        public string Colour
        {
            get { return colour; }
            set { colour = value; }
        }
        #endregion

        #region Constructor
        public Automobile(string brand, string name, string model, int year, string colour)
        {
            this.brand = brand;
            this.name = name;
            this.model = model;
            this.year = year;
            this.colour = colour;
        }
        #endregion

        public override string ToString()
        {
            return string.Format("{0} {1} {2} {3} {4}", colour, year, brand, name, model);
        }
    }
}
We can also override the ToString method for a Stack. Here is an example [1]:

using System;
using System.Collections;

class GFG {
    public static void Main(String[] args)
    {
        Stack st = new Stack();
        st.Push("Welcome");
        st.Push("To");
        st.Push("Geeks");
        st.Push("For");
        st.Push("Geeks");
        Console.WriteLine("After ToString Method: ");
        foreach(string str in st)
        {
            Console.WriteLine(str.ToString());
        }
    }
}
In the example above, we create a Stack called st and add some elements to it using the Push method. 
We then override the ToString method for the Stack class to return the string representation of the collection.
Finally, we use a foreach loop to iterate over the elements of the stack and call the ToString method for each element.

Overriding the ToString method is useful because it allows us to provide a more meaningful string representation of an object. 
This can be especially helpful when debugging or displaying information to the user. Additionally, overriding the ToString method
can make our code more generic and easier to use, as we can rely on the standard ToString method for displaying object information rather than creating custom methods







MORE EXPLANATION
************************************************************************************************************************************************************************8









The ToString() method in C# is a virtual method that is defined in the Object class. It is used to convert an object to its string representation.
The default implementation of the ToString() method returns the fully qualified name of the objects type.

You can override the ToString() method in your own classes to return a more meaningful string representation of your objects. 
To override the ToString() method, you must declare a method with the same name, parameters, and return type as the ToString() method in the Object class.

Here is an example of how to override the ToString() method:

C#
public class Person
{
    public string Name { get; set; }
    public int Age { get; set; }

    public override string ToString()
    {
        return "Person: " + Name + " " + Age;
    }
}
Use code with caution. Learn more
In this example, the ToString() method in the Person class returns a string that contains the name and age of the person.

Here is an example of how to use the ToString() method:

C#
Person person = new Person("John Doe", 30);

string personString = person.ToString();

Console.WriteLine(personString);
Use code with caution. Learn more
This code will print the following output to the console:

Code snippet
Person: John Doe 30
Use code with caution. Learn more
The ToString() method is a powerful tool that can be used to improve the readability and maintainability of your code.
By overriding the ToString() method, you can provide a more meaningful string representation of your objects, which can make your code easier to understand and debug























































































































































.....
