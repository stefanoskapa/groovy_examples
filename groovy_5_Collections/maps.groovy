/*
maps
the default implementation is a java.util.LinkedHashMap
*/

def map = [:] //represents a map
println map
println map.getClass().getName() // ! explained later


def person =[first:"John", last:"Doe"] // map keys are strings by default
println person 


/* 
We can access by key name
Note: Normally, the dot operator results in calling the
corresponding getter. With maps this is different, we are
accessing the map key. This is why
person.class.name wont work.
*/

println person.first

person.email = "john@doe.com"
println person


def phone = "PhoneNr"
person.(phone) = "123123123" //we need to escape the identifier in this case with ()
println person 


// looping
for (entry in person) {
  println entry
}

for (key in person.keySet()) {
  println key
}
