# jwt_01

# Enabling User Registration on Spring Boot APIs

Entity: ApplicationUser.java
Manage Persistente Entity: ApplicationUserRepository.java

Resource that enables new users to register

UserResource.java

#User Authentication and Authorization on Spring Boot

##The Authentication Filter

JWTAuthenticationFilter.java extends UsernamePasswordAuthenticationFilter.java

UsernamePasswordAuthenticationFilter.java == >

SPRING_SECURITY_FORM_USERNAME_KEY = "username";
SPRING_SECURITY_FORM_PASSWORD_KEY = "password";

/login POST

##The Authorization Filter

JWTAuthorizationFilter extends BasicAuthenticationFilter

##Integrating the Security Filters on Spring Boot

WebSecurity extends WebSecurityConfigurerAdapter




https://auth0.com/blog/implementing-jwt-authentication-on-spring-boot/
