package com.duandian.work;

import java.util.Scanner;

public class FizzBuzzWhizz {
	private final static int N = 100;
	private String[] studentSays; //玩这个游戏的学生的回复信息
	private Integer supernum1;  //第一个特殊数
	private Integer supernum2;  //第二个特殊数
	private Integer supernum3;  //第三个特殊数
	private Scanner cin; 
	public void init(){
		studentSays = new String[N + 1];
		for(int i = 1; i <= N; i++){
			studentSays[i] = "";
		}
		cin = new Scanner(System.in);
		getSuper();
		dabiao_first(supernum1,"Fizz");
		dabiao_first(supernum2,"Buzz");
		dabiao_first(supernum3,"Whizz");
		dabiao_sec(supernum1,"Fizz");
	}

	public synchronized void getSuper(){
		String line = cin.nextLine();
		line = line.trim();
		supernum1 = line.charAt(0) - '0';
		supernum2 = line.charAt(2) - '0';
		supernum3 = line.charAt(4) - '0';
	}

	//对num的倍数加上字符串s
	public void dabiao_first(int num, String s){
		for(int i = num; i <= N; i += num){
			studentSays[i] += s;
		}
	}
	
	//主要针对第六条限制，将十位或者个位包含num的数字等于Fizz
	public void dabiao_sec(int num, String s){
		int i;
		for(i = 0; i + num <= N; i += 10){
			studentSays[i + num] = s;
		}
		for(i = 0; i < 10; i++){
			studentSays[num * 10 + i] = s;
		}
		for(i = 0; i + num * 100 <= 100; i++){
			studentSays[i + num * 100] = s;
		}
	}
	
	public void play(){
		int i;
		for(i = 1; i < studentSays.length; i++){
			if("".equals(studentSays[i])){
				say(i);
			}else{
				say(studentSays[i]);
			}
		}
	}
	
	public synchronized void say(String s){
		System.out.println(s);
	}
	public synchronized void say(Integer s){
		System.out.println(s);
	}
}
