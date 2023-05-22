

    getters & setters = add security to fields by encapsulation
                        They are accessors found within properties

            properties = combine aspects of both fields and methods (share name with a field)
            get accessor = used to return the property value
            set accessor = used to assign a new value
            value keyword = defines the value being assigned by the set (parameter)



            
            using System;

namespace MyFirstProgram
{
    class Program
    {
        static void Main(string[] args)
        {
            //getters & setters = add security to fields by encapsulation
            //                    They're accessors found within properties

            // properties = combine aspects of both fields and methods (share name with a field)
            // get accessor = used to return the property value
            // set accessor = used to assign a new value
            // value keyword = defines the value being assigned by the set (parameter)
            
            Car car = new Car(400);

            car.Speed = 1000000000;

            Console.WriteLine(car.Speed);

            Console.ReadKey();
        }   
    }
    class Car
    {
        private int speed;

        public Car(int speed)
        {
            Speed = speed;
        }

        public int Speed
        {
            get { return speed; }  //READ
            set                   
            {
                if (value > 500)
                {
                    speed = 500;
                }
                else
                {
                    speed = value;  //WRTE
                }
            }
        }

    }
}



MORE EXPLANATION
**************************************************************************************************************************************************************************

In C#, getters and setters are used to encapsulate the access to class properties. 
They provide control over how the properties are accessed and modified, allowing you to enforce data validation, apply business rules,
and maintain the integrity of the objects state. Getters and setters are implemented using the concepts of properties.

To create a property with getters and setters in C#, you define a public property with a get accessor and/or a set accessor.
The get accessor retrieves the value of the property, and the set accessor assigns a new value to the property. Heres an example:


class Person
{
    private string name;
    private int age;

    public string Name
    {
        get { return name; }
        set { name = value; }
    }

    public int Age
    {
        get { return age; }
        set { age = value; }
    }
}
In the above code, we define a Person class with private fields name and age.
We then define public properties Name and Age with get and set accessors.
The get accessor returns the value of the corresponding field, and the set accessor assigns a new value to the field.

You can use the properties to access and modify the values of the private fields. Heres an example:


Person person = new Person();
person.Name = "John";
person.Age = 25;

Console.WriteLine($"Name: {person.Name}");  // Output: Name: John
Console.WriteLine($"Age: {person.Age}");    // Output: Age: 25

In the above code, we create an instance of the Person class and use the properties Name and Age to set and get the values 
of the private fields. The properties provide a convenient and controlled way to access and modify the objects state.

Getters and setters have several uses and applications in C#:

Encapsulation: Getters and setters encapsulate the access to class properties, allowing you to control
how the properties are accessed and modified. They help in enforcing data validation, maintaining the objects integrity, and hiding the implementation details.

Data Validation: Setters provide an opportunity to validate the input before assigning it to the property. 
You can check if the value meets certain criteria or satisfies business rules, and take appropriate actions if the validation fails.

Property Calculations: Getters can be used to calculate and return a derived value based on the current state of the object. 
For example, you can have a TotalPrice property that calculates the total price based on the quantity and unit price of an item.

Access Control: Getters and setters allow you to control the access level of properties. You can make the get accessor public for 
read access and restrict the set accessor to private or internal to limit write access.

Properties with getters and setters provide a clean and controlled way to access and modify the state of an object in C#.
They promote encapsulation, data validation, and maintainability of the code, making it easier to work with complex data structures 
and maintain the integrity of objects.










MORE EXPLANATION
**************************************************************************************************************************************************************************

  
  In C#, getters and setters are used to control access to class properties. They are also known as 
accessors (getters) and mutators (setters). By using getters and setters, you can protect your data and validate
the values before setting them. This allows for better control and flexibility in your code. codeeasy.io, freecodecamp.org

Heres an example of a simple C# class with a property Age that uses a getter and a setter:

public class Person
{
    private int _age;

    public int Age
    {
        get
        {
            return _age;
        }
        set
        {
            _age = value;
        }
    }
}
In this example, the private field _age is used to store the value of the Age property. 
The get block is executed when the property is read, 
and the set block is executed when the property is assigned a new value. codeeasy.io

To use the getter and setter, you can create an instance of the Person class and access the Age property:

Person person = new Person();
person.Age = 25;
Console.WriteLine(person.Age); // Outputs "25"
Getters and setters allow you to implement custom logic when accessing or modifying a property.
For example, you can validate the value before setting it, as shown in the following modified Person class:

public class Person
{
    private int _age;

    public int Age
    {
        get
        {
            return _age;
        }
        set
        {
            if (value >= 0 && value <= 120)
            {
                _age = value;
            }
            else
            {
                throw new ArgumentException("Invalid age value");
            }
        }
    }
}
In this example, the setter checks if the provided value is within a valid range (0 to 120) before setting 
the _age field. If the value is not within this range, an exception is thrown. This provides better control and validation for the Age property. codeeasy.io

In summary, getters and setters in C# are used to control access to class properties, allowing for better data protection, 
validation, and flexibility in your code. They can be easily implemented and used to define custom logic when accessing or modifying properties.






































































































































































































...
