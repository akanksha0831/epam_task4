package com.task4.task_4.task_4;

import static org.junit.Assert.*;

import org.junit.Test;

public class SimpleInterestTest {

	private static final double PRECISION = 0.00001;
	@Test
	public void test() {
		Interest test = new Interest();
		double output = test.SimpleInterest(6000, 15, 7);
		assertEquals(6300.00,output,PRECISION);
	}

}