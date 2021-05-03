
https://spring.io/guides/tutorials/rest/

curl -v localhost:8081/employees
curl -v localhost:8081/employees/99

curl -X POST localhost:8081/employees -H 'Content-type:application/json' -d '{"name": "Samwise Gamgee", "role": "gardener"}'

curl -X PUT localhost:8081/employees/1 -H 'Content-type:application/json' -d '{"name": "Samwise Gamgee", "role": "ring bearer"}'


