aHystrix is a library from Netflix. Hystrix isolates the points of access between the services, stops cascading failures across them and provides the fallback options.

For example, when you are calling a 3rd party application, it takes more time to send the response. So at that time, the control goes to the fallback method and returns the custom response to your application.


How to implement the Hystrix in a Spring Boot application.

We need to add the Spring Cloud Starter Hystrix dependency in our build configuration file.

add the @Hystrix command and @HystrixProperty for the Rest API and define the timeout in milliseconds value a

