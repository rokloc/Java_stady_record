package com.example.sample1app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.stereotype.Controller;

//ソースコードが実行された時のエントリーポイント
@SpringBootApplication
public class SampleBootApp1Application {

	public static void main(String[] args) {
		//アプリが開始される
		SpringApplication.run(SampleBootApp1Application.class, args);
	}
}


//<2-15>
/*package com.example.sample1app;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class SampleBootApp1Application {

  public static void main(String[] args) {
    SpringApplication.run(SampleBootApp1Application.class, args);
  }
  

}
*/







/*<2_14> HTML出力

package com.example.sample1app;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SampleBootApp1Application {

  public static void main(String[] args) {
    SpringApplication.run(SampleBootApp1Application.class, args);
  }


  

  @RequestMapping("/")
  public String index(HttpServletRequest request, HttpServletResponse response) {
    response.setContentType(MediaType.TEXT_HTML_VALUE);
    String content = """
      <html>
        <head>
        <title>Sample App</title>
        </head>
        <body>
        <h1>GKホームページ</h1>
        <p>This is my homepage!</p>
         </body>
      </html>
      """;
    return content;
  }
}


}
*/





















/*<2 -13>　JSON形式

//classフォルダを実行すると@SpringBootApplicationアノテーション（エントリーポイント）->mainクラスの標準ライブラリSpringApplicationクラスのrunメソッドでアプリ始動。
//(/num)へのHTTPリクエストは`ResuestMappingで受取。numに応じたdata型のデータを返すプログラム

//Spring BootアプリケーションでJSON形式のデータを返すREST APIを作成する例
package com.example.sample1app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PathVariable;

//Springアプリのエントリーポイントになる
@SpringBootApplication
//RESTコントローラーになる。HTTPリクエストはここで受け取ることになる。HTTPリクエストを受け取って、HTTPレスポンスを返す
@RestController
//SampleBootApplicationクラス
public class SampleBootApp1Application {
	//DataObjectクラスのインスタンスdata
  DataObject[] data = {
		  //インスタンスにデータ格納
    new DataObject("noname","no email address",0),
    new DataObject("taro","taro@yamada",39),
    new DataObject("hanako","hanako@flower",28),
    new DataObject("sachiko","sachiko@happy",17),
    new DataObject("jiro","jiro@change",6)
  };

  //mainクラス
  public static void main(String[] args) {
	  //標準ライブラリSpringApplicationのrunメソッドを使ってアプリを起動する（引数にはbinフォルダに生成されるclassファイルとコマンドライン引数
	  SpringApplication.run(SampleBootApp1Application.class, args);
  }

  //ホームページではなく/numのリクエストに対応する
  @RequestMapping("/{num}")
  //返り値DataObject型のindexクラス　仮引数はパスで入力されたnum
  public DataObject index(@PathVariable("num") int num) {
    return data[num];
  }
}

//DataObjectクラス
class DataObject {
  private String name;
  private String mail;
  private int age;
  
  //コンストラクタ　（インスタンス生成時に自動呼び出し（変数初期化））
  public DataObject(String name, String mail, int age) {
	  //親クラス呼び出
    super();
    this.name = name;
    this.mail = mail;
    this.age = age;
  }
  
  //カプセル化している変数からNameを読み込むゲッターメソッド
  public String getName() {
	  return name; 
  }

  //セッターメソッド　（name)
  public void setName(String name) {
    this.name = name;
  }
  //ゲッターメソッド　（mail)
  public String getMail() {
	  return mail;
  }

  public void setMail(String mail) {
    this.mail = mail;
  }
  
  public int getAge() { return age; }

  public void setAge(int age) {
    this.age = age;
  }
}

*/
	
	
	
	
	
	
	
	
	
	













// <2-11 簡易版＞
/*
package com.example.sample1app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PathVariable;


//import org.springframework.web.bind.annotation.RequestMapping;


@SpringBootApplication
@RestController
public class SampleBootApp1Application {

	public static void main(String[] args) {
		SpringApplication.run(SampleBootApp1Application.class, args);
	}
	//「/」にアクセスしたらindexクラスが呼ばれる
	@RequestMapping("/{num}")
	public String index(@PathVariable("num") int num) {
	    if (num == 1) {
	        return "Hello, ONE!";
	    }
	    return "Hello, Spring Boot 3!!";
	}
}
*/
