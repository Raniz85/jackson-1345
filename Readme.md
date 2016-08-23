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
    com.fasterxml.jackson.databind.JsonMappingException: Could not find creator property with name 's' (in class LombokObject)
     at [Source: {"s":"test"}; line: 1, column: 1]
        at com.fasterxml.jackson.databind.JsonMappingException.from(JsonMappingException.java:261)
        at com.fasterxml.jackson.databind.DeserializationContext.reportMappingException(DeserializationContext.java:1233)
        at com.fasterxml.jackson.databind.deser.BeanDeserializerFactory.addBeanProps(BeanDeserializerFactory.java:552)
        at com.fasterxml.jackson.databind.deser.BeanDeserializerFactory.buildBeanDeserializer(BeanDeserializerFactory.java:226)
        at com.fasterxml.jackson.databind.deser.BeanDeserializerFactory.createBeanDeserializer(BeanDeserializerFactory.java:141)
        at com.fasterxml.jackson.databind.deser.DeserializerCache._createDeserializer2(DeserializerCache.java:406)
        at com.fasterxml.jackson.databind.deser.DeserializerCache._createDeserializer(DeserializerCache.java:352)
        at com.fasterxml.jackson.databind.deser.DeserializerCache._createAndCache2(DeserializerCache.java:264)
        at com.fasterxml.jackson.databind.deser.DeserializerCache._createAndCacheValueDeserializer(DeserializerCache.java:244)
        at com.fasterxml.jackson.databind.deser.DeserializerCache.findValueDeserializer(DeserializerCache.java:142)
        at com.fasterxml.jackson.databind.DeserializationContext.findRootValueDeserializer(DeserializationContext.java:475)
        at com.fasterxml.jackson.databind.ObjectMapper._findRootDeserializer(ObjectMapper.java:3890)
        at com.fasterxml.jackson.databind.ObjectMapper._readMapAndClose(ObjectMapper.java:3785)
        at com.fasterxml.jackson.databind.ObjectMapper.readValue(ObjectMapper.java:2833)
        at DeserialisationTest.testLombok(DeserialisationTest.java:19)

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
