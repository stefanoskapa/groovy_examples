/* 
Some Collections methods that use closures
*/

def nums = [1,4,66,4,33,15]

nums.each { println it }

//if we need the index of each element:
nums.eachWithIndex { num, index ->
  println "$index:$num" 
}

//find all elements matching a closure-condition
println nums.findAll { num -> num % 2 == 0 }

// collect
List numsTimesTen = nums.collect { num -> num * 10}
println numsTimesTen
