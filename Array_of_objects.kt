using System;

namespace MyFirstProgram
{
    class Program
    {
        static void Main(string[] args) {

         /Method 1
          
         Car[] garage = { new Car("Mustang"), new Car("Corvette"), new Car("Lambo") };  ---> This creates an array of anonymous objects
          
          / Method 2
          
          Car car1 = new Car("Mustang");
          Car car2 = new Car("Corvette");
          Car car3 = new Car("Lambo");

          
           Car[] garage  = new Car[3];
          
          garge[0] = car1;
          garge[1] = car2;
          garge[2] = car3;
          
          to access the model objects using method 2
          
          Console.writeLine(garage[0].model) --------------->  This prints "Mustange"
          Console.writeLine(garage[0])       --------------->  This prints "MyfirstProgram.car"  . It prints the namespace the Car class is found and .Car
          

          //We can loop through the array of objects like this
            foreach (Car car in garage)
            {
                Console.WriteLine(car.model);
            }

            Console.ReadKey();
        }   
    }
    class Car 
    {
        public String model;

        public Car(String model)
        {
            this.model = model;
        }
    }
}





ARRAY OF OBJECTS
*******************************************************************************************************************************************************************88


In C#, an array of objects allows you to store multiple objects of the same type in a single data structure.
It provides a convenient way to group related objects together and access them using index-based notation. 
You can create and manipulate arrays using various methods and operations in C#.

To create an array of objects in C#, you first need to define the type of objects you want to store in the array. 
Heres an example of creating an array of Person objects:


class Person
{
    public string Name { get; set; }
    public int Age { get; set; }
}

// Create an array of Person objects
Person[] people = new Person[3];



In the above code, we define a Person class with properties Name and Age. Then we create an array of Person objects using the 
new keyword and specifying the size of the array as 3.

Once the array is created, you can access individual elements using their index. The index starts from 0, so the first element is at index 0, 
the second element is at index 1, and so on.
You can assign values to the array elements and access their properties. Heres an example:




// Assign values to the array elements
 people[0] = new Person { Name = "John", Age = 25 };
 people[1] = new Person { Name = "Jane", Age = 30 };
 people[2] = new Person { Name = "Bob", Age = 40 };

 //Access array elements and their properties
 Console.WriteLine(people[0].Name);  // Output: John
 Console.WriteLine(people[1].Age);   // Output: 30




In the above code, we assign Person objects to the array elements using the index notation. Then we access the properties of the array elements using dot notation.

Arrays of objects have various uses and applications in C#:

Collection of related objects: Arrays allow you to group together objects of the same type, providing a convenient way to store and access related data.
For example, you can use an array of Employee objects to store employee records or an array of Product objects to store a list of products.

Iteration and processing: Arrays are commonly used for iteration and processing of a collection of objects.
You can use loops to iterate over the elements of an array and perform operations on them.

Parameter passing: Arrays can be used to pass a collection of objects as a parameter to a method or function.

This allows you to operate on multiple objects simultaneously.

Sorting and searching: Arrays provide methods and algorithms for sorting and searching elements. 
You can sort an array of objects based on a specific property or search for specific objects based on certain criteria.

Arrays provide a simple and efficient way to store and manipulate collections of objects in C#.
They are widely used in various applications and scenarios where grouping and processing of related objects are required.







ARRAY OF OBJECTS
*******************************************************************************************************************************************************************88

An array of objects in C# is a data structure that can store multiple instances of the same type or objects of any type in a single variable.
In C#, arrays are actually objects, and not just addressable regions of contiguous memory as in C and C++ learn.microsoft.com.

To create an array of objects, you can use the following syntax:

type[] arrayName;
For example, lets create an array of Person objects:

public class Person
{
    public string Name { get; set; }
    public int Age { get; set; }
}

Person[] people = new Person[3];
You can then initialize the elements of the array:

people[0] = new Person { Name = "Alice", Age = 30 };
people[1] = new Person { Name = "Bob", Age = 25 };
people[2] = new Person { Name = "Charlie", Age = 28 };
To iterate through the array of objects, you can use a foreach loop:

foreach (Person person in people)
{
    Console.WriteLine($"Name: {person.Name}, Age: {person.Age}");
}
Arrays are useful in many applications, such as sorting, searching, and storing large amounts of data in a structured way. 
They also provide the ability to use the Length property to get the length of an array, and the Rank property to get the number of dimensions of an array





ARRAY OF OBJECTS
*******************************************************************************************************************************************************************88



An array of objects in C# is a collection of objects that are stored in contiguous memory locations. Arrays of objects are created using the following syntax:

C#
object[] array = new object[size];
Use code with caution. Learn more
where size is the number of objects to be stored in the array.

To add an object to an array, you can use the following syntax:

C#
array[index] = object;
Use code with caution. Learn more
where index is the index of the object in the array and object is the object to be added.

To retrieve an object from an array, you can use the following syntax:

C#
object object = array[index];
Use code with caution. Learn more
where index is the index of the object in the array.

Here is an example of how to create and use an array of objects in C#:

C#
// Create an array of objects
object[] array = new object[5];

// Add objects to the array
array[0] = "Hello";
array[1] = 10;
array[2] = 3.14159;
array[3] = true;
array[4] = new Person("John Doe", 30);

// Retrieve objects from the array
string str = (string)array[0];
int num = (int)array[1];
double d = (double)array[2];
bool b = (bool)array[3];
Person person = (Person)array[4];

// Print the objects
Console.WriteLine(str);
Console.WriteLine(num);
Console.WriteLine(d);
Console.WriteLine(b);
Console.WriteLine(person.Name + " " + person.Age);
Use code with caution. Learn more
This code will print the following output to the console:

Code snippet
Hello
10
3.14159
True
John Doe 30
Use code with caution. Learn more
Arrays of objects are useful for storing a collection of related objects. For example, you could use an array of objects to store a collection of customers, products, or orders.

Here are some additional uses and applications of arrays of objects in C#:

Storing a collection of data
Passing a collection of data to a method
Returning a collection of data from a method
Sorting a collection of data
Searching a collection of data
Iterating over a collection of data
Arrays of objects are a powerful tool that can be used to store and manipulate collections of data in C#.
































































































































































































...
