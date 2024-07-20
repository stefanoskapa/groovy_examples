package com.example

//every read access to a property can be intercepted by overriding
//the getProperty() method

class PropertyDemo {

    def prop1 = "prop1"
    def prop2 = "prop2"
    def prop3 = "prop3"

    def getProperty(String name) {
        println "getProperty() called with argument $name"
        if (metaClass.hasProperty(this,name))
            return metaClass.getProperty(this,name)
        else {
            println "property does not exist"
            return "unknown"
        }
    }
}

def pd = new PropertyDemo()
println pd.prop1
println pd.prop2
println pd.prop3
println pd.prop4