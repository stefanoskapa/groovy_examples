def c = {}

println c.class.name
println c instanceof Closure

//a closure without arguments
def sayHello = {
  println "hello"
}

sayHello()


/* 
a closure with arguments
We separate the args from the method body with
the -> operator
*/
def sayHelloName = { name ->
  println "Hello, $name"
}

sayHelloName("Bob")

/*
An important difference between closures and methods, is that
closures can be passed around.
*/

def nums = [1,2,3,2,4,6,9,8]

nums.each({
  println it
})

def timesFive(num, closure) {
  closure(num * 5)
}

timesFive(10, { println it })

/*
Any method that accepts a closure as its last
parameter, can be written as follows
*/
timesFive(11) {
  println it
}


def dependencies(Closure closure) {
  closure()
}

dependencies {
  println "dependency"
}

10.times { println 'Hello'}

