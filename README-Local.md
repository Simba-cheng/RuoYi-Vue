# RuoYi-Vue

# docker 部署

1. 在 ruoyi-admin 下添加 Dockerfile 文件
    ```dockerfile
        FROM openjdk:8-alpine3.7
        MAINTAINER yxcheng
        
        EXPOSE 8080
        
        RUN mkdir -p /ruoyi
        WORKDIR /ruoyi
        
        ADD ./target/ruoyi-admin.jar ./ruoyi-vue-admin.jar
        
        ENV JAVA_OPTS="-XX:+HeapDumpOnOutOfMemoryError -XX:HeapDumpPath=/home/ruoyi-admin.hprof"
        ENTRYPOINT java ${JAVA_OPTS} -jar ruoyi-vue-admin.jar
    ```
2. 正常配置 idea 中 docker 打包镜像配置

3. 启动镜像
    ```shell
    docker run --name ruoyi-vue \
      -p 8080:8080 \
      -d ruoyi-vue-admin:0.0.1
    ```