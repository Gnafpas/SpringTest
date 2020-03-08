package test.groovy

import spock.lang.Specification

/**
 * Created by George on 8/3/20.
 */
class FirstSpecification extends Specification{
  def "one plus one should be equals tow"(){
      expect:
          1+1 == 2



  }
}
