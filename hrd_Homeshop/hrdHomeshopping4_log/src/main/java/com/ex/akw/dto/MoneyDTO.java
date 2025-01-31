package com.ex.akw.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class MoneyDTO {
	private Integer custno;
	private String custname;
	private String grade;
	private Integer price;
}
