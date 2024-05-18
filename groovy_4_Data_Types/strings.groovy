// Strings in Groovy

// 
def str1 = 'c'
println str1.class  // java.lang.String

def str2 = 'Another string'
println str2.class  //java.lang.String

/*
Double-quoted strings are plain java.lang.String 
if there’s no interpolated expression, but are 
groovy.lang.GString instances if interpolation is present.
*/

def str3 = "John"
println str3.class // still java.lang.String

def str4 = "Hello ${str3}" //
println str4
println str4.class // A GString

def str5 = 'Hello ${str3}' //The ${} expression is not evaluated
println str5





// multiline Strings
def mString1 = '''
Hello
World
'''
print mString1
print mString1.class

def mString2 = """
Hello
${str3}
"""
print mString2
println mString2.class


//dollar slash
//def folder = "C:\users\john" // wont work
//println folder 

folder = "C:\\users\\john" //works
println folder

folder = $/C:\users\john/$ //we don't need to worry escaping anything
println folder

