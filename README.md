# microservice-using-spring-cloud
Microservices implementation using Spring Cloud and Dockerizing each microservice in container.

# Visiblity and Monitoring
1. Zipkin used as distributed tracing system. It helps gather timing data needed to troubleshoot latency problems in service architectures. 
   Features include both the collection and lookup of this data.
2. Spring Cloud Sleuth used to provide id to particular request with in microservices architecture system. 
3. Spring Cloud Gateway is used to provide a simple, yet effective way to route to APIs and provide cross cutting concerns to them such as: security, monitoring/metrics, and resiliency.

# Dynamic Scale Up and Down
1. Eureka Naming Server used to maintain the running instance urls if services.
2. Spring Cloud Load Balancer Used for client-side load-balancing in calls to another microservice.
3. Feign declarative web service client. It makes writing web service clients easier.

# Fault Tolerance
1. Resilence 4j used for fault tolerance. Used to provide default response when service is down.

# Centralized Configuration
1. Spring Cloud Config used to provide server-side and client-side support for externalized configuration in a distributed system.
   With the Config Server, we have a central place to manage external properties for applications across all environments using Github
   such as dev, test, uat etc.
