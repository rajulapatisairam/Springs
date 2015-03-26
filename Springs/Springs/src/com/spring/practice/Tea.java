package com.spring.practice;

import com.springs.practice.commons.IHotDrink;

public class Tea implements IHotDrink{

	@Override
	public void prepareHotDrink() {
		// TODO Auto-generated method stub
		System.out.printf("\n%s Hot Drink Preapred !....",this.getClass().toString());
	}

}
