/*
====================================
        String In Scala
====================================
*/

/*
Syntax:
val/var <name> : String = "String data"
*/

//Immutable String

val mystring1 : String = "This is a string variable in scala" 

//Mutable String

var mystring2 : String = "This is a string variable in scala" 

println(mystring)

/*
Method on String Variable
*/

/*
To know which are all methods can be used on a String
type the String variable and dot(.) to see available methods
Methods like length,concat,indexOf,charAt etc can be used on String
*/

println(mystring1.length())
println(mystring2.concat(mystring1))
println(mystring1 + mystring2)

2. Adding string/float/double/integers using printf 

printf("A string is %s , an integer %d , a float %f","Abhishek",10,2.35)

A string is Abhishek , an integer 10 , a float 2.350000

where 
%s is for string
%d is for integer
%f is for double/float

/*
=======================================
         STRING INTERPOLATION
=======================================

1. Interpolating Object into an String

It can be Understand in an easy way that how to pass the Variable inside an string
*/

val name = "Ankur"
val age = 28
val marks = 98.8

/* Method 1
Using + operator to add Variable value in String
 */
println(name + " is " + age + " year old and secured " + marks)

/* Method 2
Using s-string i.e s in the beginning of the String
With s-string, we can pass the Variable in the String with $ symbol
 */
println(s"$name is $age year old and secured $marks")

/*Method 3
Using f-string i.e f in the beginning of the String
With f-string, we can control the value more by adding %d,%s,%f to 
control which datatype should be passed in the String Variable
%s is for string
%d is for integer
%f is for double/float
 */
println(f"$name%s is $age%d year old and secured $marks%f")
println(f"$name%s is $age%d year old and secured $marks%1.2f") 
//To adjust Precsion value to print only till 2 decimal we used 1.2f above
//println(f"$name%s is $age%d year old and secured $marks%d") 
//This will give error as marks is of Float value

/*Method 4
Using raw method.
In this method we can use to get the String data as it is i.e raw format
if there is any special character, it will print those as well.
This method is used when we have to print quotes, \n etc character along with String
*/

println(raw"$name is $age year old \nand secured $marks")
/*Above println statement will return the output 
Ankur is 28 year old \nand secured 98.8
*/

println(s"$name is $age year old \nand secured $marks")
/* This will return the Output in 2 line i.e \n will change the line from and ...
Ankur is 28 year old
and secured 98.8
 */

/*So to print the String as it is along with the Variable value, 
Its good to Use raw
To print the variable based on the Datatype, 
Its good to Use f-String
 */

/* Multi Line String
To write Multi line String, We can use """(triple double quotes).
*/

println(raw"""$name is $age
       year old and secured
       $marks
       """)


println(raw"""$name is $age
       year old and secured
       $marks
       """.stripMargin)
