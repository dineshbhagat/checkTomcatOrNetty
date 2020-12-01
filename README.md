# checkTomcatOrNetty



Error:



```java

  .   ____          _            __ _ _
 /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
 \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
  '  |____| .__|_| |_|_| |_\__, | / / / /
 =========|_|==============|___/=/_/_/_/
 :: Spring Boot ::                (v2.4.0)

2020-12-01 12:03:25.474  INFO 34669 --- [           main] c.e.c.CheckTomcatOrNettyApplication      : Starting CheckTomcatOrNettyApplication using Java 11.0.9 on 88e9fe567a24 with PID 34669 (/Users/<user>/Desktop/checkTomcatOrNetty/build/classes/java/main started by  in /Users/<user>/Desktop/checkTomcatOrNetty)
2020-12-01 12:03:25.477  INFO 34669 --- [           main] c.e.c.CheckTomcatOrNettyApplication      : No active profile set, falling back to default profiles: default
2020-12-01 12:03:26.109  WARN 34669 --- [           main] onfigReactiveWebServerApplicationContext : Exception encountered during context initialization - cancelling refresh attempt: org.springframework.beans.factory.UnsatisfiedDependencyException: Error creating bean with name 'checkRestTemplateBuilderInjection' defined in file [/Users/<user>/Desktop/checkTomcatOrNetty/build/classes/java/main/com/example/checktomcatornetty/abcd/CheckRestTemplateBuilderInjection.class]: Unsatisfied dependency expressed through constructor parameter 0; nested exception is org.springframework.beans.factory.NoSuchBeanDefinitionException: No qualifying bean of type 'org.springframework.boot.web.client.RestTemplateBuilder' available: expected at least 1 bean which qualifies as autowire candidate. Dependency annotations: {}
2020-12-01 12:03:26.138  INFO 34669 --- [           main] ConditionEvaluationReportLoggingListener : 

Error starting ApplicationContext. To display the conditions report re-run your application with 'debug' enabled.
2020-12-01 12:03:26.154 ERROR 34669 --- [           main] o.s.b.d.LoggingFailureAnalysisReporter   : 

***************************
APPLICATION FAILED TO START
***************************

Description:

Parameter 0 of constructor in com.example.checktomcatornetty.abcd.CheckRestTemplateBuilderInjection required a bean of type 'org.springframework.boot.web.client.RestTemplateBuilder' that could not be found.


Action:

Consider defining a bean of type 'org.springframework.boot.web.client.RestTemplateBuilder' in your configuration.


Process finished with exit code 1

```
