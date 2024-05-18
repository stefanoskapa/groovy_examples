/*
In groovy, primitive types are boxed into 
their wrapper equivalents. Same holds true
for number literals!

For floating-point numbers, unless specified otherwise,
Groovy uses BigDecimal which has the higher precission.

*/
int y = 1
println y.class.name

println 1.getClass().getName()
println 1234123412341234123.getClass().getName()
println 532543254325423452345234523453245234523452.getClass().getName()
println 5.5f.class
println 5.5d.class
println 5.5.class

