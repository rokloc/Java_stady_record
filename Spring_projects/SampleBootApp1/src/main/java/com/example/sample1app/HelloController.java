//テンプレートエンジン　Thymeleaf

package com.example.sample1app;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;


@Controller
public class HelloController {
	@RequestMapping()
	public String index(Model model) {
	  model.addAttribute("msg", "これはコントローラーに用意したメッセージです。これが動的なコンテンツです");
	  return "index";
	}
}





//Controller(RESTでない普通の）
/*
package com.example.sample1app;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;


import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class HelloController {
	  
		@RequestMapping("/{tmp}")
		public String index(@PathVariable("tmp") String tmp) {
		    if (tmp.equals("index")) {
		        return "index";
		    }
		    return "other";
		}

}
*/