FROM openjdk:8
WORKDIR /temp
COPY ["target/*.jar","Demo.jar"]
EXECUTE ["java","-jar","Demo.jar"]