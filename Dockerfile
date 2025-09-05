FROM eclipse-temurin:21-jdk-alpine
LABEL authors="MUSHAGALUSA"

WORKDIR /app

COPY target/produit.jar ./produit.jar

EXPOSE 8000

CMD ["java", "-jar", "produit.jar"]