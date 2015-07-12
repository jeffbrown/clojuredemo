package demo

import demo.pages.AddNumbersPage
import demo.pages.ResultPage
import geb.spock.GebSpec
import grails.test.mixin.integration.Integration

@Integration
class MathSpec extends GebSpec {

    void "test a controller action invoking a clojure function"() {
        when:
        to AddNumbersPage
        addNumbersForm.with {
            x = '101'
            y = '2011'
        }
        addNumbersButton.click()

        then:
        at ResultPage
        result.text() == 'The sum of 101 and 2011 is 2112.'
    }
}
