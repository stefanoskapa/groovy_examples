/*
In Groovy, every exception is optionally on the method signature.
*/

def foo() {
  throw new Exception("foo");
}

List log = []

try {
  foo()
} catch( Exception e) {
  log << e.message
} finally {
  log << 'finally'
}

println log