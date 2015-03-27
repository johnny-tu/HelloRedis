FROM java:7
COPY /src /src
WORKDIR /src
RUN javac HelloWorld.java
CMD ["java", "HelloWorld"]
