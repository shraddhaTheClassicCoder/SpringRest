package ineuron.PojoToJSON.model;

import lombok.Data;

@Data
public class Product {
	
	private Integer id;
	private String name;
	private float price;
	private String[] type;

}
