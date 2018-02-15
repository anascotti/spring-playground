docker run \
  -d \
  --rm \
  -u root \
  -p 8088:8080 \
  -v "$JAVA_HOME_9":/opt/jdk-9 \
  -v "$M2_HOME":/opt/mvn \
  -v /var/jenkins-data:/var/jenkins_home \
  -v /var/run/docker.sock:/var/run/docker.sock \
  -v "$HOME":/home \
  jenkinsci/blueocean
