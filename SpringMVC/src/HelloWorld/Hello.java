package HelloWorld;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Hello {
	
	@RequestMapping("/home")
	public String hello() {
		System.out.println("hello");
		return "success";
	}
	@RequestMapping("/about")
	public String about() {
		System.out.println("about");
		return "about";
	}
}
