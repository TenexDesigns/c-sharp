
WE AHVE A SOLUTION EXPLOE TAB , WHICH CONATAINS ONLY ONE PROJECT, TH ONE THAT WE AHVE MADE


solutuion explore
            HELLOW WORLDS
               Properties
                 AssemblyInfo.cs  - This is the indentification for the assmbly that will be produced as a result of  compiling this application. When we compile a console application, we are going to get an excutable, and that is an assembly, that assembly has an identitfiactio
               Refernces - we see any assemblies our application is refencing . This assemblies are part of the .nete framwork, and our application refernces them
                 system.core
                 system.dtaa
               App.config -- Where we store the configuaration for this application. Inside here, we can store connection strings to the databse, or you may want to have some settings in your application
               program.cs -- Where we write our code



program.cs
# Our project is called heloworls, and so visual studio creates a namesspace called helloworld, When we write code in this name space, we have access to any classes we define in this namespace, so if we want to access a classs defined in a diferent namespace, we need to import it,(that namespace) in our code file, that is why we are using the USING name,
#e.g  using System; -- > System is a namespace in .net framwork, where we have all of these basic utility clases and primitive types
#using System.Collections.Generic; - Used to work with lists , collections and so on
#using System.Linq;  - Used to work with data
# using System.Text; - Used to work with text, codiing and stufff like that
# using System.Threading.Tasks;  - Used to build multi threaded applications
#All of thses using statemens


# every console application contains a class Program
#static void Main(string[] args)  - > Is the enrty point to the application, when you run your code, clr excutes the code inside Code inside this Main function


#Static is another topic
#void: means what this fuction returns , which is nothing
#The Main function accepts an argument callled args, which is of type of an array of string i.e string[]
#We have the braceltes to indicte the scope or range if the function, class or namesce
  


using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace hellowoeld
{
	class Program
	{
		static void Main(string[] args)
		{
      Console.writeline("George Gacau is an awesome coder")
		}
	

# To run this program , press ---. ctrl + f5







































































































































































































































...
