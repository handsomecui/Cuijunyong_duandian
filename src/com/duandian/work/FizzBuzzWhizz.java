package com.duandian.work;

import java.util.Scanner;

public class FizzBuzzWhizz {
	private Student[] students; //玩这个游戏的学生
	private Integer supernum1;  //第一个特殊数
	private Integer supernum2;  //第二个特殊数
	private Integer supernum3;  //第三个特殊数
	private Scanner cin = new Scanner(System.in); 
	public void init(int n){
		students = new Student[n];
		for(int i = 0; i < n; i++){
			students[i] = new Student(i + 1);
		}
	}

	public void getSuper(){
		String line = cin.nextLine();
		line = line.trim();
		supernum1 = line.charAt(0) - '0';
		supernum2 = line.charAt(2) - '0';
		supernum3 = line.charAt(4) - '0';
	}

	public void handle(int value){
		if(cludeSuperNum1(value)){
			say("Fizz");
		}else if(value % supernum1 == 0 || value % supernum2 == 0 || value % supernum3 == 0){
			if(value % supernum1 == 0){
				say("Fizz");
			}
			if(value % supernum2 == 0){
				say("Buzz");
			}
			if(value % supernum3 == 0){
				say("Whizz");
			}
		}else{
			say(value);
		}
		System.out.println();
	}
	private boolean cludeSuperNum1(int value) {
		while(value != 0){
			if(value % 10 == supernum1){
				return true;
			}
			value /= 10;
		}
		return false;
	}
	
	public void play(){
		int i;
		for(i = 0; i < students.length; i++){
			handle(students[i].getValue());
		}
	}
	
	public Student[] getStudents() {
		return students;
	}

	public void say(String s){
		System.out.print(s);
	}
	public void say(Integer s){
		System.out.print(s);
	}
}
