/**
 * Created by edara on 12/10/16.
 */
class Fibonnacci {
    static void main(String... args) {
        def current = 1
        def next = 1
        10.times {
            print current + ' '
            def newCurrent = next
            next = next + current
            current = newCurrent
        }
        println ''
    }
}
