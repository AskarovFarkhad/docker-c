
FROM openjdk:19

WORKDIR /myapp

COPY src/main/java/Main.java .

RUN javac Main.java

CMD ["java", "Main.java"]