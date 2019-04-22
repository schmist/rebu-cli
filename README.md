# rebu-cli

## Build
```./gradlew nativeBinary``` creates a native binary using Graal. The Graal tooling is automatically pulled from the web by Palantir's Gradle plugin. 

Graal sometimes needs additional dependencies:

* Ubuntu: ```sudo apt install zlib1g-dev```