
https://spring.io/guides/tutorials/rest/


curl -X POST localhost:8082/employees -H 'Content-type:application/json' -d '{"name": "Wilhelm Tell", "role": "archer"}'
curl -X POST localhost:8082/employees -H 'Content-type:application/json' -d '{"name": "Guillaume Henri Dufour", "role": "general"}'
curl -v localhost:8082/employees
curl -v localhost:8082/employees/1
curl -v localhost:8082/employees/99



in Intellij, edit run configuration and set in VM Options:

-javaagent:D:\apps\AppServerAgent-21.4.0.32403\javaagent.jar -Dappdynamics.agent.applicationName=APMDEMO -Dappdynamics.agent.tierName=SERVERSIDE -Dappdynamics.agent.nodeName=MYLAPTOP


PIERLUIGI
presidio202104290344197.saas.appdynamics.com
presidio202104290344197
https://urldefense.com/v3/__https://presidio202104290344197.saas.appdynamics.com:443/controller__;!!GF_29dbcQIUBPA!ndIbZ9CLBzcgOY2hnI1-hQgUuibl8a0UrpQeLyhn-KZ4shJDepROom8dAqtWfeMdj2825w$
License ID: 161970297959IQT


PIOTR
https://urldefense.com/v3/__https:/hepburn202105120948466.saas.appdynamics.com:443/controller__;!!GF_29dbcQIUBPA!m9KSKgTUqov1uepmWDo-MVmB8CBjd0mLxvRejc3sQ3ToIKmL-achXO-aAFHuPfhr$
hepburn202105120948466
piotr_pniak@epam.com



== Browser
PVUI
AD-AAB-ABD-XCS



== DB AGENT
https://www.postgresql.org/docs/9.1/creating-cluster.html
initdb -D /usr/local/pgsql/data
.\pg_ctl.exe -D D:\pierre\postgres start

cd D:\apps\db-agent-21.4.0.2358
java -jar .\db-agent.jar

jdbc:postgresql://localhost:5432/postgres


== machine agent
java -jar machineagent.jar

