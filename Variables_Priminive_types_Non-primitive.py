
Variables and Constants


Variable : - A name give to a storage location in memeory
Contsnt : - An immutable value  


DECLARING VARAIBLES

int number;
int Number =1

The first and last are not the same , as c# is a case sensitive langiage, so the first and last are not the same,
We can not use a varialbe that is not inistailzed

DECLARING CONSTABNTS
We have to intialize a constant and set its value

const float Pi = 3.14f



NAMING CONVENTIONS
camel case = firstName
pascal Case = FirstName
Hungarialn Notation = strFirstName  --> Not used in C#



for local variable : Camel case ----- > int number;
for constants  :Pascal case     ----- > constant int MaxZom = 5;        


primitive types in c#


VARIABLES EXPLAINED
***************************************************************************************************************************************************************

In C#, variables are used to store and manipulate data. They have a specific type that determines the kind of data they can hold. Here's an explanation of variables in C# with code samples:

Declaring Variables:
Variables in C# are declared using a specific type followed by a name. Here are some examples:

int age;  // Declaring an integer variable named 'age'
string name;  // Declaring a string variable named 'name'
double salary;  // Declaring a double variable named 'salary'



Initializing Variables:
Variables can be initialized with an initial value at the time of declaration or later in the code. Here are examples of initializing variables:

int age = 25;  // Initializing 'age' with a value of 25
string name = "John";  // Initializing 'name' with the string "John"
double salary;  // Declaring 'salary'
salary = 5000.50;  // Assigning a value to 'salary' later


Assigning Values to Variables:
Variables can be assigned new values using the assignment operator (=). Here's an example:

int x = 10;
x = 20;  // Assigning a new value to 'x'




Using Variables in Expressions:
Variables can be used in expressions to perform calculations or combine values. Here are some examples:

int b = 3;
int sum = a + b;  // Using variables in an addition expression

string firstName = "John";
string lastName = "Doe";
string fullName = firstName + " " + lastName;  // Combining variables in a string concatenation




Variable Naming Conventions:
In C#, variables follow certain naming conventions for readability and consistency. It's recommended to use meaningful names that describe the purpose of the variable. Here are some guidelines:
Start variable names with a letter (or underscore) and use camelCase.
Avoid using reserved keywords as variable names.
Use descriptive names that indicate the purpose of the variable.

int studentCount;  // Good variable name
double _piValue;  // Good variable name with underscore
string 123name;  // Invalid variable name (starts with a number)
Variables are fundamental to working with data in C#. They allow you to store, manipulate, and retrieve values as your program executes. Understanding how to declare, initialize, and use variables is essential for writing effective C# code.






MORE EXPLANTIONS
***************************************************************************************************************************************************************

In C#, primitive types are the basic data types provided by the language to represent simple values. These types are built into the C# language and are used to store common types of data. Here are the primitive types in C#:

Boolean: Represents a Boolean value that can be either true or false.

Byte: Represents an 8-bit unsigned integer value.

SByte: Represents an 8-bit signed integer value.

Char: Represents a single Unicode character.

Decimal: Represents a decimal floating-point number with higher precision than float or double.

Double: Represents a double-precision floating-point number.

Float: Represents a single-precision floating-point number.

Int: Represents a 32-bit signed integer value.

UInt: Represents a 32-bit unsigned integer value.

Long: Represents a 64-bit signed integer value.

ULong: Represents a 64-bit unsigned integer value.

Short: Represents a 16-bit signed integer value.

UShort: Represents a 16-bit unsigned integer value.

IntPtr: Represents a signed pointer or a signed integer that is the same size as a pointer. Used for interoperability with unmanaged code.

UIntPtr: Represents an unsigned pointer or an unsigned integer that is the same size as a pointer. Used for interoperability with unmanaged code.

These primitive types provide a way to store and manipulate basic data in C#. Each type has its own range of values and memory requirements.
Additionally, C# also provides non-primitive types such as strings, arrays, classes, and structures, which are built using these primitive types.




NON - PRIMITIVE TYPES

String 
Array
Enum
Class

-----------------------------------------------------------------------------------------------------------------------------------------------

In addition to primitive types, C# also provides non-primitive types, which are more complex data types that are derived from the primitive types or built-in types. Here are some commonly used non-primitive types in C#:

String: Represents a sequence of characters. Strings are used to store and manipulate text.

Array: Represents a fixed-size collection of elements of the same type. 
  Arrays can store multiple values of the same type and provide indexed access to those values.

Class: Represents a blueprint for creating objects. Classes define the structure and behavior of objects, including properties, methods, and events.

Struct: Similar to classes, structs are also used to define custom data types.
  However, structs are value types and have different memory allocation and copying behavior compared to classes.

Enum: Enumerations are used to define a set of named constants. 
  Enums provide a way to represent a group of related values with meaningful names.

Interface: An interface defines a contract that classes can implement. 
  It specifies a set of methods, properties, and events that a class must provide. 
  Interfaces are used for achieving abstraction and defining common behavior.

Delegate: Delegates are used to define and encapsulate methods with a particular signature. 
  They are similar to function pointers in C++ and are widely used for event handling and callback mechanisms.

Nullable Types: Nullable types allow you to assign null values to value types.
  They are used when you need to represent the absence of a value in value types such as int, bool, etc.

Tuple: Tuples allow you to group multiple elements of different types into a single object.
  They provide a lightweight way to create and pass around multiple values.

These non-primitive types provide more complex data structures and functionality beyond the simple values offered by primitive types. 
They are fundamental in C# programming for organizing and manipulating data in a structured manner.













