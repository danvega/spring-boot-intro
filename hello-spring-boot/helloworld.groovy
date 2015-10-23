@RestController
class HelloWorld {

	@RequestMapping("/")
	String home(){
		"Hello, World!"
	}

}