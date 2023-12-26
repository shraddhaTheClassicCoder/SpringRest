package in.ineuron.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customer")
public class CustomerOperationController {

	@SuppressWarnings("unchecked")
	@GetMapping("/report")
	public ResponseEntity<String> showCustomer() {

		return new ResponseEntity("From Get-showCustomer Method", HttpStatus.OK);

	}

	@SuppressWarnings("unchecked")
	@PostMapping("/register")
	public ResponseEntity<String> registerCustomer() {

		return new ResponseEntity("From Post-registerCustomer Method", HttpStatus.OK);

	}

	@SuppressWarnings("unchecked")
	@PutMapping("/modify")
	public ResponseEntity<String> updateCustomer() {

		return new ResponseEntity("From update-showCustomer Method", HttpStatus.OK);

	}

	@SuppressWarnings("unchecked")
	@PatchMapping("/pmodify")
	public ResponseEntity<String> updateCustomerByNo() {

		return new ResponseEntity("From Patch-update Method", HttpStatus.OK);

	}

	@SuppressWarnings("unchecked")
	@DeleteMapping("/delete")
	public ResponseEntity<String> deleteCustomer() {

		return new ResponseEntity("From deleteCustomer Method", HttpStatus.OK);

	}

}
