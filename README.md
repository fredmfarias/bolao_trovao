bolao_trovao
============

#REQUISITOS

JDK 8
https://www.azul.com/downloads/?version=java-8-lts&os=windows&architecture=x86-64-bit&package=jdk

MAVEN 3.5
https://archive.apache.org/dist/maven/maven-3/3.5.3/binaries/

#Libs que não são mais encontradas no repository maven devem ser manualmente adcionadas ao repository (.m2/...)
\src\main\resources\lib

#Caso der problema de certificado
(PKIX path building failed: sun.security.provider.certpath.SunCertPathBuilderException: unable to find valid certification path to requested target)

Go to URL in your browser:

firefox - click on HTTPS certificate chain (the lock icon right next to URL address). Click "more info" > "security" > "show certificate" > "details" > "export..". Pickup the name and choose file type example.cer

chrome - click on site icon left to address in address bar, select "Certificate" -> "Details" -> "Export" and save in format "Der-encoded binary, single certificate".
Now you have file with keystore and you have to add it to your JVM. Determine location of cacerts files, eg. C:\Program Files (x86)\Java\jre1.6.0_22\lib\security\cacerts.

Next import the example.cer file into cacerts in command line (may need administrator command prompt):

Utilizando o gibash:
keytool -importcert -file repository.primefaces.org.crt -alias primefaces -keystore "C:\ambiente\jdk\zulu8.64.0.19-ca-jdk8.0.345-win_x64\jre\lib\security\cacerts"

You will be asked for password which default is: changeit

Restart your JVM/PC.

#Create Database
docker run --name bolao-postgres -e POSTGRES_PASSWORD=bolao -d -p 5432:5432 postgres
