FROM eclipse-temurin:22
WORKDIR /app
# 拷贝 JAR 文件
COPY target/SP_UebungEinkaufliste.jar .
# 拷贝配置文件到正确的路径
COPY src/main/resources/application.properties /app/application.properties
# 设置环境变量以确保 Spring Boot 使用正确的配置文件
ENV SPRING_CONFIG_LOCATION=classpath:/application.properties
# 暴露端口
EXPOSE 8080
# 设置启动命令
CMD ["java", "-jar", "SP_UebungEinkaufliste.jar"]