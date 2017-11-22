package com.inmarsat.bdd.glue;

import com.inmarsat.bdd.CodingExerciseApplication;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpMethod;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.util.Assert;

import java.io.IOException;

@ContextConfiguration
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
public class SpringIntegrationTest extends AbstractStepDefinitionConsumer {

    @Given("^baseUri is (.*)$")
    public void baseUri(String uri) {
        Assert.notNull(uri);
        Assert.isTrue(!uri.isEmpty());
        baseUri = uri;
    }

    @When("^the client calls (.*)$")
    public void get(String resource) {
        this.request(resource, HttpMethod.GET);
    }

    @Then("^the client receives status code of (\\d+)$")
    public void responseCode(Integer status) {
        this.checkStatus(status, false);
    }

    @And("^response body should be valid json$")
    public void bodyIsValid() throws IOException {
        this.checkJsonBody();
    }

    @And("^response body should contain (.+)$")
    public void bodyContains(String bodyValue) throws IOException {
        this.checkBodyContains(bodyValue);
    }
}