# wildfly-swarm-mail-demo

WildFly Swarm Mail Demo

## Prerequisites

* Setup SMTP Server like a postfix

## Build & Run

``` console
./mvnw clean package
java -jar target/wildfly-swarm-mail-demo-swarm.jar
```

## Access API

``` console
curl -XPOST -H 'Content-Type: application/json' localhost:8080 -d '
{
  "to": "foo@example.com",
  "subject": "This is subject",
  "content": "This is content"
}'  
```

## Related Forum

[Configure SMTP server](https://groups.google.com/forum/#!topic/wildfly-swarm/z0xpRXmGSoY)