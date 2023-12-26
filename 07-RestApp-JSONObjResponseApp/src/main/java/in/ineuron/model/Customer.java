package in.ineuron.model;

import java.util.List;
import java.util.Map;
import java.util.Set;

import lombok.Data;

@Data
public class Customer {

	
	private Integer cid;
	private String Cname;
	private Float avg;
	private String[] teamName;
	private List<String> studies;
	private Set<Long> phoneNo;
	private Map<String, Object> iddetails;
	
	private Company company;
}
