
Sure! Here are some common methods used in a math class in C#, along with code samples to illustrate their usage:

Math.Abs: 
  Returns the absolute value of a number.

int num = -5;
int absValue = Math.Abs(num);
Console.WriteLine(absValue); // Output: 5
  
  
  
Math.Round:
  Rounds a decimal value to the nearest whole number or a specified number of decimal places.

double value = 3.75;
double roundedValue = Math.Round(value);
Console.WriteLine(roundedValue); // Output: 4

double preciseValue = 3.14159;
double roundedPreciseValue = Math.Round(preciseValue, 2);
Console.WriteLine(roundedPreciseValue); // Output: 3.14
  
  
  
  
Math.Floor:
  Returns the largest integer less than or equal to a specified number.

double num = 5.8;
double floorValue = Math.Floor(num);
Console.WriteLine(floorValue); // Output: 5
Math.Ceiling: Returns the smallest integer greater than or equal to a specified number.

double num = 5.2;
double ceilingValue = Math.Ceiling(num);
Console.WriteLine(ceilingValue); // Output: 6
  
  
  
  
Math.Max and Math.Min: 
  Returns the larger or smaller of two specified numbers, respectively.

int num1 = 10;
int num2 = 5;
int maxNum = Math.Max(num1, num2);
int minNum = Math.Min(num1, num2);
Console.WriteLine(maxNum); // Output: 10
Console.WriteLine(minNum); // Output: 5
  
  
  
  
Math.Pow:
  Returns a specified number raised to the power of another specified number.

double baseNum = 2;
double exponent = 3;
double result = Math.Pow(baseNum, exponent);
Console.WriteLine(result); // Output: 8
  
  
  
  
Math.Sqrt:
  Returns the square root of a specified number.

double num = 25;
double squareRoot = Math.Sqrt(num);
Console.WriteLine(squareRoot); // Output: 5
These are just a few examples of the methods available in the Math class in C#. The Math class provides a wide range of mathematical functions that can be useful in various scenarios.































