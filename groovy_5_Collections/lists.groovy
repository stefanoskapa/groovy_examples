/*
Groovy doesn't create any new collection classes,
but it makes it easier to work with the existing 
Java Collections

*/


def nums = [1,2,3,4,5,6,7,6,4,3,4]
println nums
println nums.class.name

//we can choose a different collection with "as"
def nums2 = [1,2,3,4,5,6,7,6,4,3,4] as LinkedList
println nums2
println nums2.class.name

// add |remove | get |clear
nums.push(100)
println nums

nums.putAt(0,200)
println nums

nums[0] = 23
println nums

println nums + 22
println nums //unchanged

println nums + [55,66]
println nums //unchanged

nums << 123
println nums

nums.pop()
println nums

println nums - 4 //removes all occurences of 4
println nums //unchanged

println nums[1]
println nums.getAt(1)
println nums.getAt(1..6)


// looping
for (x in nums) {
  println x
}

//flattening will turn multidimentional arrays into 1-D arrays
nums << [3,4,5]
nums << [1,2]
println nums.flatten()
println nums.unique()

def numbers = [1,1,2,2,3,3,4,4] as Set
println numbers











