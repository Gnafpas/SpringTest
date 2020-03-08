package test.groovy

import spock.lang.Specification
import spock.lang.Unroll

/**
 * Created by George on 8/3/20.
 */
class FirstSpecification extends Specification{
    @Unroll
    def "one plus one should be equals tow"(){
      given:
      int left = 2
      int right = 2

      when:
      int result = left + right

      then:
      result == 4

  }
}
