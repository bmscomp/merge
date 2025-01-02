package com.bmscomp.partial;

import java.util.function.BiFunction;
import java.util.function.Function;

public record PartialApplication() {

    Function<String, Integer> partialApplication(BiFunction<String, String, Integer> bi, String word) {
        return s -> bi.apply(word, s);
    }


    public static void main(String[] args) {
        System.out.println("This is a demo for partial applications!");
    }
}
