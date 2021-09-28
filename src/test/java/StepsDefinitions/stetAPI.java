package StepsDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;
import static org.assertj.core.api.Assertions.assertThat;

public class stetAPI {

    private Response response=null;
    private int codeStatus=0;
    private String header="";
    private String body="";

    @Given("the system set-up en using {string}")
    public void theSystemSetUpEnUsing(String URI) {
        RestAssured.baseURI = URI;
    }

    @When("the system has the ability to perform GET request whit {string}")
    public void theSystemHasTheAbilityToPerformGETRequestWhit(String Parameter) {
        /*
        given().get(Parameter)
                    .then()
                    .statusCode(200)
                    .body("results", notNullValue());
         */
        System.out.println("Request: "+baseURI+Parameter);
        response = given(). get(Parameter);
        codeStatus = response.getStatusCode();
        header= response.getHeaders().toString();
        body = response.getBody().asPrettyString();
    }

    @Then("the system should validate the {int}")
    public void theSystemShouldValidateThe(Integer StatusCode) {
        assertThat(codeStatus).isEqualTo(StatusCode);
        System.out.println("Got: "+codeStatus+", and spec -> "+StatusCode);
    }

    @Then("the system should validate a non-empty header")
    public void theSystemShouldValidateANonEmptyHeader() {
        assertThat(header).isNotEmpty();
        assertThat(header).isNotNull();
        System.out.println("\n"+header);
    }

    @Then("the system should validate a non-empty body")
    public void theSystemShouldValidateANonEmptyBody() {
        assertThat(body).isNotEmpty();
        assertThat(body).isNotBlank();
        assertThat(body).isNotNull();
        System.out.println("\n"+body);
    }
}
