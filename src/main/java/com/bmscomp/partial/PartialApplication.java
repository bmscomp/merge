package com.bmscomp.partial;

import java.util.function.BiFunction;
import java.util.function.Function;

public record PartialApplication() {

    private static BiFunction<String, String, Integer> bi = String::indexOf;

    static Function<String, Integer> partialApplication(BiFunction<String, String, Integer> biFunction,
                                                        String word) {
        return s -> biFunction.apply(word, s);
    }


    public static void main(String[] args) {
        System.out.println("This is a demo for partial applications!");
        var f = partialApplication(bi, "Hello");
        System.out.println(f.apply("Hello"));
        System.out.println(f.apply("Hello World"));
    }
}
