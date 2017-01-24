/**
 * Created by edara on 12/10/16.
 */
class Factorial {
    static void main(String... args) {
        long num = 20;
        println(factorial(num))

    }
    static factorial(long num) {
        if(num > 1) {
            return num * factorial(num-1);
        }
        return 1;
    }
}
