package test.groovy

import main.java.Car
import main.java.Driver
import spock.lang.Specification
import spock.lang.Unroll

/**
 * Created by George on 8/3/20.
 */
class FirstSpecification extends Specification{

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
        driver.getDriverLicence() >>> ["AE490427","AE490428","AE490429"]

        Car car = new Car(driver)
        car.position(2,5)  >> 5

        given:
            int left = 2
            int right = 5

        when:
            String result = car.getDriver().getDriverLicence()
            String result2 = car.getDriver().getDriverLicence()
//            car.speed()
            driver.brake()

        then:
//            1 * car.speed()
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
        int a
        int b
        int c

        when:
        int result = Math.pow(A, B)

        then:
        result == C

        where:
        A | B | C
        1 | 2 | 1
        2 | 2 | 4
        3 | 2 | 9
    }

}
