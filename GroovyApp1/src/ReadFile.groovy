/**
 * Created by edara on 12/10/16.
 */
class ReadFile {
    static void main(String... args) {
        File file = new File("/Users/edara/scripts/java/GroovyApp1/out/production/GroovyApp1/Example1.class");
        file.eachLine {line -> println("->"+line)}
    }

}
