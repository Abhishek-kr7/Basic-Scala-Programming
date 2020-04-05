/*
====================================
        LOOPS In Scala
====================================

Loops :

IF-ELSE LOOP
WHILE LOOP
DO-WHILE LOOP
FOR LOOP

====================================
        IF ELSE LOOP
====================================
*/

/*
Syntax :
if(Condition){
   Statement
} else {
Statement
}
 */

val x = 10

if (x == 20){
  println("x is 20")
}

if (x == 20) {
  println("x is 20")
} else {
  println("x is not 20")
}

//OR 

if (x == 20) 
{
  println("x is 20")
} 
else 
{
  println("x is not 20")
}

//Both of the Above code is Correct

/*
We can directly store the resultant in a variable it self
We can create an empty mutable variable and store the resultant into
that rather than printing it from the loop
*/

var result = ""

if(x == 20){
  result = "x is 20"
} else {
  result = "x is not 20"
}

println(result)

/* The above line of code can be written in a Single line and can store the
result in a variable
*/

val y = 20

val results = if (y == 20) "y is 20" else "y is not 20"
println(results)

/*
Notice that we have taken val i.e immutable variable.
This way it is over-writing the Existing variable
*/

/*
And Or Statement when we have more than one Condition
*/

val a = 20
val b = 30

if (a == 20 && b == 30){
  println("a is 20 and b is 30")
}else{
  println("value of a and b is other than 20 and 30")
}

if (a == 20 || b == 40){
  println("a is 20 and b is 30")
}else{
  println("value of a and b is other than 20 and 30")
}

/*
And condition check for both the condition to be true
If condition matches, first statement will print otherwise
2nd Statement will be printed
OR requires any of the true condition
*/

/*
else-if Loop
*/
val x = 24
val y = 23
val z = 25

if(x > y && x > z){
  println("X is the Biggest Number")
}else if(x > y && x < z){
  println("Z is Greatest")
}else if(x < y && y > z){
  println("Y is the Greatest")
}
