FROM java:7
COPY /bin /bin
WORKDIR /bin
CMD ["java", "HelloWorld"]
