package com.yy.shennong;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

public class ParameterTest {

    @ParameterizedTest
    @ValueSource(ints = { 0,1,3,7 })
    void palindromes(int argument) {
        assertTrue(argument > 0 && argument < 4);
    }

    @ParameterizedTest
    @MethodSource("stringProvider")
    void testMethod(String argument){
        assertNotNull(argument);
    }

    static Stream<String> stringProvider(){
        return Stream.of("yy","xxy");
    }
}
