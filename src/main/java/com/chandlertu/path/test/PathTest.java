package com.chandlertu.path.test;

import java.net.URISyntaxException;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Properties;

public class PathTest {

	public static void main(String[] args) {
		System.out.println("****************************************************************");
		System.out.println("System.getProperties()");
		System.out.println("****************************************************************");
		print(System.getProperties());
		System.out.println("****************************************************************");

		System.out.println("System.getenv()");
		System.out.println("****************************************************************");
		print(System.getenv());
		System.out.println("****************************************************************");

		System.out.println("PathTest.class.getResource()");
		System.out.println("****************************************************************");
		System.out.println(PathTest.class.getResource(""));
		try {
			System.out.println(PathTest.class.getResource("").toURI());
		} catch (URISyntaxException e) {
			e.printStackTrace();
		}
		System.out.println(PathTest.class.getResource("/"));
		System.out.println(PathTest.class.getClassLoader().getResource(""));
		System.out.println(PathTest.class.getClassLoader().getResource("/"));
		System.out.println("****************************************************************");
	}

	public static void print(Properties properties) {
		for (Entry<Object, Object> entry : properties.entrySet()) {
			System.out.println(entry.getKey() + ":" + entry.getValue());
		}
	}

	public static void print(Map<String, String> env) {
		for (Entry<String, String> entry : env.entrySet()) {
			System.out.println(entry.getKey() + ":" + entry.getValue());
		}
	}

}
