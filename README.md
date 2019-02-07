# TestFX-junit-standalone-javafx-app template
#### with TestFX, JUnit5 tests for standalone JavaFX application included as .jar in test project

### Prerequisites
* gradle
* .jar created from JavaFX application to test

### Initial
* clone repository
* open build.gradle file in IDE (IntelliJ)
* import dependencies with gradle


### Customise TestFX tests
* prepare .jar from your JavaFX application for test
* copy your .jar to 'libs' directory in project
* import your JavaFX application Main.class in TestFXJUnitAppRunner class (in FxToolkit.setupApplication() method)
* add your test classes with tests cases


### How to run tests:
#### With gradle command:
To run TestFX tests type command:
* 'clean test'

#### With IDE (JUnit):
* run SimpleTestFXJUnitTest class / your test class
* or run only method with @Test annotation in SimpleTestFXJUnitTest class / your test class

### Reports
Reports are placed in 'build' directory (after running tests with gradle task 'clean test' / 'clean build').
To run report in browser, open 'build\reports\tests\test\index.html' file and choose browser.

### Gradle custom tasks
* test (runs with useJUnitPlatform())
