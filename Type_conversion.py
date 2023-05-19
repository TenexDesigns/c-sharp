Type conversion

Implicit type conversion
Explicyt type conversion   (casting)
Conversion between non-compatible types 



Implict type conversion  -- Occurs when there is an accsurance of o datalosss

byte b = 1;                                        oooooo1
int i = b;           oooooo0  ooooooo   ooooooo    oooooo1



EXPLICIT CONVERSION  -- There is a chanceo of dataloss if i is >255, since values above 255 cant be stiored in a byte

int i =34
byte b = i

To do this explict conversion, we have to tell the comilwwr , we are awaree of the dataloss that may occur and we wish to contune with the operation, by casting the data typ e befeore the one we want to convert it itnto.

int i =34
byte b = (byte)i




NON- CONVETIBLE YPES

string s = "1"

int i = Convert.ToInt32(s);

int j = int.Parse(s);



METHOD SIN THE CONVERT CLASS
 ToByte()  - to byte
  ToInt16()  - to short
  ToInt32() - to integer
  Toint64() - to long
  


MORE EXPLANATION
------------------------------------------------------------------------------------------------------------------------------------------------------------------

In C#, type conversion can occur implicitly or explicitly. Implicit type conversion, also known as implicit casting,
happens automatically by the compiler when there is no risk of data loss. Explicit type conversion, also called explicit casting, 
requires the programmer to explicitly specify the conversion and may result in data loss or potential exceptions.

Implicit Type Conversion:
Implicit type conversion occurs when there is no risk of losing data during the conversion. Here's an example:

int myInt = 10;
double myDouble = myInt;  // Implicit conversion from int to double
Console.WriteLine(myDouble);  // Output: 10.0
In this example, the int value 10 is implicitly converted to a double. 
Since the conversion is widening (from a smaller type to a larger type), there is no loss of data.

Explicit Type Conversion (Casting):
Explicit type conversion, or casting, is required when there is a potential loss of data during the conversion,
or when converting between non-compatible types. Here are a couple of examples:

double myDouble = 10.5;
int myInt = (int)myDouble;  // Explicit cast from double to int
Console.WriteLine(myInt);  // Output: 10 (decimal portion is truncated)

long myLong = 123456789;
int myInt = (int)myLong;  // Explicit cast from long to int
Console.WriteLine(myInt);  // Output: -539222987 (possible loss of data)
In the first example, we explicitly cast a double to an int. The decimal portion is truncated, 
and the value becomes 10. In the second example, a long value is explicitly cast to an int. 
Since the long range is larger than the int range, there is a potential loss of data, and the result is implementation-dependent.

Conversion between Non-Compatible Types:
Sometimes, you may need to convert between types that are not directly compatible. 
In such cases, you can use the various conversion methods or constructors provided by the types. Here's an example:

string myString = "123";
int myInt = Convert.ToInt32(myString);  // Conversion using Convert.ToInt32()
Console.WriteLine(myInt);  // Output: 123
In this example, we convert a string representation of an integer to an int using the Convert.ToInt32() method.

Its important to note that converting between non-compatible types may result in exceptions if the conversion is not possible. 
To handle potential conversion errors, you can use techniques like TryParse() methods or exception handling constructs like try-catch.

Overall, type conversion in C# allows you to convert values between compatible types, either implicitly or explicitly, based on the requirements of your program.





















































































...
