package in.ineuron.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Customer {

	private Integer id;
	private String firstName;
	private String lastName;
	private boolean active;

	
	//Has property Address from sample-full file
	private Address address;
	
	//Array Property from sample-full file
	
	private String[] language;
	
}
