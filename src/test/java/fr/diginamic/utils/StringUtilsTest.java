package fr.diginamic.utils;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringUtilsTest {

    @Test
    void levenshteinDistance_chatsChat() {
        Integer i = StringUtils.levenshteinDistance("chats", "chat");
        assertEquals(1, i);
    }

    @Test
    void levenshteinDistance_machinsMachine() {
        Integer i = StringUtils.levenshteinDistance("machins", "machine");
        assertEquals(1, i);
    }

    @Test
    void levenshteinDistance_avironAvion() {
        Integer i = StringUtils.levenshteinDistance("aviron", "avion");
        assertEquals(1, i);
    }


    @Test
    void levenshteinDistance_distanceInstance() {
        Integer i = StringUtils.levenshteinDistance("distance", "instance");
        assertEquals(2, i);
    }


    @Test
    void levenshteinDistance_chienChine() {
        Integer i = StringUtils.levenshteinDistance("chien", "chine");
        assertEquals(2, i);
    }



    @Test
    void levenshteinDistance_chienNull() {
        Integer i = StringUtils.levenshteinDistance("chien", null);
        assertNull(i);
    }



    @Test
    void levenshteinDistance_nullNull() {
        Integer i = StringUtils.levenshteinDistance(null, null);
        assertNull(i);
    }



}