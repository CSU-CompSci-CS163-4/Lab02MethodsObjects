# Introduction
This lab contains two files that you will modify, one of which contains our **main** function, MethodsObjects, and another that is an object that you will modify and implement within the **main**. 

This object is a "Pizza" object which holds a single variable, the radius of the pizza. This radius variable can be used in the methods that we create within our Pizza object.

For more information on Methods and Objects, there is background information included below the steps.


The first two steps will be located within the first file **MethodsObjects**.

After completing all of the following methods, in Step 7 you will be expected to test each of the methods, as well as those included within your Pizza object.

## Step 1: calculateSalary(double hourlyWage)
The first method to complete will be calculateSalary, which has a return type of double and takes a single parameter of a double. Within this method we will assume the worker has an hourly wage and works 40 hours for 50 weeks in the year.

This method returns a double which is the product of the hourly wage, a 40 hour week, and 50 weeks.

Given that the parameter provided, hourlyWage, was 12.00. The double 24000.00 would be returned.

When testing you can assign the returned value to a variable for use in the next method.

## Step 2: calculateSalaryTax(double salary, double taxRate)
This method calculates the amount of tax that will be applied onto a given salary and the rate at which it will be taxed, both of these will be passed to the method as parameters.

The taxRate parameter provided will be a whole number(0-100), and will need to be divided by 100 for the proper tax percentile. So if 5.0 is provided as the taxRate, the percentile is 0.05.

Once you have obtained the tax percentile, the specific salary tax can be obtained by multiplying the salary by your calculated tax percentile. Remember to then return this value.

### Steps 3-5 are contained within the Pizza.java file
## Step 3: calculateYearlyPizzaCost(double pizzaPrice) 
You will assemble this method completely on your own, when creating the signature it is recommended to copy and paste the method name and parameters as they are above.

This method will be public, have a return type of double, and takes a single double parameter, pizzaPrice.

After completing the method signature, don't forget to add your curly braces for the methods body to be contained in.

This method will assume that the person we are working with eats a singular pizza every day of the week, all 52 weeks of the year. The pizza price is given as a parameter, and only needs to be multiplied by the amount of days in a year. This value will then be returned.

## Step 4: calculateArea()
This method will use the variable at the beginning of this Pizza class. This method will calculate the area of our pizza object using the radius variable. Referring back to middle school geometry, a circles area is, A = Pi * Radius^2. For our use, pi only needs to be 3.14.

Once you have setup the area calculation, remember to return it.

## Step 5: calculateCostPerUnit(double pizzaPrice)
Within this method you will determine the cost of each unit of the pizza, given the pizza price. In addition to the pizza price, you will also need the are of a pizza, which can be achieved by calling the calculateArea() method within this one, remember to set it to a variable so you can use it.

Once you have obtained the pricePerUnit, remember to return it.

### Steps 6 & 7 will be within MethodsObjects.java
## Step 6: calculateAfterPizzaSalary(double salary, double dailyPizzaCost) 
This method calculates how much money will be left over after their salary has been taxed and has bought a pizza each day in the year.

The parameters provided will be the afterTaxSalary and the yearlyPizzaCost.

The returned value should be the yearlyPizzaCost deducted from the afterTaxSalary.

## Step 7: Testing each of these methods.
Within the **main** method you can see that a couple of test have already been added. It is recommended to test all methods out within this main function. For the methods that reside within the Pizza file you must create an instance of the object.

For now the recommend path of testing is to just print out the value you are verifying. In industry there are many more in-depth and expansive methods of testing.

# Background Information

## Methods
Methods are one of the most important concepts in programming, as they are essentially the "building blocks" of code. As we described the "main" method in the last lab, methods must reside within a class. Methods may or may not also return a single variable. 

Each method begins with a signature, and it contents are denoted by opening and closing curly braces, "{ }".

A method signature has the following format:
``` java
[access modifier] [return type] [method name] (p1Type p1Name, p2Type p2Name, ...) {
    Method Contents

    return value;
}
```
[access modifier]: For now, all of our methods will be **public**, later our methods can also be private or protected.

[return type]: This indicates what variable type must be returned by a method, such as **int**, **String**, **double**, or **void**. The **void** return type is special as it indicates the method does not return anything, in this case it may print useful information or even modify a variable instead of returning one.

[method name]: A method name is only used to indicate what a particular method does and we use this name to call the method in our program. The *camelCase* convention is typically followed for naming methods, so the first letter of the first word is not capitalized, and the following first letters are. Say if we had a method that printed the parameter given to it, a good name may be *printParameter*.

(p1Type p1Name, ...): Parameters are variables given to the method that are required for it to function. The formatting is the variable type, followed by the name that will be used for the variable. You must use a comma inbetween multiple parameters if more than one is required. In the case that our method requires two variables, an **int** and a **String**, our parameter section would look as follows like (int number, String word).

return value: Whenever a return type other than **void** is specified, the method MUST return a value that corresponds to the return type. If you want a **void** method to terminate at a certain point, you can use **return** with no value after it.

Lastly, remember that the entire contents of your method must be encased within curly braces, "{ }".

A short example method that returns the sum of it's two parameters would look like:
``` java
public int addParameters(int p1, int p2) {
    int sum = p1 + p2;
    return sum;
}
```
If we wanted to use this method within our programs **main** method we could call it and assign it like so:
``` java
public static void main(String[] args) {
    int x = 12;
    int y = 3;
    int mainSum = addParameters(x, y);
    //NOTE: when addParameters is called, we set it to an int type as that is the return type of the addParameters method.
    //NOTE: When calling our method, addParameters, we also do not need to specify the variables that are provided, as two int types are expected.
}
```


## Objects

As Java is what is known as an object-oriented programming language, everything relates to an object in some sense.

Almost every object has variables and methods associated with it.

For a real analogy we could say a car is an object, and how a car has a max speed, color, and different parts, each of these could be tied to a variable within an object. A car can also drive, brake, and turn, each of these functions within a car could be tied to a method within an object.

An object is contained within a class, as method naming uses camelCase, objects and classes have the first letter in each word capitalized.

A very simple object may look like:
``` java
public class MyObject {
    int data = 13;
    public void printData() {
        System.out.println(data);
    }
}
```
Now that our object/type, MyObject, has been assembled we need to create an *instance* of the object using the **new** keyword and call our *printData()* method by referring to our newly created instance like so:
``` java
public static void main(String[] args) {
    MyObject obj = new MyObject();
    obj.printData();
}
```
After we call the *printData()* method that is apart of the *MyObject* object/type, our data, 13, will then be printed.

This was only to serve as a small introduction to objects and calling methods that are apart of object, we will greatly expand upon methods and objects within further in this course.
