# Pull base image 
From tomcat:latest
RUN cp ./webapp.war /usr/local/tomcat/webapps

