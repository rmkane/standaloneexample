# Standalone Example

The following application combines Spring, Hibernate, and MySQL to allow a user to access a database without a server.

## Preamble

Downloaded the initial project from here on GitHub:

>[theresajayne/standaloneexample](https://github.com/theresajayne/standaloneexample)

Which was discovered on this blog post:

>[Configuring Hibernate and Spring for Standalone Application](http://girlcoderuk.wordpress.com/2013/07/14/configuring-hibernate-and-spring-for-standalone-application/)

## About

The application heavily uses autowiring to inject beans. The SERVICE layer is used to map DTO objects to their ENTITY counterparts which will then be sent to the DAO layer where the session manager will control the DATABASE CRUD operations.

### Project Dependencies

* Spring 3.2.3.RELEASE
* Hibernate 4.2.2.Final
* MySQL