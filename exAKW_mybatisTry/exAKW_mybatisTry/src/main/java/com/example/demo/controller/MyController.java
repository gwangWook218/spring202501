package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Member;
import com.example.demo.service.MyService;

@RestController
public class MyController {
	@Autowired
	private MyService myService;
	
	@GetMapping("member")
	public List<Member> getMembers() {
		List<Member> list = myService.selectMembers();
		return list;
	}
}
