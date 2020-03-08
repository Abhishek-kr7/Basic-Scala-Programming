====================================
        Function In Scala
====================================
Syntax:

def functionName(parameters:typeofparameters):returntypeoffunction={
//statements to be executed
}

//Here, the return type of Scala function is Optional
//Other than that "=" operator is also Optional. You can use or you can Skip using =

//Without "="
def sayhello(){
  println("Hello")
}

//Output
Hello
res1: Unit = ()


//With "="

def sayhello1(): Unit = {
  println("Hello")
}

Hello
res2: Unit = ()


//With "=" and without Parameters

def sayhello(): Unit ={
  println("Hello")
}

sayhello()
//Here = and Unit(which is return Type) is Optional
//Note : Function that doesn't return any value also use Unit

//Without = and return type which is default Unit here and Without Parameters
def sayhello1() {
  println("Hello")
}

sayhello()
//Here We have not used = or Unit or return type is optional

//With Parameter

def sum(a:Int,b:Int){
  print(a + b)
}
sum(4,5)
//In above function, we have not used =,return type

def sum1(a:Int,b:Int):Int={
  return a + b
}
sum(9,5)

//We have used the = operator and Return type in Above Function

//Ways of writing Function

def add(a:Int,b:Int): Int={
  return a + b
}

//We can avoid writing return Keyword
//The last line of Function will be returned in Scala if no return key mentioned
def sub(a:Int,b:Int): Int={
  a - b
}

//Small Function can be written in Single line as well
//We can use return keyword or avoid the Return keyword
def multi(a:Int,b:Int): Int= a * b

def div(a:Int,b:Int): Int =  a / b
//If we are certain that the function will return a certain datatype,
// then we can also avoid datatype of return value
def divide(a:Int,b:Int)=  a / b

def square(a:Int)=a*a

println(add(45,45))
println(sub(45,45))
println(multi(45,45))
println(div(45,45))
println(square(3))

//These functions can be written inside an Object and can be called by using object.function

object Math{
  def add(a:Int,b:Int): Int={
    return a + b
  }
  def square(x:Int)= x * x
}

println(Math.add(45,45))

//If a Function inside an object takes only 1 input and return one then that can be called as below
println(Math.square(3))
//Below method can be used to call a function in an object only when it takes one Argument and return one Value
println(Math square 3)

//Default Value in Scala Function
//Default Value can also be provided in Function such that function can use if nothing provided


def addDefault(a:Int = 45,b:Int = 15): Int={
  return a + b
}
def squareDefault(x:Int=4)= x * x

println(addDefault())
println(squareDefault())

//Same way we can use in Object as well

object mathDefault{
  def addDefault(a:Int = 45,b:Int = 15): Int={
    return a + b
  }
  def squareDefault(x:Int=4)= x * x
}

println(mathDefault.addDefault())
println(mathDefault.squareDefault())

//Since no value passed, default value will be used in addDefault and squareDefault function
//We can also provide any value in the Default

println(mathDefault.addDefault(35))

//In this case the passed value will be considered as the value for 1st Argument and the default value
// of 2nd argument will be used
//If we have multiple argument then same way it will be taken, like 1st value for 1 and net value for 2nd
//And so on..


//Function that doesn't return any Value

def noValue(x:Int, y:Int)={
  println(x + y)
}
noValue(100,200)

//Scala provide a very special Function, we can use operators also to create function


object notationdef{
  def +(x:Int,y:Int)=x+y
  def **(x:Int)=x * x
}

println(notationdef.+(45,25))
println(notationdef.**(6))

//Here we have used + for Add and ** for Square which is also correct way of creating function in Scala

def +(a:Int,b:Int): Int ={
  return a + b
}

//It means that Operators in scala are also Function only which takes certain argument and return value.

//Anonymous Function
//Function that doesn't have any name are Anonymous Function
//In Scala, we can create Anonymous function that can perform set of task and these Function can be assigned in a Variable
//We can create above add,subtract etc function as anonymous function

