package com.example.demo.ch03.used;

import org.springframework.stereotype.Component;

@Component
public class EveningGreet implements Greet {

	@Override
	public void greeting() {
		// TODO Auto-generated method stub
		System.out.println("-----------------");
		System.out.println("시원한 저녁입니다.");
		System.out.println("-----------------");
	}

}
