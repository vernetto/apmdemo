register for a 15 days trial at https://www.appdynamics.com/

https://urldefense.com/v3/__https:/hepburn202105120948466.saas.appdynamics.com:443/controller__;!!GF_29dbcQIUBPA!m9KSKgTUqov1uepmWDo-MVmB8CBjd0mLxvRejc3sQ3ToIKmL-achXO-aAFHuPfhr$

login to my SaaS instance :
hepburn202105120948466

here is the sample code:
https://github.com/vernetto/apmdemo


download the:
a) APPLICATION driver 
-javaagent:D:\apps\AppServerAgent-21.4.0.32403\javaagent.jar -Dappdynamics.agent.applicationName=APMDEMO -Dappdynamics.agent.tierName=CLIENTSIDE -Dappdynamics.agent.nodeName=MYLAPTOP_CL

b) DATABASE driver
java -jar .\db-agent.jar

c) MACHINE driver
java -jar machineagent.jar

no need for UI driver, just download a piece of JS code to embed in your pages

Concepts:
ENDPOINTS
BUSINESS TRANSACTIONS
BASELINE
TRANSACTION SNAPSHOTS





