FROM openjdk:8
WORKDIR /temp
COPY ["target/*.jar","Demo.jar"]
ENTRYPOINT ["java","-jar","Demo.jar"]
