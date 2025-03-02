package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.mapper.MyMapper;
import com.example.demo.model.Member;

@Service
public class MyService {
	@Autowired
	private MyMapper myMapper;
	
	public List<Member> selectMembers() {
		return myMapper.selectMembers();
	}
}
