package auth_test;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class PreemptiveAuthTest {

	@Test
	public void sampleTest() {
given()
.auth().preemptive().basic("rmgyantra", "rmgy@9999")
.log().all()
.when()
.get("http://49.249.29.5:8091/dashboard/transactions")
.then()
.log().all();
	}
}
