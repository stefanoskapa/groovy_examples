/*
AST Transformations

Compile-time metaprogramming in Groovy allows code generation at 
compile-time. Those transformations are altering the Abstract Syntax Tree (AST) 
of a program, which is why in Groovy we call it AST transformations. 
AST transformations allow you to hook into the compilation process, 
modify the AST and continue the compilation process to generate 
regular bytecode.

https://docs.groovy-lang.org/next/html/gapi/groovy/transform/package-summary.html

*/

import groovy.transform.ToString
import groovy.transform.EqualsAndHashCode

@ToString
@EqualsAndHashCode
class Person {
  String firstname
  String lastname
}

p1 = new Person(firstname: "John", lastname: "Doe")
p2 = new Person(firstname: "John", lastname: "Doe")
println p1


println p1.equals(p2)
