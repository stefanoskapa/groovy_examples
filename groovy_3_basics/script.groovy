/*
Groovy supports both scripts and classes. 
A script can be considered as a class without needing to declare it.

A groovy.lang.Script is always compiled into a class. The Groovy compiler 
will compile the class for you, with the body of the script copied into 
a run method.

 - It is possible to define methods into a script
 - Variables in a script do not require a type definition.


*/

println add(5,5)

int add(x,y) {
  x + y
}