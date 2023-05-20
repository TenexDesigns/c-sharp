Certainly! Here are some common string methods in C# along with code samples to demonstrate their usage:

string.Length: Returns the number of characters in a string.

string str = "Hello, World!";
int length = str.Length;
Console.WriteLine(length); // Output: 13
  
  
string.Substring:
  Retrieves a substring from a string, starting at a specified index.

string str = "Hello, World!";
string substring = str.Substring(7);
Console.WriteLine(substring); // Output: World!
  
  
string.ToLower and string.ToUpper:
  Converts a string to lowercase or uppercase.

string str = "Hello, World!";
string lowercase = str.ToLower();
string uppercase = str.ToUpper();
Console.WriteLine(lowercase); // Output: hello, world!
Console.WriteLine(uppercase); // Output: HELLO, WORLD!
  
  
string.Replace:
  Replaces all occurrences of a specified substring with another substring.

string str = "Hello, World!";
string replacedString = str.Replace("World", "Universe");
Console.WriteLine(replacedString); // Output: Hello, Universe!
  
  
string.Split: 
  Splits a string into an array of substrings based on a specified delimiter.

string str = "Hello, World!";
string[] words = str.Split(','); // Splitting at the comma
Console.WriteLine(words[0]); // Output: Hello
Console.WriteLine(words[1]); // Output: World!
  
  
string.Contains: 
  Checks if a string contains a specified substring.

string str = "Hello, World!";
bool containsWorld = str.Contains("World");
Console.WriteLine(containsWorld); // Output: True
  
  
string.StartsWith and string.EndsWith:
  Checks if a string starts or ends with a specified substring.

string str = "Hello, World!";
bool startsWithHello = str.StartsWith("Hello");
bool endsWithWorld = str.EndsWith("World");
Console.WriteLine(startsWithHello); // Output: True
Console.WriteLine(endsWithWorld); // Output: False
  
  
string.Join: 
  Concatenates an array of strings into a single string, using a specified separator.

string[] words = { "Hello", "World" };
string joinedString = string.Join(", ", words);
Console.WriteLine(joinedString); // Output: Hello, World
These are just a few examples of the many useful string methods available in C#. String manipulation is a common task in programming, and these methods can help you work with strings more effectively.















































































...
