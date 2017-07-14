package com.hanbit.race.serviceImpl;

import java.util.List;
import java.util.Random;
import java.util.Vector;

//스레드 사용 => implements Runnable
public class Race implements Runnable {
	public static List<String> list = new Vector<>();

	@Override
	public void run() {	//랜덤 클래스
		Random ran = new Random();
		for(int i=0; i<11; i++){
			//this(이 클래스의 객체)를 대상으로 동기화를 건다
			//synchronized가 한개의 Thread만 허용
			synchronized (this) {
				String name = Thread.currentThread().getName();
				System.out.println(name+" 라인"+(i*100)+"m 통과!!");
				if(i*100 == 1000){
					list.add(name); 	//add메서드로 name받음
				}
			}
			
			try{
				Thread.sleep(ran.nextInt(300));	//int값으로 3000변한다.
			}catch(Exception e){
				e.printStackTrace();
			}
		}
	}
}
