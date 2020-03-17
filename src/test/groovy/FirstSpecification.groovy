package test.groovy

import main.java.SpringBeans.Car
import main.java.SpringBeans.Driver
import main.java.SpringBeans.Wheel
import spock.lang.Specification
import spock.lang.Unroll

/**
 * Created by George on 8/3/20.
 */
class FirstSpecification extends Specification{

    @Unroll
    def "one plus one should be equals tow"(){

        given:
        def list = [1, 2, 3, 4]

        when:
        list.remove(20)

        then:
        thrown(IndexOutOfBoundsException)
        list.size() == 4



    }
    @Unroll
    def "Mock driver class"(){

        Driver driver = Mock(Driver)
        Wheel wheel = Mock(Wheel)
        wheel.wheelCount >> 4

        driver.getDriverLicence() >>> ["AE490427","AE490428","AE490429"]

        Car car = new Car(driver,wheel)
        car.position(2,5)  >> 5

        given:
        when:
            String result = car.getDriver().getDriverLicence()
            String result2 = car.getDriver().getDriverLicence()
            driver.brake()
        then:
            1 * driver.brake()
            result == "AE490427"
            result2 == "AE490428"
            result3== 1

        where:
          result3=1

    }
    @Unroll
    def "Data test"() {

        given:

        when:
        int result = Math.pow(A, B)

        then:
        result == C

        where:
        A | B | C
        1 | 2 | 1
        2 | 2 | 4
        3 | 2 | 9
        3 | 2 | 9

    }

}
