package com.hanbit.horse.domain;

public class Horse {
	private String name, number;
	
	//디폴트 생성자: public Horse(){}
	//생성자는 자동으로 호출된다.
	
	//디폴트 생성자를 오버로드
	//setter는 고칠수 있다는 전제가 붙으며 어디에선가 호출해줘야 한다.
	//그러나 고칠수 없는 부분(setter사용X)을 생성자에 처리하면 자동으로 생성자가 호출되면서 같이 호출된다.
	public Horse(String number, String name){
		this.name = name;
		this.number = number;
	}
	
	public String getName(){
		return name;
	}
	public String getNumber(){
		return number;
	}
}
