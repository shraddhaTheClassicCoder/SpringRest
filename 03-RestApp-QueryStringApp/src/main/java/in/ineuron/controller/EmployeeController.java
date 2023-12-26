package in.ineuron.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

	@GetMapping("/read")
	public ResponseEntity<String> getEmployee(@RequestParam(defaultValue = "10", required = false) int id,
			@RequestParam(defaultValue = "Shraddha", required = false) String name) {
		System.out.println("EmployeeController.getEmployee()" + id + "Name is " + name);

		String body = null;

		if (id == 7 && name.equalsIgnoreCase("dhoni"))

			body = "CSK Team";
		else if (id == 8 && name.equalsIgnoreCase("kohli"))
			body = "RCB";
		else
			body = "other team";
		return new ResponseEntity<String>(body, HttpStatus.OK);

	}

}
