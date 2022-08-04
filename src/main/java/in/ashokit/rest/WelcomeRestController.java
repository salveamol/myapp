package in.ashokit.rest;

	import org.springframework.http.HttpStatus;
	import org.springframework.http.ResponseEntity;
	import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

	@RestController
	public class WelcomeRestController {

		@GetMapping("/welcome")
		public ResponseEntity<String> getWelcomeMsg(@RequestParam("cname") String cname, @RequestParam("tname") String tname){
			String resPayLoad = cname+" By "+tname+" fee is 7000 INR";
			return new ResponseEntity<String>(resPayLoad, HttpStatus.OK);
		}
		
		@GetMapping("/greet")
		public String getGreetMsg() {
			String resPayLoad = "Good Morning...!!!";
			return resPayLoad;
		}
	}


