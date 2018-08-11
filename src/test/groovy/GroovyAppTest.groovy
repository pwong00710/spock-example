import spock.lang.Specification

class GroovyAppTest extends GroovyTestCase {
    void setup() {
    }

    void cleanup() {
    }

    def "Hello"() {
        def app = new GroovyApp()
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
        Hello()
    }
}
