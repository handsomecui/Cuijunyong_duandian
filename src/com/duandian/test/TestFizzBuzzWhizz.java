package com.duandian.test;

import org.junit.Test;

import com.duandian.work.FizzBuzzWhizz;

public class TestFizzBuzzWhizz {
	
	@Test
	public void test(){
		FizzBuzzWhizz fizzBuzzWhizz = new FizzBuzzWhizz();
		fizzBuzzWhizz.init();
		fizzBuzzWhizz.play();
	}
}
