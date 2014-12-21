package kkonyshev.web_app;

import kkonyshev.web.api.HelloRes;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/api")
public class ApiController {
	
	@RequestMapping(value="hello/{name}", method = RequestMethod.GET, produces = "application/json")
	@ResponseBody
	public HelloRes hello(@PathVariable String name) {
		HelloRes res = new HelloRes();
		res.setName(name);
		return res;
	}
	
	
}
