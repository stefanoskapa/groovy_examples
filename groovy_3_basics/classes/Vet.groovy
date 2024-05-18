/*
Compile Animals.groovy with groovyc first!

Properties are private. However, Groovy creates
automatically getters and setters.

Note that with cat.name we are not actually accessing
the property directly, but the corresponding setter
is invoked.
*/

Cat cat = new Cat()
cat.name = "Carmen" 
cat.setAge(3)

cat.showInfo()

cat.colors.class  // ArrayList by default

cat.colors << "black" //special syntax for adding elements
cat.colors << "white"

cat.colors