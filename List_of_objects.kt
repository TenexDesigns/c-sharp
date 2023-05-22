


using System;
using System.Collections.Generic;

namespace MyFirstProgram
{
    class Program 
    {
        static void Main(string[] args)
        {
            List<Player> players = new List<Player>();

            players.Add(new Player("Chad"));
            players.Add(new Player("Steve"));
            players.Add(new Player("Karen"));

          //or
          
          Player play1  = new Player("Chad");
          Player play2  = new Player("Kimani");
          Player play3  = new Player("Victor");
          Player play4  = new Player("Francis");
          
          
          players.Add(play1));
          players.Add(play2));
          players.Add(play3));
          players.Add(play4));
          
            foreach (Player player in players)
            {
                Console.WriteLine(player);
            }

            Console.ReadKey();
        }
    }

    class Player
    {
        public String username;

        public Player(String username)
        {
            this.username = username;
        }
        public override string ToString()
        {
            return username;
        }
    }
}




MORE EXPLANATION
*******************************************************************************************************************************************************888


In C#, you can create a List that holds objects of any type. Each element in the List can be an instance of a class or a custom object.
Heres an explanation of using a List of objects in C# along with code samples:

Creating a List of Objects:

class Person
{
    public string Name { get; set; }
    public int Age { get; set; }
}

List<Person> people = new List<Person>(); // Create an empty List of Person objects

people.Add(new Person { Name = "John", Age = 30 }); // Add objects to the list

people.Add(new Person { Name = "Alice", Age = 25 });

people.Add(new Person { Name = "Bob", Age = 35 });
In this example, we define a class Person with properties Name and Age.
We create an empty List people that can hold objects of type Person. We then add three instances of the Person class
to the list using the Add() method and object initializer syntax.

Accessing and Modifying Objects in the List:

Person firstPerson = people[0]; // Access the first person in the list

Console.WriteLine(firstPerson.Name); // Output: "John"

people[1].Age = 26; // Modify the Age of the second person

foreach (Person person in people)
{
    Console.WriteLine($"{person.Name}, Age: {person.Age}");
}

// Output:
// John, Age: 30
// Alice, Age: 26
// Bob, Age: 35
In this example, we access the first person in the list using the index [0] and store it in a variable.
We can then access properties of that object, such as Name.
We also modify the Age property of the second person in the list using the index [1]. 
Finally, we use a foreach loop to iterate over the List and print the Name and Age of each person.

Removing Objects from the List:
csharp
Copy code
people.RemoveAt(1); // Remove the second person from the list

people.Remove(people[0]); // Remove the first person from the list

foreach (Person person in people)
{
    Console.WriteLine($"{person.Name}, Age: {person.Age}");
}

// Output:
// Bob, Age: 35
In this example, we use the RemoveAt() method to remove the second person from the list using the index [1].
We also use the Remove() method to remove the first person from the list by passing the object reference. 
After removing elements, we iterate over the List again and print the remaining persons information.

A List of objects in C# allows you to store and manipulate collections of custom objects. 
You can add, access, modify, and remove objects using various methods and indexers provided by the List class.
This provides a flexible way to work with a collection of objects in your C# programs.




































































































































































...
