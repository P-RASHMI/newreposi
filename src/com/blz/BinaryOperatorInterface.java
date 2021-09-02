package com.blz;

import java.util.function.BinaryOperator;

public class BinaryOperatorInterface {
public static void main(String[] args) {
	BinaryOperator<Integer> test = (Integer a,Integer b)->{
		return a+b;
	};
	test.apply(1, 20);
}
}
