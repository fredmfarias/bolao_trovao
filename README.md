bolao_trovao
============

#REQUISITOS

JDK 8
https://www.azul.com/downloads/?version=java-8-lts&os=windows&architecture=x86-64-bit&package=jdk

MAVEN 3.5
https://archive.apache.org/dist/maven/maven-3/3.5.3/binaries/

#Libs que não são mais encontradas no repository maven devem ser manualmente adcionadas ao classpath
\src\main\resources\lib

#Create Database
docker run --name bolao-postgres -e POSTGRES_PASSWORD=bolao -d -p 5432:5432 postgres
