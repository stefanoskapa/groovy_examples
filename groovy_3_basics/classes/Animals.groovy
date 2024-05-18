/*
In Groovy, all classes and methods are public by default. 
Properties are private.

However, unlike Java, the class name of
a public class doesn't need to match the file name, and we can define multiple
public classes within the same file. 

(this class is used in conjuction with Vet.groovy)
*/

class Cat {
  String name;
  int age;
  def colors = []
  
  void showInfo() {
    println "$name is $age years old"
  }
}

class Dog {

}

class Mouse {

}