package in.ineuron.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/course")
public class CourseController {

	@GetMapping("/info/{id}")
	public ResponseEntity<String> getCourseInfo(@PathVariable Integer id) {

		System.out.println("CourseController.getCourseInfo()");

		String body = null;

		if (id == 5) {
			body = "Nitin Sir batch Started";
		} else if (id == 6) {
			body = "Navin Sir Batch Started";
		} else
			body = "Contact Ineuron for more info";

		return new ResponseEntity<String>(body, HttpStatus.OK);

	}

	@GetMapping("/info/{id}/JRTP/{name}")
	public ResponseEntity<String> getCourseInfo(@PathVariable Integer id, @PathVariable String name) {

		System.out.println("CourseController.getCourseInfo()");

		String body = null;

		if (id == 5 && name.equalsIgnoreCase("Nitin")) {
			body = "Nitin Sir batch Started";
		} else if (id == 6 && name.equalsIgnoreCase("Navin")) {
			body = "Navin Sir Batch Started";
		} else if (id == 7 && name.equalsIgnoreCase("Haider"))
			body = "Contact Ineuron for more info";

		return new ResponseEntity<String>(body, HttpStatus.OK);

	}

}
