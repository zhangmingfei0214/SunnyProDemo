package com.sunny.project;

/**
 *模拟客户端的实现
 */
public class SunnyTest {
	public static void main(String[] args) {
		
//		HairInterface left = new LeftHair();
//		left.draw();
		
//		HairFactory factory = new HairFactory();
//		HairInterface left = factory.getHair("left");
//		left.draw();
		
//		HairFactory factory = new HairFactory();
//		HairInterface left = factory.getHairByClass("com.sunny.project.LeftHair");
//		left.draw();
		
//		HairFactory factory = new HairFactory();
//		HairInterface hair = factory.getHairByClassKey("in");
//		hair.draw();
		
//		PersonFactory factory = new MCFactory();
//		Girl girl = factory.getGirl();
//		girl.drawWomen();
		
		PersonFactory factory = new HNFactory();
		Boy boy = factory.getBoy();
		boy.drawMan();
	}
	
}
