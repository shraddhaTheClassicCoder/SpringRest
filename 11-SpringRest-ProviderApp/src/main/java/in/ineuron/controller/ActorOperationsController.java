package in.ineuron.controller;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.ineuron.model.Actor;

@RestController
@RequestMapping("/api/actor")
public class ActorOperationsController {

	@GetMapping("/wish")
	public ResponseEntity<String> dispWishMsg() {

		LocalDateTime ldt = LocalDateTime.now();

		int hour = ldt.getHour();

		String body = null;
		String name = "shraddha";
		if (hour < 12)
			body = "Good Morning ::" + name;
		else if (hour < 16)
			body = "Good Afternoon ::" + name;
		else if (hour < 20)
			body = "Good Evening ::" + name;
		else if (hour < 24)
			body = "Good Night ::" + name;
		return new ResponseEntity<String>(body, HttpStatus.OK);

	}

	@GetMapping("/wish/{id}/{name}")
	public ResponseEntity<String> dispPathVarContent(@PathVariable Integer id, @PathVariable String name) {

		LocalDateTime ldt = LocalDateTime.now();

		int hour = ldt.getHour();

		String body = null;

		if (hour < 12)
			body = "Good Morning ::" + name + " Associated Id is :" + id;
		else if (hour < 16)
			body = "Good Afternoon ::" + name + " Associated Id is :" + id;
		else if (hour < 20)
			body = "Good Evening ::" + name + " Associated Id is :" + id;
		else if (hour < 24)
			body = "Good Night ::" + name + " Associated Id is :" + id;

		return new ResponseEntity<String>(body, HttpStatus.OK);
	}

	@PostMapping("/register")
	public ResponseEntity<String> registerActor(@RequestBody Actor actor) {

		return new ResponseEntity<String>("Actor is " + actor.toString(), HttpStatus.OK);

	}
	
	@GetMapping("/find/{id}")
	public ResponseEntity<Actor> searchActor(@PathVariable Integer id) {
		return new ResponseEntity<Actor>(new Actor(id, "nitin",29.0f, "Teacher"), HttpStatus.OK);
	}

}
