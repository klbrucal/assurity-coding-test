package test.api;

import common.Category;
import common.Promotion;
import static io.restassured.RestAssured.*;
import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import io.restassured.response.Response;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class CodingTest {
	private String uri;
	private String endPoint;
	private int statusCode;
	private Response response;
	private Category category;
	private ExtentReports extent;
    private ExtentSparkReporter spark;
    private ExtentTest parentTest;
    	
	@BeforeClass
	public void setUp() {
		uri = "https://api.tmsandbox.co.nz";
		endPoint = "/v1/Categories/6329/Details.json?catalogue=false";
		
		initializeReporter();
		validateResponse();
	}
	
	public void initializeReporter() {
		extent = new ExtentReports();
        spark = new ExtentSparkReporter("target/index.html");
        extent.attachReporter(spark);
        parentTest = extent.createTest("Coding Test - Assurity");
	}
	
	public void validateResponse() {
		//Log request
		parentTest.info(MarkupHelper.createCodeBlock("REQUEST:\n" + uri + endPoint));
		
		response = given().get(uri + endPoint);
		statusCode = response.getStatusCode();		
		if (statusCode == 200) {
			category = response.then().extract().as(Category.class);
			
			//Log response body
			parentTest.info(MarkupHelper.createCodeBlock("RESPONSE:\n" + response.getBody().asPrettyString()));			
		} else {
			//Log response failure
			parentTest.fail("Request failed, Status Code: " + statusCode);
		}		
	}
	
	@Test
	public void test_01() {
		ExtentTest test1 = parentTest.createNode("TC001 - Validate if \"Name\": \"Home & garden\"");
		
		if (statusCode == 200) {			
			String nameValue = category.getName();
			if (nameValue.equals("Home & garden")) {
				test1.pass(String.format("\"%s\": \"%s\"", "Name", nameValue));
			} else {
				test1.fail(String.format("\"%s\": \"%s\"", "Name", nameValue));
				Assert.fail();
			}
		} else {
			test1.fail(String.format("%s %s", "Request failed, Status Code:", statusCode));
			Assert.fail();
		}
	}
	
	@Test
	public void test_02() {
		ExtentTest test2 = parentTest.createNode("TC002 - Validate if \"CanRelist\": true");
		
		if (statusCode == 200) {			
			boolean canRelistValue = category.isCanRelist();
			if (canRelistValue) {
				test2.pass(String.format("\"%s\": %s", "CanRelist", canRelistValue));
			} else {
				test2.fail(String.format("\"%s\": %s", "CanRelist", canRelistValue));
				Assert.fail();
			}
		} else {
			test2.fail(String.format("%s %s", "Request failed, Status Code:", statusCode));
			Assert.fail();
		}
	}
	
	@Test
	public void test_03() {	
		ExtentTest test3 = parentTest.createNode("TC003 - Validate if the \"Promotions\" element with the"
				+ " \"Name\": \"Feature\" has a \"Description\" that contains the text \"Better position in category\"");
		
		if (statusCode == 200) {			
			//Find the Promotion element with Name = "Feature"
			Promotion featurePromotion = null;
			for (Promotion promotion : category.getPromotions()) {
				if (promotion.getName().equals("Feature")) {
					featurePromotion = promotion;
					break;
				}
			}
			
			//If Promotion element with Name Feature exist, assert if Description contains text "Better position in category"
			if (featurePromotion != null) {
				test3.pass(String.format("\"Promotions\" element with \"Name\": = \"Feature\" was found"));
				if (featurePromotion.getDescription().contains("Better position in category")) {
					test3.pass(String.format("\"%s\": \"%s\"", "Description", featurePromotion.getDescription()));
				} else {
					test3.fail(String.format("\"%s\": \"%s\"", "Description", featurePromotion.getDescription()));
					Assert.fail();
				}
			//If no Promotion element with the Name Feature, report not found
			}else {
				test3.fail(String.format("Promotions element with \"Name\": = \"Feature\" was not found"));
				Assert.fail();
			}
		} else {
			test3.fail(String.format("%s %s", "Request failed, Status Code:", statusCode));
			Assert.fail();
		}
	}
	
	@AfterClass
	public void tearDown() {
		extent.flush();
	}
}
