/*
Java is a statically-typed language.

Groovy is dynamically-typed language with 
optional static typing.

Statically-typed languages perform type checking 
at compile time and require you to declare the 
data types of your variables before you use them.

Dynamically-typed languages perform type checking 
at runtime, and don't require to declare the 
data types of variables before using them.

In sort, everything in Groovy is a Java Object.
*/

byte b = 10
println b.class

float f = 3.14
println f.class

println 10.class //Integer is the default for integers
println 1000000000000.class
println 10000000000000000000000000000000.class

//BigDecimal is the default for floating point values
println 3.14.class 

/* 
As mentioned, in Groovy we have the option
of declaring a variable without a type.
*/

def x = 10
println x.class
x = "Bob"
println x.class


/*
TIP: If you know the type and the type is not
going to change, its a good practice to 
type your variables.
*/