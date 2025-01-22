package com.ex.akw.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.ex.akw.dto.BoardDTO;
import com.ex.akw.service.BoardService;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
public class BoardController {

	private final BoardService boardService;
	
	@GetMapping("/save")
	public String save() {
		return "save";
	}
	
	@PostMapping("/save")
	public String save(BoardDTO dto) {
		System.out.println("-----콘솔값을 확인하자-----");
		System.out.println("DTO = " + dto);
		return "index";
	}
}
