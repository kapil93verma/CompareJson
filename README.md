## Compare Json
Created two files and read using bufferedreader based on new line and then API hit using rest assured and used JsonAssert library for comparison created two text files on which API endpoints are mentioned

**Tools/libraries used**
TestNG
Maven
Rest Assured

**Run Test from command line**
Type command : mvn test (assuming that maven is installed in your system)


**Description of the project** ::
I have created a maven project and used TestNG to create api comparison test.
In directory : src/main/resources, File1.txt and File2.txt are kept.
In directory : src/test/java, class for compare JSON response.
BufferedReader function wil read all the HTTP/HTTPS request from file1 and file2 and then in test method, we used Rest assured library for hitting those
request and then compareTwoApis function is created to check whether these API responses are equal or not.
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
