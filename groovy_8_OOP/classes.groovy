
/*
By default every class is public.
Fields with no access modifier are private and have setters and getters
(Inspect AST to demonstrate it)
If we just need a private field without getters/setters, we have to
define "private" explicitily.
We can also define fields without a type

It is possible to omit the type declaration of a field. This is however 
considered a bad practice and in general it is a good idea to use strong 
typing for fields
*/
class person {
  String firstName
  def dob
  private lastName //dont do this!
}