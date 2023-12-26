package ineuron.PojoToJSON;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.exc.StreamWriteException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

import ineuron.PojoToJSON.model.Product;

public class App {
	public static void main(String[] args) throws JsonProcessingException {

		Product product = new Product();
		product = getProductDetails(product);

		System.out.println("Java Object" + product);

		//create object mapper to read or write json to and from the pojo class
		ObjectMapper mapper = new ObjectMapper();
		String jsonData = mapper.writeValueAsString(product);

		System.out.println("JSON Object" + mapper.writeValueAsString(product));

		
		//Writing data to json file
		
		try {
			mapper.writeValue(new File("product-list.json"), mapper.writeValueAsString(product));
			
			System.out.println("Wrote data to JSON file");
		} catch (StreamWriteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (DatabindException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static Product getProductDetails(Product product) {

		product.setId(10);
		product.setName("shanaya");
		product.setPrice(234.45f);
		product.setType(new String[] {"chronography","Simple","Automatic"});

		return product;

	}
}
