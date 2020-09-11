./gradlew clean build
./gradlew test

echo 'coverage:'
cat build/jacoco.csv
