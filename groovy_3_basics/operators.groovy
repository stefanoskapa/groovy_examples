/*
Operators
https://groovy-lang.org/operators.html
*/

// Safe Navigation Operator
String str = null
String newstr = str?.toUpperCase() //wont throw NPE!
println str

// power
println 2 ** 4
int a = 3
a **= 3
println a

//elvis operator
singer = ""
name = singer ?: "anonymous"
println name



