
https://spring.io/guides/tutorials/rest/

curl -v localhost:8082/employees
curl -v localhost:8082/employees/99

curl -X POST localhost:8082/employees -H 'Content-type:application/json' -d '{"name": "Samwise Gamgee", "role": "gardener"}'

curl -X PUT localhost:8082/employees/1 -H 'Content-type:application/json' -d '{"name": "Samwise Gamgee", "role": "ring bearer"}'


in Intellij, edit run configuration and set in VM Options:

-javaagent:D:\apps\AppServerAgent-21.4.0.32403\javaagent.jar -Dappdynamics.agent.applicationName=APMDEMO -Dappdynamics.agent.tierName=SERVERSIDE -Dappdynamics.agent.nodeName=MYLAPTOP


