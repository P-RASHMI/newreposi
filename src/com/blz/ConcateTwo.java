package com.blz;

import java.util.function.BiFunction;

public class ConcateTwo {
	public static void main(String[] args) {
	BiFunction<String,String,String> biFunction = (first,second) -> {
        return first+second;
    };

    System.out.println(biFunction.apply("ABC","PQR"));
}

}
