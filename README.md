## rest-sample

Rest sample with Grails-2.3.9 + JDK8u31. 
Note: Not working with JDK8u40 and above.

### Usage

1. `$ git clone`
1. `$ cd rest-sample-with-grails-2.3.9`
1. `$ ./grailsw`
1. `$ ./grailsw run-app --https`
1. access to https://localhost:8443/rest-sample-with-grails-2.3.9/sms

### url-mappings-report

1. `$ ./grailsw url-mappings-report`

### POST
`$ curl -i -v -k https://localhost:8443/rest-sample-with-grails-2.3.9/sms -X POST -d "phoneNumber=0120111111&message=hello&pin=1234"`

`$ curl -i -v -k https://localhost:8443/rest-sample-with-grails-2.3.9/sms -X POST -d "phoneNumber=0120222222&message=good morning&pin=2345"`

### GET 
`$ curl -i -v https://localhost:8443/rest-sample-with-grails-2.3.9/sms`

`$ curl -i -v https://localhost:8443/rest-sample-with-grails-2.3.9/sms.json`

`$ curl -i -v https://localhost:8443/rest-sample-with-grails-2.3.9/sms.xml`

### PUT
`$ curl -i -v -k https://localhost:8443/rest-sample-with-grails-2.3.9/sms/${id} -X PUT -d "phoneNumber=0120111111&message=good evening"` 

### DELETE
` $ curl -i -v -k https://localhost:8443/rest-sample-with-grails-2.3.9/sms/${id} -X DELETE`

### How to register initial data in BootStrap.groovy


