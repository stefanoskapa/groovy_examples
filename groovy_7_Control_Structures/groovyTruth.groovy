/*
Groovy Truth

Type                         Truth evaluation criteria
======================================================
Boolean                      boolean true
Matcher                      has a match   
Collection                   is not empty
Map                          is not empty
String                       is not empty
Number, Character            Number non zero
None of the above            non null

*/

assert true
assert !false

assert ('a' =~ /a/)
assert !('a' =~ /b/)

assert [1]
assert ![]

assert [1:'one']
assert ![:]

assert 'name'
assert !''

assert 1
assert !0

assert new Date()
assert !null 