FROM openjdk:11
VOLUME /temp
EXPOSE 8089
ADD target/devops-integration.war devops-integration.war
ENTRYPOINT [ "java","-jar","devops-integration.war"]