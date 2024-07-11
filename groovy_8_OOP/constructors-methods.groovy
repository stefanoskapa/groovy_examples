class Person {
    String first,last
    
    def foo() {} //we don't need to declare a return type with def
    def bar(numbers) {} // we don't need to declare parameter types
    
    def foobar(Boolean hasAccess = false) {
      println hasAccess
    } // we can set a default value if no value is supplied
}



// In groovy, you don't need to create constructors

Person p = new Person(first:'John', last:'Doe')
println p.first
println p.last

p.foobar(true)
p.foobar()