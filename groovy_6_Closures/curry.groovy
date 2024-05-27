/*
  In Groovy, currying refers to the concept of partial application. 
  It does not correspond to the real concept of currying in functional 
  programming because of the different scoping rules that Groovy applies 
  on closures. Currying in Groovy will let you set the value of one parameter 
  of a closure, and it will return a new closure accepting one less argument.
*/

def log = { String type, Date createdOn, String msg ->
  println "$createdOn [$type] - $msg"
}

log("DEBUG", new Date(), "First debug statement")

def logDebug = log.curry("DEBUG")

logDebug(new Date(), "Second message")

def logDebugTime = logDebug.curry(new Date())

logDebugTime "Third message"

/*
rcurry enables right-to-left currying
ncurry enables index-based currying 
*/

//rcurry
def logHello = log.rcurry("Hello world")
logHello("INFO", new Date())

//ncurry

def logNow = log.ncurry(1, new Date())
logNow("DEBUG", "Another message")
