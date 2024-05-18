/*
  Some basic control structures
  
*/


/*
if/if-else

They are pretty much like Java, but 
"Groovy truth" has some peculiarities:

  - null is false
  - An empty string is false
  
*/
String name = null
if (name) {
  println "name variable has a value"
} else {
  println "name variable has no value"
}

name = ""
if (name) {
  println "name variable has a value"
} else {
  println "name variable has no value"
}

/* while
while loops are also like in Java
*/
int i = 1
while (i < 10) {
  print "$i "
  i++
}

/*
for in list
*/
def list = [1,2,3,4,5]
for ( num in list) {
  println num
}

/*
We can also iterate a list
with the help of closures (covered later)
*/
list.each {println it}
