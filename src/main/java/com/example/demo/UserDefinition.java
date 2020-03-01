package com.example.demo;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.json.JSONObject;

public class UserDefinition {
	public static void main(String[] args) throws IllegalArgumentException, IllegalAccessException, NoSuchFieldException, SecurityException {
		MohanTest test = new MohanTest();
		test.name="MOhan";
		Map<String, String> hs=new HashMap<>();
		hs.put("Mohan", "Test");
		test.setMailid("mohan.eruvaram@gmail.com");
		test.setSno(1);
		
		Field[] declaredFields = MohanTest.class.getDeclaredFields();
		String collect = Arrays.stream(declaredFields).map(field->field.getName()).collect(Collectors.joining(":"));
		String[] split = collect.split(":");
		Arrays.stream(split).forEach(System.out::println);
		JSONObject object=new JSONObject(test,split);
		System.out.println(test.getClass().getField("sno").get(test));
//		System.out.println(object);

		
		
		System.out.println(test);
	}
}
