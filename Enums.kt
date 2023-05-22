
            enums = special "class" that contains a set of named integer constants.
                    Use enums when you have values that you know will not change,
                    To get the integer value from an item, you must explicitly convert to an int

                    name = integer









In C#, enums (short for enumerations) are a data type that allows you to define a set of named constant values. Enums provide a way to represent a fixed list of related values, making your code more readable and self-explanatory. They are commonly used when you have a limited number of options or choices for a property or variable.

To define an enum in C#, you use the enum keyword followed by the name of the enum and the list of named values enclosed in curly braces. Heres an example:

enum DaysOfWeek
{
    Monday,
    Tuesday,
    Wednesday,
    Thursday,
    Friday,
    Saturday,
    Sunday
}
In the above code, we define an enum called DaysOfWeek with the named values representing the days of the week.
By default, the values of the enum members are assigned incremental integer values starting from 0.

You can use the enum type to declare variables and assign them one of the defined enum values. Heres an example:


DaysOfWeek today = DaysOfWeek.Monday;
Console.WriteLine(today);  // Output: Monday
In the above code, we declare a variable today of type DaysOfWeek and assign it the value Monday from the enum. We then print the value of today, which is Monday.

Enums can also be used in switch statements to perform different actions based on the enum value. Heres an example:


DaysOfWeek day = DaysOfWeek.Wednesday;

switch (day)
{
    case DaysOfWeek.Monday:
    case DaysOfWeek.Tuesday:
    case DaysOfWeek.Wednesday:
    case DaysOfWeek.Thursday:
    case DaysOfWeek.Friday:
        Console.WriteLine("Weekday");
        break;
    case DaysOfWeek.Saturday:
    case DaysOfWeek.Sunday:
        Console.WriteLine("Weekend");
        break;
    default:
        Console.WriteLine("Invalid day");
        break;
}
In the above code, we use a switch statement to determine if the day variable represents a weekday or a weekend day based on the enum value.

Enums provide several benefits in C#:

Readability: Enums make your code more readable and self-explanatory by using meaningful names for a set of related constant values.

Type Safety: Enums provide type safety, ensuring that you can only assign valid enum values to variables of that enum type.
The compiler checks for type compatibility and prevents assigning arbitrary values.

Compile-Time Constants: Enums are compile-time constants, meaning that their values are determined and assigned at compile-time,
providing performance benefits and compile-time error checking.

Integration with Integers: Enums are implicitly convertible to integers, allowing you to perform arithmetic operations or use 
them in places where integer values are expected.

Enums are useful in various scenarios, such as representing states, options, or choices in your application,
specifying flags or bit values, or defining a fixed set of values for a property or variable. 
They provide a clean and expressive way to work with a limited set of related constant values.






ENUMS
*************************************************************************************************************************************************************************

  
  using System;

namespace MyFirstProgram
{
    class Program
    {

        static void Main(string[] args)
        {
            // enums = special "class" that contains a set of named integer constants.
            //         Use enums when you have values that you know will not change,
            //         To get the integer value from an item, you must explicitly convert to an int

            //         name = integer

            //Console.WriteLine(Planets.Mercury + " is planet #" + (int)Planets.Mercury);
            //Console.WriteLine(Planets.Pluto + " is planet #" + (int)Planets.Pluto);

            String name = PlanetRadius.Earth.ToString();
            int radius = (int)PlanetRadius.Earth;
            double volume = Volume(PlanetRadius.Earth);

            Console.WriteLine("planet: " + name);
            Console.WriteLine("radius: " + radius +"km");
            Console.WriteLine("volume: " + volume +"km^3");

            Console.ReadKey();
        }
        public static double Volume(PlanetRadius radius)
        {
            double volume = (4.0 / 3.0) * Math.PI * Math.Pow((int)radius, 3);
            return volume;
        }
    }
    enum Planets
    {
        Mercury = 1, 
        Venus = 2, 
        Earth = 3, 
        Mars = 4, 
        Jupiter = 5, 
        Saturn = 6, 
        Uranus = 7, 
        Neptune = 8, 
        Pluto = 9
    }

    enum PlanetRadius
    {
        Mercury = 2439,
        Venus = 6051,
        Earth = 6371,
        Mars = 3389,
        Jupiter = 69911,
        Saturn = 58232,
        Uranus = 25362,
        Neptune = 24622,
        Pluto = 1188
    }
}









ENUMS
*************************************************************************************************************************************************************************







In C#, an enum (short for "enumeration") is a value type that consists of a set of named constants.
Enums are used to define a set of named constants and are declared using the "enum" keyword followed by the name of the enum and 
a list of comma-separated identifiers representing the named constants [0].

To create an enum in C#, use the "enum" keyword instead of "class" or "interface" and separate the enum items with a comma. For example,

enum Level 
{
  Low,
  Medium,
  High
}
In the above example, "Level" is the name of the enum and "Low", "Medium", and "High" are the named constants.
Enums are often used in switch statements to check for corresponding values. To assign an enum value to a variable, use the syntax "enumName.enumValue" [3].

In C, an enum is a user-defined data type that assigns names to integral constants, making a program easy to read and maintain.
Enums are declared using the "enum" keyword followed by the name of the enum and a list of comma-separated identifiers representing the named constants. For example,

enum week {Mon, Tue, Wed};
In the above example, "week" is the name of the enum and "Mon", "Tue", and "Wed" are the named constants. To define variables of type enum, they can be defined in two ways:

enum week day;
// Or
enum week {Mon, Tue, Wed} day;
In the above examples, "day" is defined as a variable of type "week" [2].

Enums can also be initialized with specific integer values. If no values are assigned, the compiler by default assigns values starting from 0. 
Enum values must be some integral constant within the range of possible integer values. 
Two enum names can have the same value, and all enum constants must be unique in their scope. For example,

enum State {Working = 1, Failed = 0, Freezed = 0};
In the above example, both "Failed" and "Freezed" have the same value of 0. To print the value of an enum constant, assign it to a variable of type 
enum and use the printf() function to print the variables value [2].

Enums are often used when values are not expected to change, such as month days, days, colors, deck of cards, etc.
They are preferred over macros when many related named constants have integral values because enums follow scope rules
and enum variables are automatically assigned values [3].

In conclusion, enums in C# and C are used to define a set of named constants that are assigned integer values. They make a program easy to read 
and maintain and are often used when values are not expected to change. Enums are declared using the "enum" keyword followed by the name of the
enum and a list of comma-separated identifiers representing the named constants. 
They can be initialized with specific integer values and are often used in switch statements to check for corresponding values [0][1][2][3][4].



































































































































































































































...
