package com.sample.cleint;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class SimpleSerivce {

	@Value("${sample.var}")
	private String name;

	public String getName(){
		System.out.println("asd");
		return name;
	}
}
