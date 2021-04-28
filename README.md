# Java Sandbox

This is my java sandbox repo, to demostrate some features or usage for java, for myself.

## Mock final class, final and static method with Mockito.

> I'm using junit4 because my daily work is using junit4. Based on https://asolntsev.github.io/en/2020/07/11/mockito-static-methods/, you need mockito version >= 3.4.

1. Check the build.gradle in app folder, you need dependencis like this `testImplementation group: 'org.mockito', name: 'mockito-inline', version: '3.9.0'`. (Some articles on Internet said you only need this, someone argu that you need `mockito-core` as well. based on my test, seems `mockito-inline` itself is enough). Then you can mock final classes just like a normal class.

2. To mock static method, you will need `MockedStatic` (seems can't use annotation), check the code.

3. References
* https://frontbackend.com/tag/Mockito/1
* https://www.baeldung.com/mockito-mock-static-methods
* https://rieckpil.de/mock-java-constructors-and-their-object-creation-with-mockito/
