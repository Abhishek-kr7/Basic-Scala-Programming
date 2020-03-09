/*
====================================
     Match Expression in Scala
====================================

Match Expression in Scala is used to match from given number of Expression
In Scala match expressions are used to select between a list of alternatives
same as multiple if-statements or select statement,

Syntax:

variable match {
    case value1 => statement1
	case value2 => statement2
	case value3 => statement3
}
*/

var age = 18

age match {
  case 20 => println(age)
  case 25 => println(age)
  case 14 => println(age)
  case 18 => println(age)
  case 24 => println(age)
}

/* The Above code will return 18 as we have the expression
case 18 => println(age) in the list of Expression
But what if there is no expression matching to Variable i.e 18
In that case it will throw Exception
To Avoid Exception we can use default value
which is written as _(underScore)
 */

var ages = 28

ages match {
  case 20 => println(age)
  case 25 => println(age)
  case 14 => println(age)
  case 18 => println(age)
  case 24 => println(age)
  case _  => println("default")
}

/* This will return the default as there is no expression
matching to the ages 28 value.
*/

/*
Match statement can be used as an Expression
*/

var newage = age match{
  case 20 => age
  case 25 => age
  case 14 => age
  case 18 => age
  case 24 => age
  case _  => "default"
}

println(newage)

/*
This way we can use the match as an expression to store the
result in a variable
*/

/* To check whether number is Odd or Even

*/

var num = 7

num match{
  case 1 | 3 | 5 | 7 | 9  => println(" is odd")
  case 2 | 4 | 6 | 8 | 10 => println(" is even")
}
