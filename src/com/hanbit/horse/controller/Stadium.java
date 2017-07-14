package com.hanbit.horse.controller;

import com.hanbit.horse.domain.Horse;
import com.hanbit.race.serviceImpl.Race;

public class Stadium {
	public static void main(String[] args){
		Runnable target = new Race();
		Horse h1 = new Horse("1번말", "AA");
		Horse h2 = new Horse("2번말", "BB");
		Horse h3 = new Horse("3번말", "CC");
		
		Thread th1 = new Thread(target, h1.getNumber()+h1.getName());
		Thread th2 = new Thread(target, h2.getNumber()+h2.getName());
		Thread th3 = new Thread(target, h3.getNumber()+h3.getName());
		
		th1.start();
		th2.start();
		th3.start();
		
		try{
			
		}catch(Exception e){
			e.printStackTrace();
		}
		
		//값이 계속 바뀌는 경우 instance변수로 처리해야 한다. 그러나 값이 고정적인 경우 static(The One)으로 처리해야 한다. 
		//list앞에 static을 붙였으므로 클래스 맴버변수이다(new를 사용하지 않고 바로 접근)/ 없으면 instance 변수
		//Race.list: Race 안에 있는 list를 가져와라
		for(int i=0; i<Race.list.size(); i++){
			System.out.println((i+1)+"등은 "+Race.list.get(i));
		}
		
		
	}
}
