package com.ex.akw.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
		System.out.println("DTO = " + dto);
		boardService.save(dto);
		return "redirect:/list";
	}
	
	@GetMapping("/list")
	public String findAll(Model model) {
		List<BoardDTO> boardDTOList = boardService.findAll();
		model.addAttribute("boardList", boardDTOList);
		System.out.println("boardDTOList = " + boardDTOList);
		return "list";
	}
	
	@GetMapping("/{id}")
	public String findById(@PathVariable("id") Long id, Model model) {
		BoardDTO dto = boardService.findById(id);
		model.addAttribute("board", dto);
		System.out.println("boardDTO = " + dto);
		return "detail";
	}
	
	@GetMapping("/update/{id}")
	public String update(@PathVariable("id") Long id, Model model) {
		BoardDTO dto = boardService.findById(id);
		model.addAttribute("board", dto);
		return "update";
	}
	
	@PostMapping("/update/{id}")
	public String update(BoardDTO boardDTO, Model model) {
		boardService.update(boardDTO);
		BoardDTO dto = boardService.findById(boardDTO.getId());
		model.addAttribute("board", dto);
		return "detail";
	}
	
	@GetMapping("/delete/{id}")
	public String delete(@PathVariable("id") Long id) {
		boardService.delete(id);
		return "redirect:/list";
	}
}
