package in.ashokit.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookRestController {

	@GetMapping("/book/{name}")
	public ResponseEntity<String> getBookPrice(@PathVariable("name") String name){
		
		String resPayload = name+ " price is 400INR";
		
		return new ResponseEntity<String>(resPayload,HttpStatus.OK);
	}
	
	@GetMapping("/book/name/{bname}/author/{aname}")
	public ResponseEntity<String> getBook(@PathVariable("bname") String bname, @PathVariable("aname") String aname){
		String respPayload = bname+" By "+aname+" is out of stock";
		return new ResponseEntity<>(respPayload,HttpStatus.OK);
	}
}
