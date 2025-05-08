package study.inherit.inherit02;

import study.inherit.inherit01.Parent;

public class HiddenChild extends Parent{	
	
	public HiddenChild() {
		super(0);
	}
	
	public void printInfo() {
		System.out.println(money);
	}
}
