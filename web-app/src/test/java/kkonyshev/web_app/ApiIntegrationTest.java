package kkonyshev.web_app;

import java.io.IOException;
import java.net.URISyntaxException;

import org.apache.http.HttpException;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.impl.client.DefaultHttpClient;
import org.junit.Test;

public class ApiIntegrationTest {

	@Test
	public void testHello() throws URISyntaxException, HttpException, IOException {
		String name = "user";
		HttpUriRequest request = new HttpGet( "http://localhost:8080/api/hello/" + name  );
		
		// Whenas
		HttpResponse httpResponse = new DefaultHttpClient().execute(request);
		
		// Then
		System.out.println(httpResponse);
	}
}
