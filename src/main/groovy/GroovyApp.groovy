import java.time.LocalDateTime

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

        String sample = "Hello world";
        println(sample[4]); // Print the 5 character in the string

        //Print the 1st character in the string starting from the back
        println(sample[-1]);
        println(sample[1..2]);//Prints a string starting from Index 1 to 2
        println(sample[4..2]);//Prints a string starting from Index 4 back to 2
    }

    void doFile(String pathname) {
        File file = new File(pathname);

        file.eachLine {
            line -> println "line : $line";
        }

//        println file.text

        LocalDateTime dt = LocalDateTime.now()

        println "add line: ${dt}"

        file.append(dt.toString()+"\n")
    }

    void doRegularExpression() {
        def regex = ~'Groovy'

        if ('Groovy' =~ 'Groovy') {
            println "'Groovy' =~ 'Groovy'"
        }

        if ('Groovy' =~ 'oo') {
            println "'Groovy' =~ 'oo'"
        }

        if ('Groovy' ==~ 'Groovy') {
            println "'Groovy' ==~ 'Groovy'"
        }

        if ('Groovy' ==~ 'oo') {
            println "'Groovy' ==~ 'oo'"
        }

        if ('Groovy' =~ '^G') {
            println "'Groovy' ==~ '^G'"
        }

        if ('Groovy' =~ 'y$') {
            println "'Groovy' =~ 'y\$'"
        }

        if ('Groovy' =~ 'Gro*vy' || 'Groovy' =~ 'Gro{2}vy') {
            println "'Groovy' =~ 'Gro*vy' || 'Groovy' =~ 'Gro{2}vy'"
        }
    }

    void doExceptionHandling() {
        try {
            def arr = new int[3]
            arr[-1] = 5
            println "arr[2]:${arr[-1]}"
            arr[5] = 5
            println "$arr[5]:arr[5]"
        }catch(ArrayIndexOutOfBoundsException ex) {
            println(ex.toString())
            println(ex.getMessage())
            println(ex.getStackTrace())
        } catch(Exception ex) {
            println("Catching the exception")
        }finally {
            println("The final block")
        }

        println("Let's move on after the exception")
    }

    void doClosure() {
        def str1 = "Hello"
        def clos = { param -> println "${str1} ${param}" }
        clos.call("World")

        // We are now changing the value of the String str1 which is referenced in the closure
        str1 = "Welcome"
        clos.call("World")

        // Passing our closure to a method
        this.display(clos)

        def lst = [11, 12, 13, 14];
        lst.each {it -> println it}
        lst.each {it -> it--; if(it % 2 == 0) println it }

        println lst.find {it > 12}
        println lst.findAll {it > 12}

        def newlst = []
        newlst = lst.collect {element -> return element * element}
        println(newlst)

        def mp = ["TopicName" : "Maps", "TopicDescription" : "Methods in Maps"]
        mp.each {println it}
        mp.each {println "${it.key} maps to: ${it.value}"}
    }

    // Default parameter values
    def sum(int a,int b = 5) {
        int c = a+b;
        return c;
    }

    def display(clo) {
        // This time the $param parameter gets replaced by the string "Inner"
        clo.call("Inner")
    }

    static void main(String[] args) {
        def app = new GroovyApp("Hello World!")
        app.hello()
    }
}
