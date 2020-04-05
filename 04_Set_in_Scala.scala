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
