package in.ineuron;

import java.io.File;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.fasterxml.jackson.databind.ObjectMapper;

import in.ineuron.model.Customer;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);

		try {

			ObjectMapper mapper = new ObjectMapper();

			// read the data

			Customer customer = mapper.readValue(new File("data/sample-full.json"), Customer.class);

			// Printing Simple Values
			System.out.println("Id::" + customer.getId());
			System.out.println("FirstName::" + customer.getFirstName());
			System.out.println("LastName::" + customer.getLastName());
			System.out.println("ISActive::" + customer.isActive());

			// Printing Has property

			System.out.println("Address::" + customer.getAddress());

			// printing array
			//System.out.println("Language::" + customer.getLanguage());

			for(String lang:customer.getLanguage())
			{
				System.out.println(lang);
			}
			//System.out.println(customer);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
