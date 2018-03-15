import com.example.myapp.demo.ExampleObject
import spock.lang.Specification
import spock.lang.Unroll

class ExampleObjectTests extends Specification{

    @Unroll
    def ExampleObjectConstructor(){
        expect:
        ExampleObject exampleObject = new ExampleObject(a, b)
        exampleObject.getName() == a
        exampleObject.getAge() == b

        where:
          a   | b
        "Jas" | 3
        "Abc" | 4
    }

    def ExampleObjectConstructorWithoutParams(){
        expect:
        ExampleObject exampleObject = new ExampleObject()
        exampleObject.getName() == "Jas"
        exampleObject.getAge() == 3
    }
}