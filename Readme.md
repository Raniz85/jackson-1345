Run with `./gradlew check`.

Expected output:

```
:compileJava UP-TO-DATE
:processResources UP-TO-DATE
:classes UP-TO-DATE
:compileTestJava
:processTestResources UP-TO-DATE
:testClasses
:test

DeserialisationTest > testLombok FAILED
    com.fasterxml.jackson.databind.JsonMappingException at DeserialisationTest.java:19

2 tests completed, 1 failed
:test FAILED

FAILURE: Build failed with an exception.

* What went wrong:
Execution failed for task ':test'.
> There were failing tests. See the report at: file://[...]/jackson-1345/build/reports/tests/index.html

* Try:
Run with --stacktrace option to get the stack trace. Run with --info or --debug option to get more log output.

BUILD FAILED
```
