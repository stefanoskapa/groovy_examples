import groovy.time.TimeCategory
/**
 * within the use block, we can call methods of the category class.
 * This is much better than using String metaclass, because it is
 * more explicit.
 */
use(StringCategory) {
    println "hello world".shout()
}

//there are some built-in Categories

use(TimeCategory) {
    println 1.minute.from.now
    println 10.hours.ago
    
}
