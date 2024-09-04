package com.example.sample1app;

//javax.swingパッケージ：Javaの標準ライブラリ。GUIを構成するためのクラスが内蔵。
//JFrameクラス: トップレベルのウィンドウ。これを土台にして、ラベルやボタン、テキストフィールドが配置される。
import javax.swing.JFrame;
//swingライブラリに含まれるクラス。テキストや画像など静的な情報を表示するコンポーネント。
import javax.swing.JLabel;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.Banner.Mode;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class SampleBootApp1Application implements ApplicationRunner {

	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(SampleBootApp1Application.class);
		app.setBannerMode(Mode.OFF);
		//デフォルトはTrue.falseにすると実行時にUIウィンドウが出てくる。
		app.setHeadless(false);
		//app実行
		app.run(args);
	}
	
	@Override
	public void run(ApplicationArguments args) {
		//「Spring Boot Swing App」というタイトルの新しいウィンドウを作成します
		JFrame frame = new JFrame("Spring Boot Swing App");
		//ウィンドウを閉じたらプログラム終了
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//ウィンドウのサイズ指定
		frame.setSize(300,200);
		//新しいラベル追加（中身はSpring Boot Application.）
		frame.add(new JLabel("Spring Boot Application."));
		//ウィンドウ表示
		frame.setVisible(true);
		/*
		System.out.println("+--------------------------------------------+");
		System.out.println("|   this is Application Runner program.    |");
		System.out.println("+--------------------------------------------+");
		System.out.println(args.getOptionNames());
		System.out.println(args.getNonOptionArgs());
		System.out.println(Arrays.asList(args.getSourceArgs()));

		*/
	}
}
