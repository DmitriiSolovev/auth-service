# Auth Service

##### RUN

- mvn clean package
- java -jar auth-service.jar

##### GET AUTH TOKEN

###### For User:
- POST: localhost:8080/oauth/token?grant_type=password&user=user&password=user,
  Header: Authorization Basic YnJvd3Nlcjo=
###### For Admin:
- POST: localhost:8080/oauth/token?grant_type=password&user=admin&password=admin,
  Header: Authorization Basic YnJvd3Nlcjo=

##### CHECK API

- GET: localhost:8080/user/current, Header: Authorization Bearer <auth-token>
- GET: localhost:8080/user/admin, Header: Authorization Bearer <auth-token>