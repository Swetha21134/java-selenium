package pack1;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;
import static org.hamcrest.CoreMatchers.equalTo;

public class POST_Book {
	
@Test

 public void postbooks()
 {
	JSONObject req=new JSONObject();
	
	baseURI="http://192.168.5.80:3000/api";
	
	req.put("name","How Make Money2");
	req.put("authoName","Ram2");
	req.put("publishedYear","01/11/1994");
	req.put("price",1050);
	
	given()
	.header("Content-Type","application/json")
	.contentType(ContentType.JSON)
	.accept(ContentType.JSON)
	.body(req.toJSONString())
	.when()
	.post("/v1/book/addBook")
	.then().statusCode(500).log().all();
	
 }

	

}
