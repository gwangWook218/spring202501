package com.ex.akw.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ex.akw.dto.BoardDTO;
import com.ex.akw.repository.BoardRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class BoardService {

//	DB 사용하기 위한 준비
	private final BoardRepository boardRepository;
	
	public void save(BoardDTO dto) {
		boardRepository.save(dto);
	}
	
	public List<BoardDTO> findAll() {
		return boardRepository.findAll();
	}
	
	public BoardDTO findById(Long id) {
		return boardRepository.findById(id);
	}
	
	public void update(BoardDTO dto) {
		boardRepository.update(dto);
	}
	
	public void delete(Long id) {
		boardRepository.delete(id);
	}
}
