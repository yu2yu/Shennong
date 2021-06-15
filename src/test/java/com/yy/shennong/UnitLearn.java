package com.yy.shennong;

import com.yy.shennong.entity.Person;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.*;

/**
 *  <em>junit 5 learn</em>
 */
public class UnitLearn {

    Person person = new Person("YY","xxy");

    @Test
    void testStandardAssertions(){
        assertEquals("1","1");
        assertTrue('a'<'b');
    }

    @Test
    void testGroupAssertions(){
        assertAll("string",
                () -> assertEquals("YY", person.getFirstName()),
                () -> assertEquals("XXY",person.getLastName())
        );
    }


    @Test
    void testDependentAssertions(){
        assertAll("dependent",
                () -> {
                    String firstName = person.getFirstName();
                    Assertions.assertNotNull(firstName);

                    assertTrue(firstName.startsWith("Y"));
                }
        );
    }

    @Test
    void testExceptionAssertions(){
        Exception exception = assertThrows(
                ArithmeticException.class, () -> new Calculate().sub(1,0));
        assertEquals("/ by zero",exception.getMessage());
    }


    @Test
    void testTimeoutAssertions(){
        assertTimeout(Duration.ofSeconds(10),()->{
            TimeUnit.MINUTES.sleep(1);
        });
    }
}
