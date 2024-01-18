package multipleobjectextraction;

import org.apache.http.client.fluent.Request;

public class ResponseCodes {

	public static void main(String[] args) {
		String url = "https://edition.cnn.com/";
		int resp_code=0;
		try {
			resp_code = Request.Get(url).execute().returnResponse().getStatusLine().getStatusCode();
			System.out.println("Response code for url " +url + " is->" +resp_code);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
