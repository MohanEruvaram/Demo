package com.example.demo;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.List;
import java.util.Map;

import org.json.JSONObject;

public class TestMainClass {
	public static void main(String[] args) throws URISyntaxException, IOException {
		URL url = new URL("http://localhost:8080/testmain");
		HttpURLConnection openConnection = (HttpURLConnection) url.openConnection();

		openConnection.setRequestMethod("POST");
		openConnection.setRequestProperty("content-Type", "application/json");
		openConnection.setRequestProperty("Accept", "application/json");
		JSONObject object = new JSONObject();
		object.put("name", "Mohan");
		object.put("value", "Mohan");
		openConnection.setDoOutput(true);
		OutputStream outputStream = openConnection.getOutputStream();
		System.out.println(object);
		outputStream.write(object.toString().getBytes());
		outputStream.flush();
		outputStream.close();
		Map<String, List<String>> headerFields = openConnection.getHeaderFields();
		headerFields.keySet().stream().flatMap(key -> headerFields.get(key).stream()).forEach(System.out::println);
		int headerField = openConnection.getResponseCode();
		System.out.println(headerField + "***********************************");
		InputStreamReader inputStream = new InputStreamReader(openConnection.getInputStream());
		BufferedReader stream = new BufferedReader(inputStream);
		String chares;
		while ((chares = stream.readLine()) != null) {
			System.out.println(chares);
		}
		// System.out.println(chares);

	}
}
