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
