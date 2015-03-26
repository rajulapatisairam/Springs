package com.spring.practice;

import java.util.List;

public class Restarunt {
private Tea tea;
private Coffie coffie;
private List<String> waiters;

public int value;

public void init(){
	System.out.println("\n Restarunt Class Init Method");
}

private Restarunt(Tea tea, Coffie coffie) {
	super();
	this.tea = tea;
	this.coffie = coffie;
	System.out.println("\n Restarun Object is Created !..........");
}

public void destroy(){
	System.out.println("\n Restarunt Class destroy() Method");
}
public List<String> getWaiters() {
	return waiters;
}


public void setWaiters(List<String> waiters) {
	this.waiters = waiters;
}


public void teaPreparation(){
	tea.prepareHotDrink();
}
public void coffiePreparation(){
	coffie.prepareHotDrink();
}
public Tea getTea() {
	return tea;
}
public void setTea(Tea tea) {
	this.tea = tea;
}
public Coffie getCoffie() {
	return coffie;
}
public void setCoffie(Coffie coffie) {
	this.coffie = coffie;
}




}
