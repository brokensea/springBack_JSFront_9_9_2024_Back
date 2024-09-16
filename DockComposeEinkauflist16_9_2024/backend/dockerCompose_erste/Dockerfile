FROM eclipse-temurin:22

WORKDIR /app

# 复制 JAR 文件到容器中的 /app 目录
COPY target/DockComposeEinkauflist16_9_2024-0.0.1-SNAPSHOT.jar app.jar

ENTRYPOINT ["java", "-jar", "app.jar"]
