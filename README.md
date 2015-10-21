## rest-sample

Rest sample.

### Usage

1. git clone
1. cd rest-sample
1. ./grailsw
1. ./grailsw run-app --https
1. access to https://localhost:8443/rest-sample/sms


### POST
`$ curl -i -v -k http://localhost:8080/rest-sample/sms -X POST -d "phoneNumber"="0120111111" -d "message"="hello" -d "pin"="1234"`

`$ curl -i -v -k http://localhost:8080/rest-sample/sms -X POST -d "phoneNumber"="0120222222" -d "message"="good morning" -d "pin"="2345"`

### GET 
`$ curl -i -v http://localhost:8080/rest-sample/sms`

`$ curl -i -v http://localhost:8080/rest-sample/sms.json`

`$ curl -i -v http://localhost:8080/rest-sample/sms.xml`

### PUT
`$ curl -i -v -k http://localhost:8080/rest-sample/sms/${id} -X PUT -d "phoneNumber=0120111111&message=good evening"` 

### How to register data in BootStrap.groovy

