/**
 * Created by edara on 1/20/17.
 */
class Example2 {
    static void main(args) {
        long t1 = System.currentTimeMillis()
        String message = "Hello World"
        //def message = "Hello World"
        println(message);

        println("Time Taken (ms) :"+(System.currentTimeMillis() - t1))
    }
}
