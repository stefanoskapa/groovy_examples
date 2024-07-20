package com.example

class InvokeDemo {

    def invokeMethod(String name, Object args) {
        return "called invokeMethod $name $args"
    }

    def test() {
        return "method exists"
    }
}

def invokeDemo = new InvokeDemo()

assert invokeDemo.test() == "method exists"


println invokeDemo.someMethod()

