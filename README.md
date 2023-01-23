# Prerequisities
JDK 11
Docker

# How bring the mockservice up
cd mockserver  
docker compose up

# How bring the service up
./mvnw clean install -DskipTests  
java -jar target/simple-springboot-app-0.0.1-SNAPSHOT.jar  
The server will start at port 

# How to run the tests
./mvnw test  
