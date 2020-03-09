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


/*
====================================
         Lists in Scala
====================================
Lists are composed of values linked together. 
All access starts from the head (first element) and follows links. 
Random access takes linear time.
The Fundamental difference between Array and List in Scala is 
Lists are immutable while array are mutable
Lists, like Strings, are immutable
Because all access is via the head, creating a “new” list is a fast operation.
List index start from 0 similar to Array
*/

//Ways of creating List

val mylist : List[Int] = List(1,2,3,4,5,1)
val mylist1 : List[String] = List("Max","Drax","Rex")

println(mylist)
println(mylist1)

/*
Since Lists are immutable, then how can we append the
element in the List
*/
/*
To add a number in the Beginning
There are 2 way we can do it
1. Using Nil
2. Using cons(::)
*/

println(0 :: mylist)
/*
This will result in the list with 0 as first element
But this actually doesnot change the Value, we can create a new List
to store this new value
*/

/*
Using Nil
*/
println(1::5::7::Nil)
/*
This will result in a list with value 1,5,7
*/

/*
Method associated with List can be check using list name with .(dot)
 */
//To get the first Element
println(mylist.head)
//To get the rest of the Element
println(mylist.tail)
//To check whether list is empty or not
println(mylist.isEmpty)

println(mylist.reverse)

//To create a list of uniform Element

println(List.fill(5)(2))

/*
Iterate over a list
We can use foreach keyword for this
for loop can also work to iterate
*/

mylist.foreach(println)

for (item <- mylist){
  println(item)
}

/*
To get the element based on index position
*/

println(mylist(0))

//This will print the element at 0 position in the list

/*
=============================
       Set in Scala
=============================
List and Array can have duplicate element
A set is a collection of Unique elements.
n Scala sets are the un-ordered collections of unique elements of
same data types. Scala Sets can be mutable or immutable.
*/

/*
Creating Set in Scala
Set can be Mutable or Immutable
By Default, set will be Immutable
*/

val myset : Set[Int] = Set(1,2,3,4,5,1)
val myset1 : Set[String] = Set("Max","Drax","Rex")

/*
In myset, even though we have duplicate values
but set will give only unique value and remove duplicate
 */

/*
Creating Immutable Set
*/
var myset2 : scala.collection.mutable.Set[Int] = scala.collection.mutable.Set(1,2,9,7,4,1)
//or
var myset3  = scala.collection.mutable.Set(1,2,3,4,5,1)

/*
Adding element in the Set
We can do it by using + operator
*/

println(myset2 + 10)
println(myset2)

/*
Note : Set are not Ordered , hence we can not perform indexing on set
*/

/*
To check if an element is present in a set or not
*/

println(myset(8))

//This will return true if element present or false if absence

/*
Similar to list, operation like head,tail,isEmpty etc.
can be performed on Set
*/

/*
Unlike List, to concat the set we cannot use concat keyword
However we can use ++ operator for this purpose
*/

println(myset ++ myset1)
//Only unque value will be printed

/*
Methods like intersect,max,min etc can be performed on set
Intersect will return common of two sets
*/

println(myset.intersect(myset2))

/*
Iterate over element in Set
We can use For loop
or
We can use foreach in Set
*/

myset.foreach(println)

for (item <- myset){
  println(item)
}

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
