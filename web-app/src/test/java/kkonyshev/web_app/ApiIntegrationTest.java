package kkonyshev.web_app;

import java.io.IOException;
import java.net.URISyntaxException;

import kkonyshev.web.api.HelloRes;

import org.apache.http.HttpException;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.impl.client.DefaultHttpClient;
import org.junit.Assert;
import org.junit.Test;

import com.fasterxml.jackson.databind.ObjectMapper;

public class ApiIntegrationTest {

	@Test
	public void testHello() throws URISyntaxException, HttpException, IOException {
		String name = "user";
		HttpUriRequest request = new HttpGet( "http://localhost:8080/api/hello/" + name  );
		
		// When
		HttpResponse httpResponse = new DefaultHttpClient().execute(request);
		
		// Then\
		HelloRes response = new ObjectMapper().readValue(httpResponse.getEntity().getContent(), HelloRes.class);
		Assert.assertEquals(name, response.getName());
	}
}
