FROM java:7
COPY /src /src
WORKDIR /src
RUN cd /src; javac HelloWorld.java
CMD ["java", "HelloWorld"]
