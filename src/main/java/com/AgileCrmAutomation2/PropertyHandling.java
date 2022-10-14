package com.AgileCrmAutomation2;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyHandling {
	
	private Properties properties;
	
	public PropertyHandling() {
		//config file path
		String configFilePath=System.getProperty("user.dir")+"//config.properties";
		try {
			FileInputStream input=new FileInputStream(configFilePath);
			properties=new Properties();
			properties.load(input);
			
		}catch(IOException e){
			e.printStackTrace();
			
		}
		
		
	}
	
	public String getValue(String key) {
		return properties.getProperty(key);
		
		
	}

}
