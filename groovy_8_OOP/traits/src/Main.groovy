/*

Traits are a a structural construct of the language which allow:

 - composition of behaviors
 - runtime implementation of interfaces
 - behavior overriding
 - compatibility with static type checking/compilation

They can be seen as interfaces carrying both default implementations and state.

*/

static void main(String[] args) {

  Bird b = new Bird()
  println b.fly()
  println b.speak()
}