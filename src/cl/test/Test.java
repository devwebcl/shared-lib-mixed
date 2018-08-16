package cl.test;
import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * 
 * @author German
 * 
 *  mvn clean package
 *  mvn exec:java
 */


public class Test {

	public static void main(String[] args) {
		
		ObjectMapper objectMapper = new ObjectMapper();
		Car car = new Car("yellow", "renault");
		
		try {
			
			objectMapper.writeValue(new File("target/car.json"), car);
			
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
