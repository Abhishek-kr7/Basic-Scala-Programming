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
