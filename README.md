# Web-Automation-With-Selenium-Cucumber


## Tool used in this Project
 - Selenium


## Framework used in this Project
 - Cucumber
 
  ## Project Scenarios
 - Admin can Login to the System.
 - Admin can Enter the Dashboard after the Login phase
 
  ## How to run this project:
 - Clone this project [Web-Automation-with-Selenium_Cucumber](https://github.com/ahnafahmad/Web-Automation-With-Selenium-Cucumber.git)
 - hit the following command:
  ```
 mvn clean test / mvn clean install
 ```
 
   ## How to Generate Report: 
 Automated Orange HRM Websited using Selenium & Cucumber where test cases are added for Admin Login, Admin can see Dashboard page after Logged in. The Report is generated automatically. Some Maven Dependency have to added for generated the Report.
 These are: 
 
  ```
 <build>
        <plugins>
            <plugin>
                <groupId>net.masterthought</groupId>
                <artifactId>maven-cucumber-reporting</artifactId>
                <version>5.3.0</version>
                <executions>
                    <execution>
                        <id>execution</id>
                        <phase>verify</phase>
                        <goals>
                            <goal>generate</goal>
                        </goals>
                        <configuration>
                            <projectName>Sample-Cucumber-Report</projectName>
                            <skip>false</skip>
                            <outputDirectory>reports/html-reports</outputDirectory>
                            <inputDirectory>target/cucumber-reports</inputDirectory>
                            <jsonFiles>
                                <param>**/*.json</param>
                            </jsonFiles>
                        </configuration>
                    </execution>
                </executions>
            </plugin>
        </plugins>
    </build>
 ```
 
 
 
 ## Prerequisite
  - Some maven dependency is must for run this project
  These are: 
 ```
 <!-- https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java -->
        <dependency>
            <groupId>org.seleniumhq.selenium</groupId>
            <artifactId>selenium-java</artifactId>
            <version>4.5.0</version>
        </dependency>
 ```
 ```
 <!-- https://mvnrepository.com/artifact/io.cucumber/cucumber-java -->
        <dependency>
            <groupId>io.cucumber</groupId>
            <artifactId>cucumber-java</artifactId>
            <version>7.5.0</version>
        </dependency>
```
```
   <!-- https://mvnrepository.com/artifact/io.github.bonigarcia/webdrivermanager -->
        <dependency>
            <groupId>io.github.bonigarcia</groupId>
            <artifactId>webdrivermanager</artifactId>
            <version>5.3.0</version>
        </dependency>
```
```
 <dependency>
            <groupId>io.cucumber</groupId>
            <artifactId>cucumber-junit</artifactId>
            <version>7.3.4</version>
            <scope>test</scope>
        </dependency>
```

## Selenium Cucumber Automation Report Image


![report-1](https://user-images.githubusercontent.com/58990500/203640196-b4707ad1-d68c-4326-b6e3-652615f3b47b.PNG)

