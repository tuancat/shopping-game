Server Requirement:
- jdk 1.8 or later
- maven 3.x.x
- mysql 5.x.x or later
Setup environment:

- navigate to src\main\resource
- open file application.yml
    + update datasource base on your server
Run:
- navigate to root folder
- command mvn clean install
- mvn spring-boot:run
- open your browser with url: http://[IP Server]:8080/shopping-service/swagger-ui.html#
- check to list API: customer, categories, product
