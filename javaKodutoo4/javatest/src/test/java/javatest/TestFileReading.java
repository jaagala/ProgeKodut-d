package javatest;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.HashMap;

import org.junit.Test;

/**
 * TestFileReading
 */
public class TestFileReading {

    // readFile
    @Test
    public void testIfReadFileExcisting() {
        String testFileName = "test.txt";
        FileReading KTfile = new FileReading(testFileName);
        String result = KTfile.read_file();
        System.out.println(result);
        assertTrue(result != null);
    }

    @Test
    public void testIfReadFileIsWorking() {
        String testFileName = "test.txt";
        String expected = "test on see";
        FileReading KTfile = new FileReading(testFileName);
        String result = KTfile.read_file();
        assertEquals(expected, result);
    }

    // splitWords
    @Test
    public void testIfSplitWordsHasArrayToSplit() {
        String text = "test.txt";
        FileReading KTfile = new FileReading(text);
        String[] result = KTfile.split_to_words();
        assertTrue(result != null);
    }

    @Test
    public void testIfSplitWordsCountsRight() {
        String sPath = "test.txt";
        String text = "see on test";
        String[] textArray = text.split("\\s");
        FileReading KTfile = new FileReading(sPath);
        String[] result = KTfile.split_to_words();
        assertArrayEquals(textArray, result);
    }

    // lowerCase
    @Test
    public void testIfLowerCaseWorks() {
        String sPath = "javatest/test.txt";
        FileReading KTfile = new FileReading(sPath);
        String[] result = KTfile.words_to_lowercase();
        assertTrue(result != null);
    }

    @Test
    public void testIfLowerCaseWorksCorrectly() {
        String sPath = "test.txt";
        FileReading KTfile = new FileReading(sPath);
        String[] result = KTfile.words_to_lowercase();
        assertEquals(result[0], "test");
    }

    // count
    @Test
    public void testIfCountTheWordsGetsInfo() {
        String sPath = "test.txt";
        HashMap<String, Integer> word_counter = new HashMap<>();
        FileReading KTfile = new FileReading(sPath);
        word_counter = KTfile.count_the_words();
        assertTrue(word_counter != null);
    }

    @Test
    public void testIfCountTheWordsIsCorrect() {
        String sPath = "test.txt";
        HashMap<String, Integer> word_counter = new HashMap<>();
        FileReading KTfile = new FileReading(sPath);
        word_counter = KTfile.count_the_words();
        assertEquals(word_counter.values().toArray()[0], 2);
    }

}