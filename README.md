## Overview
This repository contains the final project for a Test Automation course. The project demonstrates the application of automated testing practices using Java, TestNG, and Maven. It includes test cases, configurations, and dependencies necessary for executing automated tests.

## Project Structure
```
finalProject/
├── src/
│   └── main/
│   |    └── java/
│   |       └── [Your test packages and classes]
|   |__ test/
├── TestNG.XML
├── pom.xml
├── .gitignore
└── README.md
```
- src/main/java/: Contains the Java source files for the test cases.
- TestNG.XML: Configuration file for TestNG, specifying test suites and test cases to run.
- pom.xml: Maven configuration file managing project dependencies and build settings.


## Prerequisites
- Java Development Kit (JDK) 8 or higher
- Maven 3.6 or higher
- TestNG framework

## Setup and Execution
1. Clone the repository:
```
git clone https://github.com/guramiivanidze/finalProject.git
cd finalProject
```

2. Build the project using Maven:

```
mvn clean install
```

3. Execute tests with TestNG:
```
mvn test -DsuiteXmlFile=TestNG.XML
```

### Dependencies
The project utilizes the following dependencies, managed via Maven:

- TestNG: For organizing and running test cases.
- Selenium WebDriver: For browser automation (if applicable).
- Other dependencies: As specified in the pom.xml file.

## Notes
- Ensure that all necessary drivers (e.g., ChromeDriver for Selenium) are correctly set up and configured in your system's PATH.
- Update the TestNG.XML file to include or exclude specific test cases as needed.
- Customize the test classes and methods within src/main/java/ to align with your testing requirements.

### Author
Gurami Ivanidze – GitHub Profile

