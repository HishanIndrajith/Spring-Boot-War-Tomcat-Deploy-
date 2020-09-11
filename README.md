#  Spring-Boot-War-Tomcat-Deploy-Example 

README

## Overlay Files

This is an example to generate war instead of jar using Spring Boot and deploy it to tomcat server using tomcat7:deploy plugin

## How to Run
``Clone the Repo first and open as a maven project. Install apache tomcat. Edit conf/tomcat-users.xml file to add a new user to deploy WAR file by adding below tag inside tomcat-users``

    <user username="hishan" password="password" roles="manager-gui, manager-script, manager-jmx" />

Then use command ``mvn clean  install tomcat7:deploy``

