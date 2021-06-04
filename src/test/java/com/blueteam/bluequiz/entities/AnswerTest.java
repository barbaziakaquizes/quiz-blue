package com.blueteam.bluequiz.entities;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Field;

import static org.junit.jupiter.api.Assertions.*;

class AnswerTest {
    Answer a;
    @Test
    void builder() {
        a = new Answer("1", "1", true);
    }

    @Test
    void get_id() throws NoSuchFieldException, IllegalAccessException {
        a = new Answer("1", "1", true);
        Field field = a.getClass().getDeclaredField("_id");
        field.setAccessible(true);
        Object s = field.get(a);
        assertEquals(s, "1");
    }

    @Test
    void getAnswerTitle() throws NoSuchFieldException, IllegalAccessException {
        a = new Answer("1", "1", true);
        Field field = a.getClass().getDeclaredField("answerTitle");
        field.setAccessible(true);
        Object s = field.get(a);
        assertEquals(s, "1");
    }

    @Test
    void isCorrect() throws NoSuchFieldException, IllegalAccessException {
        a = new Answer("1", "1", true);
        Field field = a.getClass().getDeclaredField("isCorrect");
        field.setAccessible(true);
        Object s = field.get(a);
        assertEquals(s, true);
    }
}
