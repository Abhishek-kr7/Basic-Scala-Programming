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

/*
====================================
        WHILE LOOP
====================================

While loops allow to run certain piece of code repeatedly as long as
the condition matches to true
In while loop , initialization and increment are the 2 necessary thing 
other wise loop may run to infinite
 */

/*
Syntax:
while(condition){
Statement
increment the conditional value
}
 */

var z = 0

while(z < 10){
  println(z)
  z += 1
}

/*
====================================
        DO WHILE LOOP
====================================
While loop doesnot run until the condition matches.
It wil check the condition first and then will go inside the loop.
But in some cases we need to run the statement at least once even when
condition does not matches
Do while loop can help in this condition
Do while will run the statement first inside the do{} and then will check
for the condition.
*/

var n = 0
do {
  println("n is zero")
  n += 1
} while (n < 0)

/*
Even though the Condition doesnot matches, the statement will print
At least one time
*/

/*
====================================
        FOR LOOP
====================================
Syntax
for(iterator <- iterable){
Statement
}
where <- is used as a generator or IN(we can say in general)
*/

for (i <- 1 to 5){
  println("i using 'to' method " + i)
}

/*
Another method that we can use to iterate over is 'until'
Keyword
 */

for (i <- 1 until 5){
  println("i using method 'until' " + i)
}

/*
Note : Until will print only 1 to 4
 */

/*
Multiple range can also be used in for loop
 */

for (i <- 1 to 9; j <- 1 until 3){
  println("i is : " + i + " j is : " +j)
}

/*
Applying for loop on List
 */

val lst = List(1,2,3,5,6,4,7,2,5)

for (i <- lst) {
  println("i value from list " + i)
}

/*
Filtering using For Loop
To print value from the list less than 6
 */

for (i <- lst; if (i < 6)) {
  println("filtered i value from list " + i)
}

/*
Storing the result in a variable
we can use 'yield' keyword for this
Replace the () with {}

To filter the number less than 6 and square them and
store them in a variable
*/

val result = for {i <- lst; if (i < 6)} yield {
 i * i
}

/*
This will return the List of square of integer
Number less than 6 from the lst List
*/



