//テンプレートエンジン　Thymeleaf   (th:text属性)

package com.example.sample1app;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;


import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMethod; //追記
import org.springframework.web.bind.annotation.RequestParam; //追記
import org.springframework.web.servlet.ModelAndView;
import java.util.List;

/*
 /アクセスでホーム画面　名前入力送信
  show画面呼び出され、　「名前さん、ようこそ」　ホームボタンでホーム画面に戻る
 
 */

@Controller//ゲストからのリクエストはこのコントローラーで受ける
public class HelloController {
	//（/）へのGETリクエストはここで受ける
	@GetMapping("/")
	//	ホームへのリクエスト受けたらModelに文字列渡して、index.htmlを指定するという情報をビュー（HTMLファイル）に渡す
	public String ShowHome(Model model) {
	  model.addAttribute("msg","名前を書いて下さい。");
	  model.addAttribute("check","好きなもの全てにチェック入れて下さい");
	  return "home";
	}
	
	//（/）へのPOSTリクエストはここで受ける。HTML指定
	@PostMapping("/submit")
	public String form(@RequestParam("text1") String str, @RequestParam("check1") List<String> check1,			
			Model model) {
	  model.addAttribute("msg","こんにちは、" + str + "さん！");
	  model.addAttribute("value", str + "さん今日もがんばってください");
	  model.addAttribute("check1", check1);
	  return "show";
	}
}










/*//テンプレートエンジン　Thymeleaf   (th:text属性)

package com.example.sample1app;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMethod; //追記
import org.springframework.web.bind.annotation.RequestParam; //追記
import org.springframework.web.servlet.ModelAndView;


@Controller//ゲストからのリクエストはこのコントローラーで受ける
public class HelloController {
	//（/）へのGETリクエストはここで受ける
	@RequestMapping(value="/", method=RequestMethod.GET)
	public ModelAndView index(ModelAndView mav) {
	  mav.addObject("msg","名前を書いて下さい。");
	  mav.setViewName("index");
	  return mav;
	}
	//（/）へのPOSTリクエストはここで受ける。HTML指定
	@RequestMapping(value="/", method=RequestMethod.POST)
	public ModelAndView form(@RequestParam("text1") String str, ModelAndView mav) {
	  mav.addObject("msg","こんにちは、" + str + "さん！");
	  mav.addObject("value",str);
	  mav.setViewName("index");
	  return mav;
	}
}*/


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