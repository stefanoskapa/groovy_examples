
// implicit parameter it
def foo = {
  println it
}

foo("Bob")

/*
if we define our own parameter, we can't use
the implicit parameter it anymore
*/
def bar = { name ->
   println name 
}
/*
Here is how we can define a closure that takes 
no params, not even the implicit one
*/
def noParams = { ->
  println "No params"
}

noParams()
//next line will not compile
//noParams(1) 

/*
we can accept multiple parameters, just as
we would in a method. We can also type the parameters
*/
def greet = {String first, String last ->
  println "Hello, $first $last"
}

greet("John", "Doe")

/*
We can define some default values, in case an argument
is not supplied by the caller
*/

greet = { String name, String greeting = "Hey" ->
  println "$greeting, $name"
}

greet("john", "Hello my friend")  
greet("Joe")

/*
Closures with varargs
*/

def concat = { String... args ->
  args.join('')
}

println concat("J","o","h","n")

/*
some useful closure methods
*/
def method(Closure c) {
  println c.maximumNumberOfParameters
  println c.parameterTypes
}

method(concat)
method(greet)

def closure1 = {int x, int y ->
  println x + y
}

method(closure1)