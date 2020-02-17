package com.task4.task_4.task_4;
import java.lang.Math;
public class Interest {
	
	public double SimpleInterest(double Principal, double rate, double time) {
		double simpleInterest = (Principal*time*rate)/100;
		return simpleInterest;
	}
	
	public double CompoundInterest(int Principal, int rate, int time) {
		double Amount = Principal*Math.pow((1.0+(rate/100.0)),time);
		double compoundInterest = Amount - Principal;
		return compoundInterest;
	}
}