/*
=====================================
            Tuple in Scala
=====================================

 In Scala Tuples are the collections of fixed sized
 elements of different datatypes. Scala Tuples  is immutable.
 */

//Creating Tuples

val mytuple = (1,2,3,"Hello",1.2)
//Tuple of 2 element
val mytuple1 = Tuple2(1,2)
//Tuple of 3 Elements
val mytuple2 = Tuple3(1,2,"Mark")
/*
While creating a fixed element of tuple, we need to specify
the size along with the Keyword Tuple(like Tuple2 for 2 element,
Tuple3 for 3 element
Also we cannot go beyond Tuple22
*/

/*
Accessing Elements of Tuple
To access elements of tuple we can use _1, _2 etc..
After creating Tuple those many numbers of _ will be available as
methods starting with _1
*/

println(mytuple._1)
println(mytuple._2)
println(mytuple._3)
println(mytuple._4)

/*
To Iterate over tuple
For this we have a method
productIteratore.foreach
 */

mytuple.productIterator.foreach{
  i => println(i)
}

/*
Other way of Creating a Tuple is using -> symbol
 */

println(1 -> "Tom")
//But this way is applicable only for 2 elements

/*
Tuple inside a tuple
*/

val tupletuple = new Tuple3(1,"Hello",(2,3))
/*
Accessing the tuple element inside a tupletuple
Fetching 3 from the tupletuple
*/

println(tupletuple._3._2)
