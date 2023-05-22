

           List = data structure that represents a list of objects that can be accessed by index.
                   Similar to array, but can dynamically increase/decrease in size 
                   using System.Collections.Generic;




using System;
using System.Collections.Generic;

namespace MyFirstProgram
{
    class Program 
    {
        static void Main(string[] args)
        {

            // List = data structure that represents a list of objects that can be accessed by index.
            //        Similar to array, but can dynamically increase/decrease in size 
            //        using System.Collections.Generic;

            List<String> food = new List<String>();

            food.Add("pizza");
            food.Add("hamburger");
            food.Add("hotdog");
            food.Add("fries");

            //Console.WriteLine(food[0]);
            //Console.WriteLine(food[1]);
            //Console.WriteLine(food[2]);
            //Console.WriteLine(food[3]);

            //food.Remove("fries");
            //food.Insert(0, "sushi");
            //Console.WriteLine(food.Count);
            //Console.WriteLine(food.IndexOf("pizza"));
            //Console.WriteLine(food.LastIndexOf("fries"));
            //Console.WriteLine(food.Contains("pizza"));
            //food.Sort();
            //food.Reverse();
            //food.Clear();
            //String[] foodArray = food.ToArray();

            foreach (String item in food)
            {
                Console.WriteLine(item);
            }

            Console.ReadKey();
        }
    }
}





MORE EXPLANTION
**********************************************************************************************************************************************************************


  Sure. A list in C# is a collection of objects that can be accessed using an index. Lists are a powerful tool for storing and manipulating data.

Here is an example of how to create a list:

C#
List<string> names = new List<string>();
Use code with caution. Learn more
This code creates a new list of strings and assigns it to a variable named names.

Here is an example of how to add an object to a list:

C#
names.Add("John Doe");
Use code with caution. Learn more
This code adds the string "John Doe" to the names list.

Here is an example of how to get an object from a list:

C#
string name = names[0];
Use code with caution. Learn more
This code gets the first object from the names list and assigns it to a variable named name.

Here is an example of how to remove an object from a list:

C#
names.Remove("John Doe");
Use code with caution. Learn more
This code removes the string "John Doe" from the names list.

Here is an example of how to iterate through a list:

C#
foreach (string name in names)
{
    Console.WriteLine(name);
}
Use code with caution. Learn more
This code iterates through the names list and prints each name to the console.

Here is a list of the methods that lists have:

Add() - Adds an object to the list.
Clear() - Removes all objects from the list.
Contains() - Checks if an object is in the list.
CopyTo() - Copies the contents of the list to an array.
Count() - Gets the number of objects in the list.
IndexOf() - Gets the index of an object in the list.
Insert() - Inserts an object into the list at a specific index.
Remove() - Removes an object from the list.
RemoveAt() - Removes an object from the list at a specific index.
Sort() - Sorts the objects in the list.
ToArray() - Converts the list to an array.
Lists are a powerful tool for storing and manipulating data. By understanding the methods that lists have, you can write more powerful and flexible code.








MORE EXPLANTION
**********************************************************************************************************************************************************************

  
  In C#, a list is a dynamic collection that can hold elements of a specific type. It provides various methods and properties for adding, 
removing, accessing, and manipulating the elements in the list. Heres an explanation of lists in C# along with some code samples:

Creating and Initializing a List:

List<int> numbers = new List<int>(); // Create an empty list of integers

List<string> names = new List<string>()
{
    "John",
    "Alice",
    "Bob"
}; // Create and initialize a list of strings with initial values
In this example, we create an empty list numbers of type int using the List<T> class. We can also create and initialize 
a list names of type string with initial values using collection initializer syntax.

Basic List Operations:
csharp
Copy code
List<int> numbers = new List<int>() { 1, 2, 3, 4, 5 };

numbers.Add(6); // Add an element to the end of the list

numbers.Remove(3); // Remove the specified element from the list

int element = numbers[2]; // Access an element at a specific index

bool contains = numbers.Contains(5); // Check if the list contains a specific element

int count = numbers.Count; // Get the number of elements in the list

numbers.Clear(); // Remove all elements from the list
In this example, we have a list numbers initialized with some integer values. We demonstrate various operations such as adding an element (Add()), 
removing an element (Remove()), 
accessing an element using index ([]), checking element existence (Contains()), getting the count of elements (Count), and clearing the list (Clear()).

Iterating Over a List:
csharp
Copy code
List<string> names = new List<string>() { "John", "Alice", "Bob" };

foreach (string name in names)
{
    Console.WriteLine(name);
}

// Output:
// John
// Alice
// Bob
Here, we have a list names containing strings. We use a foreach loop to iterate over the elements of the list and print them to the console.

Sorting a List:
csharp
Copy code
List<int> numbers = new List<int>() { 5, 2, 1, 4, 3 };

numbers.Sort(); // Sort the list in ascending order

numbers.Reverse(); // Reverse the order of elements in the list
In this example, we have a list numbers with some integer values.
We use the Sort() method to sort the elements in ascending order and the Reverse() method to reverse the order of elements.

These are just a few examples of the methods and operations available with lists in C#.
The List class provides many other useful methods such as Insert, RemoveAt, Find, FindAll, and more, 
which can be used to manipulate and work with the elements in the list effectively.






MORE EXPLANTION
**********************************************************************************************************************************************************************

  
In C#, List<T> is a class that contains multiple objects of the same data type that can be accessed using an index. For example:

// list containing integer values 
List<int> number = new List<int>() { 1, 2, 3 };
Here, number is a List containing integer values (1, 2, and 3) programiz.com.

To create a List<T> in C#, we need to use the System.Collections.Generic namespace:

using System;
using System.Collections.Generic;
class Program
{
    public static void Main()
    {
        // create a list named subjects that contain 2 elements 
        List<string> subjects = new List<string>() { "English", "Math" };
    }
}
To access the elements of a List, you can use the index number (0, 1, 2 …). For example:

using System;
using System.Collections.Generic;
class Program
{
    public static void Main()
    {
        // create a list
        List<string> languages = new List<string>() { "Python", "Java" };
        // access the first and second elements of languages list
        Console.WriteLine("The first element of the list is " + languages[0]);
        Console.WriteLine("The second element of the list is " + languages[1]);
    }
}
Some of the common methods provided by the List<T> class are:

Add: Adds an element to the end of the list.
List<string> names = new List<string>() { "John", "Alice" };
names.Add("Bob");


Insert: Inserts an element at a specified index.
List<string> names = new List<string>() { "John", "Alice" };
names.Insert(1, "Bob"); // Inserts "Bob" at index 1


Remove: Removes the first occurrence of a specific object from the list.
List<string> names = new List<string>() { "John", "Alice", "John" };
names.Remove("John"); // Removes the first occurrence of "John"


RemoveAt: Removes the element at the specified index.
List<string> names = new List<string>() { "John", "Alice", "Bob" };
names.RemoveAt(1); // Removes the element at index 1 ("Alice")


IndexOf: Returns the index of the first occurrence of a value in the list.
List<string> names = new List<string>() { "John", "Alice", "Bob" };
int index = names.IndexOf("Alice"); // Returns 1


Clear: Removes all elements from the list.
List<string> names = new List<string>() { "John", "Alice", "Bob" };
names.Clear(); // Clears the list

Count: Gets the number of elements contained in the list.
List<string> names = new List<string>() { "John", "Alice", "Bob" };
int count = names.Count; // Returns 3

These are just a few of the methods provided by the List<T> class. 






MORE EXPLANTION
**********************************************************************************************************************************************************************















































































































































































...
