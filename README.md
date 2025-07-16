# Introduction\_To\_SpringFramework\_By\_Ranga



Spring Bean: A Spring Bean is an object that Spring manages i.e. the Spring IoC (Inversion of Control) container. When instances of classes are created and configured within the Spring context, they are referred to as beans.

The Spring Framework is responsible for managing the entire lifecycle of beans. This includes their creation, initialization, and destruction.

Beans can be accessed from the Spring application context using methods like context.getBean(ClassName.class), to retrieve instances of the beans that are defined.

------------------------------------------------------------------------------------------------------------------------------------------

Dependency Injection: Beans can be configured to use Dependency Injection, which means that their dependencies can be defined and injected by the Spring container. This promotes loose coupling and makes the code more testable.

------------------------------------------------------------------------------------------------------------------------------------------

Inversion of Control (IoC): IoC is a programming paradigm where the control of object creation and management is transferred from the application code to a container or framework. This means that instead of the application code controlling the flow, the framework (like Spring) takes charge.

The most common form of IoC is Dependency Injection (DI).

There are two primary types of IoC containers in Spring: ApplicationContext (most commonly used) and BeanFactory (generally less common).

------------------------------------------------------------------------------------------------------------------------------------------

@Springboot -> @SpringBootApplication allows you to quickly set up a Spring Boot application with minimal configuration, as it integrates the essential functionalities for setting up a Spring application, enabling a faster development process.@ComponentScan -> It scans the base package for all the components.

Here are the main components of @SpringBootApplication:



@Configuration: This annotation indicates that the class can be used by the Spring IoC container as a source of bean definitions. In other words, it's where you can define and configure Spring beans.



@EnableAutoConfiguration: This annotation tells Spring Boot to automatically configure your application based on the libraries present on the classpath. It simplifies the setup by eliminating the need for manual configuration of common application requirements.



@ComponentScan: This enables component scanning, allowing Spring to automatically discover and register beans (annotated with @Component, @Service, @Repository, etc.) in the specified package.

------------------------------------------------------------------------------------------------------------------------------------------
@Component -> A Class managed by spring framework. @Component annotation is a generic stereotype for any Spring-managed component. It is meant for classes that do not fit into more specific categories like @Service, @Repository, or @Controller.

------------------------------------------------------------------------------------------------------------------------------------------

@Autowired -> Autowiring is used to automatically resolve dependencies between Spring beans without needing to explicitly specify them in your configuration.



Types of Autowiring:



By Type: Spring looks for a matching bean of the required type and injects it.

By Name: Spring looks for a bean with a name matching the property name and injects it.

Constructor Injection: When a bean is created, dependencies are provided via its constructor.



You can use the @Autowired annotation on fields, setters, or constructors.

------------------------------------------------------------------------------------------------------------------------------------------





