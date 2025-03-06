# SauceDemo Automation Test

## Overview
This project automates an end-to-end user journey on the SauceDemo e-commerce site using **Java + Selenium + TestNG+RestAssured** and end 2 end scenairo from Checkout Test class.

## Test Scenario
1. Login with `standard_user`
2. Add "Sauce Labs Fleece Jacket" to cart
3. Open "Sauce Labs Onesie" product details and add it to cart
4. Validate cart count
5. Verify cart items
6. Perform checkout with mock user data from JSONPlaceholder API
7. Confirm order details and complete purchase

## Technology Stack
- Java
- Selenium WebDriver
- TestNG
- RestAssured (for API)
- Maven (dependency management)

## Setup & Installation
### Prerequisites
1. Install [Java JDK 23+](https://www.oracle.com/eg/java/technologies/downloads/)
2. Install [Maven](https://maven.apache.org/)
3. Install [Google Chrome](https://www.google.com/chrome/) 

### dependencies
   <dependencies>

        <!-- https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java -->
        <dependency>
            <groupId>org.seleniumhq.selenium</groupId>
            <artifactId>selenium-java</artifactId>
            <version>4.29.0</version>
        </dependency>

        <!-- https://mvnrepository.com/artifact/io.github.bonigarcia/webdrivermanager -->
        <dependency>
            <groupId>io.github.bonigarcia</groupId>
            <artifactId>webdrivermanager</artifactId>
            <version>5.9.3</version>
        </dependency>

        <!-- https://mvnrepository.com/artifact/com.googlecode.json-simple/json-simple -->
        <dependency>
            <groupId>com.googlecode.json-simple</groupId>
            <artifactId>json-simple</artifactId>
            <version>1.1.1</version>
        </dependency>

        <!-- https://mvnrepository.com/artifact/org.testng/testng -->
        <dependency>
            <groupId>org.testng</groupId>
            <artifactId>testng</artifactId>
            <version>7.11.0</version>
        </dependency>

        <!-- https://mvnrepository.com/artifact/io.rest-assured/rest-assured -->
        <dependency>
            <groupId>io.rest-assured</groupId>
            <artifactId>rest-assured</artifactId>
            <version>5.5.1</version>
        </dependency>



    </dependencies>
