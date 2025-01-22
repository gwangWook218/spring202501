package com.ex.akw.repository;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import com.ex.akw.dto.BoardDTO;

import lombok.RequiredArgsConstructor;

@Repository
@RequiredArgsConstructor
public class BoardRepository {

	private final SqlSessionTemplate template;
	
	public BoardDTO save(BoardDTO dto) {
		template.insert("Board.save", dto);
		return dto;
	}
	
	public List<BoardDTO> findAll() {
		return template.selectList("Board.findAll");
	}
}
