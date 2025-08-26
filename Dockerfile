# Этап 1 - сборка проекта в jar
FROM maven:3.6.3-openjdk-17 as maven
RUN mkdir job4j_di
WORKDIR job4j_di
COPY . .
RUN mvn install -Dmaven.test.skip=true

# Этап 2 - запуск поекта
FROM openjdk:17.0.2-jdk
WORKDIR job4j_di
COPY --from=maven /job4j_di/target/main.jar main.jar
CMD ["java", "-jar", "main.jar"]
