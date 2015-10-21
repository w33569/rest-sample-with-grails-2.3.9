package rest.sample

import grails.rest.Resource

@Resource(formats = ["json", "xml"])
class Sms {
	String phoneNumber
	String message
	String pin

    static constraints = {
	phoneNumber blank: false, unique:true
	message blank: true
	pin blank: true
    }
}
