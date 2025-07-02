# Getting Started

### Reference Documentation
For further reference, please consider the following sections:

* [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)
* [Spring Boot Maven Plugin Reference Guide](https://docs.spring.io/spring-boot/3.5.0/maven-plugin)
* [Create an OCI image](https://docs.spring.io/spring-boot/3.5.0/maven-plugin/build-image.html)
* [Spring Web](https://docs.spring.io/spring-boot/3.5.0/reference/web/servlet.html)

### Guides
The following guides illustrate how to use some features concretely:

* [Building a RESTful Web Service](https://spring.io/guides/gs/rest-service/)
* [Serving Web Content with Spring MVC](https://spring.io/guides/gs/serving-web-content/)
* [Building REST services with Spring](https://spring.io/guides/tutorials/rest/)

### Maven Parent overrides

Due to Maven's design, elements are inherited from the parent POM to the project POM.
While most of the inheritance is fine, it also inherits unwanted elements like `<license>` and `<developers>` from the parent.
To prevent this, the project POM contains empty overrides for these elements.
If you manually switch to a different parent and actually want the inheritance, you need to remove those overrides.


Edit Configurations:
Maven configuration: Please refer : \Projects\outline\demo\Doc1.docx
jvm args: clean, install #load all maven dependecies
Spring boot application run
jvm args spring-boot:run #Bootstrap springboot application

Endpoints:
Post:
http://localhost:8080/api/insertCardRange
Body:
{
"cardBINStartRange" : "4000000000000704",
"cardBINEndRange": "4000000000000799",
"threeDSMessageUrl": "https://eu.3ds.acssecure.com/3ds-method-start?org=ent"
}
Get:
http://localhost:8080/api/getCardRangeWithPAN/4000000000000100
http://localhost:8080/api/getCardRangeWithPAN/4000000000000600
http://localhost:8080/api/getCardRangeWithPAN/4000000000002100
http://localhost:8080/api/getCardRangeWithPAN/4000000000002600
..etc



