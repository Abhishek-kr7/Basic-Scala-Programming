/*
====================================
         Array in Scala
====================================

Arrays are mutable, indexed collections of values. 
`Array[T]` is Scala's representation.
*/

Way of Creatinga an Array

val/var <arrayname> : Array[Datatype] = new Array[Datatype](length of Array)

val myarray : Array[Int] = new Array[Int](5)

Another way of creating Array
You can directly initialize an Array by adding elements in it 
while creating Array itself

val myarray2 = Array(1,2,3,4,5)

/*
Adding Element in Array
The Index in Array Starts from 0
*/

myarray(0) = 20
myarray(1) = 30
myarray(2) = 40
myarray(3) = 10
myarray(4) = 40

println(myarray)
/*This won't give a proper output
We will use for loop to iterate over the array element
 */

for (item <- myarray){
  println(item)
}

/*
Other way of Iterating over element is
using the length of Array in For Loop
*/

for (item <- 0 to (myarray.length -1)){
  println(myarray(item))
}
/*
This is the Traditional method of
Iterating over the element of Array
*/

/*
If we don't add any element in an array then the
result will be default datatype of that Array
*/

val newarray : Array[Boolean] = new Array[Boolean](5)

for (item <- 0 to (newarray.length -1)){
  println(newarray(item))
}

/*
This will returm false as false is the Default Value
Similarly the result will be 0.0 if it is Float, 0 if Int and so on..
*/

/*
Concatenation of Array
different Arrays having same data types can be concatenated
using concat keyword but before that we need to import below Module first
import Array._
*/

import Array._
val myarray1 = Array(1,2,3,4,5)
val myarray2 = Array(7,2,3,4)

val concatArray = concat(myarray1,myarray2)
/*
Various available methods can be used and viewed by using ArrayName.(dot)
*/
