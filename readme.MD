register for a 15 days trial at https://www.appdynamics.com/

https://urldefense.com/v3/__https:/hepburn202105120948466.saas.appdynamics.com:443/controller__;!!GF_29dbcQIUBPA!m9KSKgTUqov1uepmWDo-MVmB8CBjd0mLxvRejc3sQ3ToIKmL-achXO-aAFHuPfhr$

login to my SaaS instance :
hepburn202105120948466

here is the sample code:
https://github.com/vernetto/apmdemo

using a Portgres DB jdbc:postgresql://localhost:5432/postgres user postgres pw root

download the:

a) APPLICATION driver 

-javaagent:D:\apps\AppServerAgent-21.4.0.32403\javaagent.jar -Dappdynamics.agent.applicationName=APMDEMO -Dappdynamics.agent.tierName=CLIENTSIDE -Dappdynamics.agent.nodeName=MYLAPTOP_CL

b) DATABASE driver

java -jar .\db-agent.jar

c) MACHINE driver

java -jar machineagent.jar

no need for UI driver, just download a piece of JS code to embed in your pages

Concepts:
* ENDPOINTS
* BUSINESS TRANSACTIONS
* BASELINE
* TRANSACTION SNAPSHOTS (taken on error, slow tx and every 10 minutes)



Show the code of ClientController and ServerController

APPLICATION : Analysis of a ERROR SNAPSHOT starting from CLIENT tier (Application/Errors)

correlation happens with Request GUID - you can correlate across tiers

APPLICATION : Analysis of a SLOW SNAPSHOT starting from CLIENT tier (Application/Transaction Snapshots/All Snapshots) and show Call Graph



USER EXPERIENCE : Geo Classification, Browser Snapshots of slow interactions


DATABASES : Queries, View Execution Plan


ALERTS



presentation available on:

https://www.youtube.com/watch?v=FjGCoj7oOtI Part 1

https://www.youtube.com/watch?v=EdDjF0ZatOk  Part 2



