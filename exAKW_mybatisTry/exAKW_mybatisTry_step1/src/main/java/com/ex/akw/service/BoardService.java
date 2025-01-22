package com.ex.akw.service;

import org.springframework.stereotype.Service;

import com.ex.akw.repository.BoardRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class BoardService {

//	DB 사용하기 위한 준비
	private final BoardRepository boardRepository;
}
