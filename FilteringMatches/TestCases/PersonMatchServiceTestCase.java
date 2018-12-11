
import org.junit.BeforeClass;
import org.junit.Test;
import io.restassured.RestAssured;
import static io.restassured.RestAssured.get;
import static org.hamcrest.CoreMatchers.equalTo;

public class PersonMatchServiceTestCase {
	
   @BeforeClass
    public static void init(){
	   RestAssured.baseURI = "http://localhost";
       RestAssured.port = 8080;
       }

    @Test
    public void testUserFetchesSuccess() {
    	    	
        get("/FilteringMatches/SparkNetworks/PersonMatchService/matchs")
        .then()
        .body("matches.size()", equalTo(25));
    }


}

