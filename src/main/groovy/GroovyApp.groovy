class GroovyApp {
    private String msg

    GroovyApp() {

    }

    GroovyApp(String msg) {
        this.msg = msg
    }

    void hello() {
        // Define variable
        def msg = "Hello 'World'!"
        println(msg)

        println(this.msg)

        // EMBEDDED QUOTES
        println('Hello "World""!')

        // List
        def romanNumber= ['I','II','III','IV','V','VI','VII']
        println("romanNumber.size="+romanNumber.size());
        println("romanNumber="+romanNumber);
        romanNumber.each {s -> println(s)}

        String[] testArray = ['I', 'II','III','IV','V','VI','VII']
        println("testArray.length="+testArray.length);
        println("testArray="+testArray);

        // Map
        def http=[100: 'CONTINUE', 200:'OK', 400: 'BAD REQUEST']
        println("http.status[100]:${http.get(100)}");

        def personDetails = [firstName:'John', lastName:'Doe', age:25]
        println "First Name: ${personDetails.firstName}"
        println "Last Name: ${personDetails.lastName}"
        println "Age: ${personDetails.age}"

        // Integer array
        def a=1..10
        println("a.len:${a.size()}");

        // Boolean Expression
        def nullString = ""
        if (nullString) {
            println("not nullString")
        } else {
            println("nullString")
        }

        def list = []
        if (list) {
            println("not empty list")
        } else {
            println("empty list")
        }
    }

    void doDataTypes() {
        //Example of a int datatype
        int x = 5;

        //Example of a long datatype
        long y = 100L;

        //Example of a floating point datatype
        float a = 10.56f;

        //Example of a double datatype
        double b = 10.5e40;

        //Example of a BigInteger datatype
        BigInteger bi = 30g;

        //Example of a BigDecimal datatype
        BigDecimal bd = 3.5g;

        println(x);
        println(y);
        println(a);
        println(b);
        println(bi);
        println(bd);
    }

    // Default parameter values
    def sum(int a,int b = 5) {
        int c = a+b;
        return c;
    }

    static void main(String[] args) {
        def app = new GroovyApp("Hello World!")
        app.hello()
    }
}
