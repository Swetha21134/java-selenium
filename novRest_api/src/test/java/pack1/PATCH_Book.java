package pack1;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;
import static org.hamcrest.CoreMatchers.equalTo;

public class PATCH_Book {
	//public static void main(String[] args)
	{
	JSONObject req=new JSONObject();
	
	baseURI="http://192.168.5.80:3000/api";
	
	req.put("price",12200);
	
	given()
	.header("Content-Type","application/json")
	.contentType(ContentType.JSON)
	.accept(ContentType.JSON)
	.body(req.toJSONString())
	.when()
	.patch("/v1/book/addBook")
	.then().statusCode(200).log().all();
	
 }

	

}
