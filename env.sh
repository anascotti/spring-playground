export JAVA_HOME_9=/opt/jdk-9.0.4
export JAVA_HOME=$JAVA_HOME_9
PATH=$JAVA_HOME/bin:$PATH

export M2_HOME=/opt/apache-maven-3.5.2/
export M2=$M2_HOME/bin
export MAVEN_OPTS="-Xmn128m -Xms256m -Xmx2048m -Xss1m -XX:PermSize=128m -XX:MaxPermSize=528m -server -Dmaven.wagon.http.ssl.insecure=true -Dmaven.wagon.http.ssl.allowall=true -Dhttps.protocols=TLSv1"
PATH=$M2:$PATH 

export PATH=$PATH:/opt/gradle/gradle-4.5/bin
