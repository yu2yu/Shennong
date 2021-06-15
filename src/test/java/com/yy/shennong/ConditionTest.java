package com.yy.shennong;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.EnabledForJreRange;
import org.junit.jupiter.api.condition.EnabledIfEnvironmentVariable;
import org.junit.jupiter.api.condition.EnabledOnJre;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.JRE;
import org.junit.jupiter.api.condition.OS;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class ConditionTest {

    @Test
    @EnabledOnOs(OS.MAC)
    void testOSMac(){
        System.out.println("mac");
    }

    @Test
    @EnabledOnOs(OS.WINDOWS)
    void testOSWin(){
        System.out.println("win");
    }

    @Test
    @EnabledOnJre(JRE.JAVA_8)
    void testJDKEight(){
        System.out.println("1.8");
    }

    @Test
    @EnabledForJreRange(min = JRE.JAVA_9,max = JRE.JAVA_15)
    void testJDKRange(){
        System.out.println("range");
    }

    @Test
    @EnabledIfEnvironmentVariable(named = "ENV", matches = "test")
    void testEnviromentVariable(){
        System.out.println("env");
    }
}
