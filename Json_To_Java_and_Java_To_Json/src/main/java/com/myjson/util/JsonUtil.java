package com.myjson.util;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonUtil {

	private static ObjectMapper mapper;

	static {
		mapper = new ObjectMapper();
	}

	public static String convertJavaToJson(File file, Object object) {

		String jsonResponce = "";

		try {
			mapper.writeValue(file, object);
			jsonResponce = mapper.writeValueAsString(object);

		} catch (JsonGenerationException e) {
			System.out.println("Exception occure while converting into java to json  " + e.getMessage());
		} catch (JsonMappingException e) {
			System.out.println("Exception occure while converting into java to json " + e.getMessage());
		} catch (IOException e) {
			System.out.println("Exception occure while converting into java to json " + e.getMessage());
		}

		return jsonResponce;
	}

	public static <T> T convertJsonToJava(File json, Class<T> cls) {

		T result = null;
		try {
			
			result = mapper.readValue(json, cls);
		} catch (JsonParseException e) {
			System.out.println("Exception occure while converting into Json to java " + e.getMessage());
		} catch (JsonMappingException e) {
			System.out.println("Exception occure while converting into Json to java " + e.getMessage());
		} catch (IOException e) {
			System.out.println("Exception occure while converting into Json to java " + e.getMessage());
		}

		return result;

	}

	public static String printJson(Object object) {

		String jsonResponce = "";

		try {

			jsonResponce = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(object);

		} catch (JsonGenerationException e) {
			System.out.println("Exception occure while converting into java to json  " + e.getMessage());
		} catch (JsonMappingException e) {
			System.out.println("Exception occure while converting into java to json " + e.getMessage());
		} catch (IOException e) {
			System.out.println("Exception occure while converting into java to json " + e.getMessage());
		}

		return jsonResponce;
	}
}
