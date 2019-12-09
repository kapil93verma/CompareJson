package CompareResponse;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.json.JSONException;
import org.skyscreamer.jsonassert.JSONAssert;
import org.skyscreamer.jsonassert.JSONCompareMode;
import org.testng.annotations.Test;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
public class CompareTwoApiTest {

    @Test
    public void compareTwoApis() throws IOException, JSONException {
        File file1=new File("src/main/resources/File1.txt");
        File file2=new File("src/main/resources/File2.txt");
        RequestSpecification rs= RestAssured.given();
        BufferedReader reader1=new BufferedReader(new FileReader(file1));
        BufferedReader reader2=new BufferedReader(new FileReader(file2));
        String line1=reader1.readLine();
        String line2=reader2.readLine();
        while (line1!=null && line2!=null)
        {
            Response response1=rs.get(line1);
            Response response2=rs.get(line2);
            try {
                JSONAssert.assertEquals(response1.asString(), response2.asString(), JSONCompareMode.STRICT);
                System.out.println(line1 +" equals "+line2);
            }
            catch (AssertionError e)
            {
                System.out.println(line1 +" not equals "+line2);
            }
            line1=reader1.readLine();
            line2=reader2.readLine();
        }
    }
}
