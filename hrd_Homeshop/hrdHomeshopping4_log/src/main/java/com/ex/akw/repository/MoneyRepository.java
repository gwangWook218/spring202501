package com.ex.akw.repository;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ex.akw.dto.MoneyDTO;

@Repository
public class MoneyRepository {

	@Autowired
	private SqlSessionTemplate sql;
	
	public List<MoneyDTO> findAll() {
		return sql.selectList("Money.findAll");
	}
}
