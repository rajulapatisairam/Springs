package com.spring.practice;

public class HelloSpring {
	private String greeting;
public void greetSpring(){
	System.out.println("\n"+getGreeting());
}
public String getGreeting() {
	return greeting;
}
public void setGreeting(String greeting) {
	this.greeting = greeting;
}


}
