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
Create a Mutable List
*/

import scala.collection.mutable.ListBuffer

var muteList = new ListBuffer[String]()

/*
This List will be Mutable and we can add or Modify the Elements
*/
