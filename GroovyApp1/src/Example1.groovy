/**
 * Created by edara on 12/10/16.
 */
class Example1 {
    static void main(String[] args) {
        println("Hello ");
        def methods = new SampleMethods();
        methods.repeat("Hello Hareen", 3);
        methods.repeat("Hello Lakshmi", 4);
        println "1 ------------"
        methods.testArrayList();
        println "2-------------"
        methods.testMap()
        println "3 ------------"
        def exciteClosure = methods.testclosure()
        println exciteClosure("Hareen");
        println "4 --------------"
        methods.param1?.toUpperCase();
        println "5 --------------"
        println methods
    }
}

class SampleMethods {
    def param1

    def getParam1(){
        param1?.toUpperCase()
    }
    def repeat(val, count=5) {
        for(i in 1..count){
            println val
        }
    }
    String toString() {
        getParam1()
    }
    def testArrayList() {
        def coll = [1,"Java", 2,"Golang", 3,"Groovy"];
        assert coll instanceof Collection;
        assert coll instanceof ArrayList;
        for(i in coll){
            println i
        }
    }
    def testMap() {
        def hash = [name:"hari", "id":3, 1:"door", 2:"vault"]
        for (i in hash.keySet()){
            println i.class
            println hash[i]
            println hash[i].class
        }
    }
    def testclosure() {
        def pre = "Hello";
        def excite = { word -> return pre +" "+ word}
        return excite;
    }
}