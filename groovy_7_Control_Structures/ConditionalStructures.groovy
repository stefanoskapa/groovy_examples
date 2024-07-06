// elvis operator

def msg
def output = (msg != null) ? msg : 'default message...'
println output
/*
 the same using the elvis operator
 if (msg) evaluates to true (according to groovy truth) then 
 the value of msg will be used.
*/
output = msg ?: 'default message'
println output


/*
The switch statement has some interesting enhancements
compared to the Java switch.
*/

def num = 4.toFloat()

switch (num) {

  case 1: 
    println "1"
    break
  case 2:
    println "2"
    break
  case 1..5:
    println "Within the 1-5 range"
    break
  case Float:
    println "It's a float"
    break
  case [1,3,5]:
    println "is in [1,3,5]"
    break
  default:
    println "default"
}


// in

def validAges = 18..35
def someAge = 19
println someAge in validAges

