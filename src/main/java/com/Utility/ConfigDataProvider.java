package com.Utility;

import java.io.FileInputStream;
import java.util.Properties;

public class ConfigDataProvider {
	Properties pro;
	public ConfigDataProvider() throws Exception {
		String pathconfig="C:\\Users\\Dell\\eclipse-workspace\\Batch_11_Framework\\Config\\config.Properties";
		FileInputStream file=new FileInputStream(pathconfig);
		 pro=new Properties();
		 pro.load(file);
	}

	public String getBaseUrl_QA1() {
		return pro.getProperty("BaseUrl_QA1");
	}
	
	public String getBaseUrl_QA2() {
		return pro.getProperty("BaseUrl_QA2");
	}
	
	
	
}
