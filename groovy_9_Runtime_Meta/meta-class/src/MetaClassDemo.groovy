/*
every class has a MetaClass associated with it

 */
class Developer {


}

Developer dan = new Developer()




//Expando represents a dynamically expandable bean
//Expando exp = new Expando()

//we can add members to it
//exp.name = "Dan"
//exp.writeCode = { -> println "$name loves to write code"}
//exp.writeCode

// metaclass is an expando

//this doesnt work:
//dan.name = 'Dan'
//dan.writeCode = { -> println "$name loves to write code"}
//dan.writeCode()

dan.metaClass.name = 'Dan'
dan.metaClass.writeCode = { -> println "$name loves to write code"}
dan.writeCode()

//we can also add members to all instances of a class (be cautious)
String.metaClass.shout = { -> toUpperCase()}
println "hello".shout()