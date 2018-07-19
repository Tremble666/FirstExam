cd Exam

mvn clean package

cd e1

mvn clean package

cd target

java -jar test1.jar

cd ../..

cd e2

mvn clean package

cd target

java -jar test2.jar

cd ../..

cd e3

mvn clean package

cd target

java -jar test3.jar
