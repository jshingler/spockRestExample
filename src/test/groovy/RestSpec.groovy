import spock.lang.Specification

import groovyx.net.http.RESTClient
import spock.lang.*

class RestSpec extends Specification {

    def "Demo Rest Spock Spec and Report"() {
    	given: 'there is a rest endpoint'
    	def client = new RESTClient("http://jsonplaceholder.typicode.com/")

    	when: 'a get is called on posts'
    	def response = client.get(path : "posts")


    	then: 'the status returned is 200 and there are 100 posts'
    	with(response) {
			status == 200
			contentType == 'application/json'
			data.size() == 100
		}

    }
}