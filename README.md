# Kata project

The main goal about this repo is to take advantage of **[Gradle building tool](https://gradle.org/)** to have a dev environment easy to start and write some katas with their respective test. 

This project is using java version `17 LTS`.

## Package Naming convention

To create a new package, please use the following convention:

> <first-letter-of-name><lastname>

For example:

If my name is John Doe, then the new package that I'll use for my katas will be:  

Inside `practice.katas`:
> jdoe

## Branch convention

To create a branch please follow this convention:
```
<your_initials>/Name_of_the_kata
```
For example:
```
ramm/Kata_1
```

## Common commands
For more info please run `gradle help`.
### Build the project

For Windows users:
```shell
gradlew.bat clean build
```
For unix users:

```shell
./gradlew clean build
```


### Run Tests

For Windows users:
```shell
gradlew.bat test
```
For unix users:

```shell
./gradlew test
```


### Run validations

This command is important since this will check your code with some code conventions and after that will run the tests.

**Please do not forget to run this command.**

For Windows users:
```shell
gradlew.bat clean check 
```
For unix users:

```shell
./gradlew clean check
```
