FROM eclipse-temurin:22
WORKDIR /app
COPY  target/SP_UebungEinkaufliste.jar .
EXPOSE 8080
CMD [ "java","-jar","SP_UebungEinkaufliste.jar" ]
# For Spring-Boot project, use the entrypoint below to reduce Tomcat startup time.
#ENTRYPOINT exec java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar springtoDocker-0.0.1-SNAPSHOT.jar