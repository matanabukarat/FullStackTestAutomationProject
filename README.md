## **Full Stack Test Automation Project**
[Short Video - Demonstration](https://drive.google.com/file/d/1bQB-32A__i0Dk93kPMosJPrd9WKdqOvc/view?usp=sharing)
### **_This project was created to demonstrate my knowledge and skills on a variety of platforms using different kinds of tools & frameworks._**
***
### _About_
This project demonstates a smart test automation infrastructure. It is built in hierarchy order of modules, each module contains number of classes with methods.
There are main/common/helpers/actions/page_object modules.
In this way, the tests can be created in a very simple way with minimum lines of code.
Also, the infrastructure allows to work with differend kinds of applications.
**Big advantage of the infrastructure is that it can be easily maintained!**

### _Project Overview_

This project is an example of infrastructure for automation testing of different kinds of applications:
* Web based application
* Mobile application
* Web API
* Electron application
* Desktop application

### **_Infrastructure project includes:_**
* Failure Mechanism
* Page Object Design Pattern
* Project Layers(Extensions/Work Flows/Test Cases...)
* Support of Different Clients/Browsers
* Common Functionality(i.e. - verifyElementExists)
* External Files Support
* Reporting System (including screenshots)
* Visual Testing
* Synchronization(Waits/Timeouts)
* DB support(MySQL)
* CI support(Jenkins)


***

### _List of applications that were used in this project:_
* myfitnesspal webpage - Web based application
* myfitnesspal mobile app - Mobile based application
* Grafana API - Web API
* Electon application
* Windows calculator - Desktop application

### _Tools & Frameworks that were used in this project:_
* Selenium - For Web Aplication Testing
* Appium - For Mobile Aplication Testing
* RestAssured- for API testing
* WinAppDriver - For Desktop Aplication Testing
* Electron Driver - For Electron Aplication Testing
* TestNG - Testing Framework
* Listeners - interface used to generate logs and customize the TestNG reports
* MySQL Free Online DB - used for login to myfitnesspal web page
* [Jenkins](https://www.jenkins.io/)- for tests execution
* [Allure Reports](http://allure.qatools.ru/) - as the main reporting system

### Tests Execution:
> The Execution runs through jenkins, Each application has a few tests for demonstration purposes.
These tests can be developed in a very simple way, due to a lot of work in the infrastructure.
[[Sanity Tests]](https://github.com/matanabukarat/FullStackTestAutomationProject/tree/master/src/test/java/SanityTests)

### _Known Issues:_
there is a conflict with the dependencies of appium client and appium experitest, this is a known problem not related to my project and yet to be fixed.
Hence, the project is for DEMO purposes only, In production it should be divided into several projects, each for every environment.
