#!/bin/bash
javac -cp /usr/share/java/junit4.jar:. SortTest.java
java -cp /usr/share/java/junit4.jar:. org.junit.runner.JUnitCore SortTest
