import org.junit.Ignore
import spock.lang.Specification

class GroovyAppTest extends GroovyTestCase {
    def app = new GroovyApp()

    void setup() {
    }

    void cleanup() {
    }

    def "Hello"() {
        app.hello()
    }

    def "InvokeMethod"() {
    }

    def "GetProperty"() {
    }

    def "SetProperty"() {
    }

    def "GetMetaClass"() {
    }

    def "SetMetaClass"() {
    }

    void testHello() {
        println("=== testHello ===")
        Hello()
    }

    void testDataType() {
        println("=== testDataType ===")
        app.doDataTypes()
    }

    void testMethod() {
        println("=== testMethod ===")
        println("sum(5):"+app.sum(5));
        println("sum(5,6):"+app.sum(5, 6));
    }

    void testFile() {
        println("=== testFile ===")
        app.doFile(".\\src\\main\\resources\\Example.txt")
    }

    void testRegularExpression() {
        println("=== testRegularExpression ===")
        app.doRegularExpression()
    }

    void testExceptionHandling() {
        println("=== testExceptionHandling ===")
        app.doExceptionHandling()
    }

    void testClosure() {
        println("=== testClosure ===")
        app.doClosure()
    }

    void testJSon() {
        println("=== testJSON ===")
        app.doJSon()
    }
}
