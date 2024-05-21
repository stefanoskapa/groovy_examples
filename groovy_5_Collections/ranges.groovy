/*
Ranges

A range is simply a list of items that we are going to iterate over.
Range inherite from Iterable and Collection
*/

// we specify a range with the double dot operator
Range r = 1..10
println r.class.name
println r.from //shows the start value
println r.to //shows the end value

//half-exclusive range
Range p = 1..<10
println p.class.name
println p.from //shows the start value
println p.to //shows the end value

assert (0..10).contains(0)
assert (0..<10).contains(10) == false

Date today = new Date()
Date oneWeekAway = today + 7

println today
println oneWeekAway
println ""

Range days = today..oneWeekAway
days.step(2, {println it})


