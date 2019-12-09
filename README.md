## Compare Json
Created two files and read using bufferedreader based on new line and then API hit using rest assured and used JsonAssert library for comparison created two text files on which API endpoints are mentioned

## Maven Dependency

        <dependency>
            <groupId>org.testng</groupId>
            <artifactId>testng</artifactId>
            <version>6.14.3</version>
            <scope>test</scope>
        </dependency>
        <dependency>
            <groupId>io.rest-assured</groupId>
            <artifactId>rest-assured</artifactId>
            <version>3.3.0</version>
        </dependency>
        <dependency>
            <groupId>com.jayway.jsonpath</groupId>
            <artifactId>json-path</artifactId>
            <version>2.4.0</version>
        </dependency>
        <dependency>
            <groupId>org.skyscreamer</groupId>
            <artifactId>jsonassert</artifactId>
            <version>1.5.0</version>
            <scope>test</scope>
        </dependency>
