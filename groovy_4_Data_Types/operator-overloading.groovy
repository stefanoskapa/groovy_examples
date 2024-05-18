/*
Groovy allows operator overloading by implementing
the corresponding method.
*/


def a = 2
def b = 5
println a + b
println a.plus(b) //this is actually happening behind the scenes

def s1 = "Hello"
def s2 = " world!"
println s1 + s2
println s1.plus(s2) //same here

class Account {
  BigDecimal balance
}

Account savings = new Account(balance:100.00)
Account checking = new Account(balance:500.00)

//uncomment following line and observe output
//println savings + checking


class Account2 {
  BigDecimal balance
  
  Account2 plus(Account2 other) {
    return new Account2(balance: this.balance + other.balance)
  }
}

Account2 savings2 = new Account2(balance:100.00)
Account2 checking2 = new Account2(balance:500.00)

Account2 newAcc = savings2 + checking2
println newAcc.balance

