# Imagen base de Java con Maven
FROM eclipse-temurin:17-jdk AS build

# Establece el directorio de trabajo
WORKDIR /app

# Copia los archivos del proyecto
COPY . .

# Compila el proyecto y genera el JAR
RUN ./mvnw clean package -DskipTests

# Segunda etapa: Imagen final más liviana
FROM eclipse-temurin:17-jdk

WORKDIR /app

# Copia el JAR generado desde la primera etapa
COPY --from=build /app/target/cursoSpringBoot-0.0.1-SNAPSHOT.jar app.jar

# Expone el puerto 8080
EXPOSE 8080

# Ejecuta la aplicación
CMD ["java", "-jar", "app.jar"]