var adds = (x:Int,y:Int) => x + y
var subs = (x:Int,y:Int) => x - y
var muls = (x:Int,y:Int) => x * y
var divs = (x:Int,y:Int) => x / y
var sqrs = (x:Int) => x * x
println(adds(12,12))
println(subs(12,v2 = 12))
println(muls(12,12))
println(divs(12,12))
println(sqrs(12))

//All the Above functions are Anonymous Functions

//Higher Order Functions
//Higher orders functions in Scala are the Functions that takes functions as an Argument 1
// and return Function as a result

//Lets create a function thats take 3 argument
//The First 2 arguments will be the Values,
//The third argument will decide, which operation to be Perfomed

def math(a:Double,b:Double,f:(Double,Double)=>Double): Double= f(a,b)
val add = math(50,20,(a,b)=>a + b)
val sub = math(50,20,(a,b)=>a - b)
val mul = math(50,20,(a,b)=>a * b)
val mins = math(50,20,(a,b)=>a min b)
val maxs = math(50,20,(a,b)=>a max b)
//min - to find the minimum of 2 number
//max - to find the maximum of 2 number

//With Higher order function we can use the function as per our requirement like here we are using math
//Function to Add/subtract/Multiply etc

//When we have multile argument
//Lets consider we have 3 arguments
//We want to perform add/sub/min/max of all the 3 numbers

def math(a:Double,b:Double,c:Double,f:(Double,Double)=>Double): Double= f(f(a,b),c)
//Here we are passing function inside function
//First the a,b value will be operated and then the resultant will again operated with the c value
val add = math(50,20,10,(a,b)=>a + b)
val sub = math(50,20,10,(a,b)=>a - b)
val mul = math(50,20,10,(a,b)=>a * b)
val mins = math(50,20,10,(a,b)=>a min b)
val maxs = math(50,20,10,(a,b)=>a max b)

//Scala provide a wild card feature as well
//Inplace of writing (a,b)=> a + b , we can use wild card _+_ as well which means somethin to be added with Something
//Similarly (a,b)=> a * b can be wriiten as _*_ and so on

val add = math(50,20,10,_+_)
val sub = math(50,20,10,_-_)
val mul = math(50,20,10,_*_)
val mins = math(50,20,10,_ min _)
val maxs = math(50,20,10,_ max _)

//Note: There is space between min/max and _(Underscore)

//Partially Applied Function

val sum = (a:Int,b:Int,c:Int) => a+b+c
println(sum(10,20,30))

//In above anonymous Function, we have taken three arguments and passed exactly same argument to retrieve
//the result from the function
//These type of Functions are Fully applied Function.
//Partially applied function are the one where we pass some argument values and for the remaining we pass
//Wild cards i.e we consider passing values for those argument in later phase

val sums = (a:Int,b:Int,c:Int) => a+b+c
//println(sum(10,20,30))

//Lets create a partial applied function that sum the above with one of the value passed later
val f = sums(10,30, _ :Int)

//Above function states that it will take 10,30 as the a and b value, the _ i.e wild character will be
//used to passed the 3rd value which will be Integer type

println(f(40))

//After running above code, 10,30 will be taken for a & b while 40 will be used in place of _ which will
//The result in the Output as 10+30+40

//Similarly, we can use multiple Wild Card for multile arguments

val f = sums(10,_:Int, _ :Int)

println(f(30,50))

//These types of functions are known as Partial Function.


//Partial function to Log if something happened

To get the Date import

import java.util.Date

def log(date:Date, message:String) ={
  println(date + " " + message)
}

val date = new Date
val newLog = log(date, _:String)

newLog("The message 1")
newLog("The message 2")
newLog("The message 3")
newLog("The message 4")

//This way we can log the Error or something if one of the Function fail or executed.
