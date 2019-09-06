package com.cleartrip.oneway;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class flightreadproperties {

	public String readPropertiesFile(String elements) throws IOException {
		Properties prop = new Properties();
		FileInputStream input = new FileInputStream(
				"C:\\Users\\Suraj.konangi\\eclipse-workspace\\cleartrip\\Resources\\locators\\flight.properties");
		try {
			prop.load(input);

		} catch (Exception e) {
			e.printStackTrace();
		}

		String data = prop.getProperty(elements);
		return data;

	}
}