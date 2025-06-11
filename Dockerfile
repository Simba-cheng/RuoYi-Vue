FROM openjdk:8-alpine3.7
MAINTAINER yxcheng

EXPOSE 8080

RUN mkdir -p /ruoyi
WORKDIR /ruoyi

ADD ./target/ruoyi-admin.jar ./ruoyi-vue-admin.jar

ENV JAVA_OPTS="-XX:+HeapDumpOnOutOfMemoryError -XX:HeapDumpPath=/home/ruoyi-admin.hprof"
ENTRYPOINT java ${JAVA_OPTS} -jar ruoyi-vue-admin.jar