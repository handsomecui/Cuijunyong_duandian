package com.duandian.test;

import org.junit.Test;

import com.duandian.work.FizzBuzzWhizz;

public class TestFizzBuzzWhizz {
	
	@Test
	public void test1(){
		FizzBuzzWhizz fizzBuzzWhizz = new FizzBuzzWhizz();
		fizzBuzzWhizz.init(100);
		fizzBuzzWhizz.getSuper();
		fizzBuzzWhizz.play();
	}
}
