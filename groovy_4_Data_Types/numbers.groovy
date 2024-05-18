
// If an operant is a float or double, the result is a double
float a = 3.14
println a.class
(a + a).class

/* 
The division operator / produces a double result if either 
operand is a float or double, and a BigDecimal result otherwise
*/

def div = 1 / 2
println div
println div.class
//if we need integer division, we can call Number.intdiv()
println 1.intdiv(2)
println 1.intdiv(2).class

//GDK methods
println 2 == 2.5.toInteger()

println '3.14'.isNumber()
println 5 == '5'.toInteger()

// times, upto, downto, step

20.times {
  print '-'
}

1.upto(9) {
  print it
}

9.downto(1) {
  num -> print num
}

0.step(1,0.1) {
  print "$it "
}
