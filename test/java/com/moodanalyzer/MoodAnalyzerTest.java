package com.moodanalyzer;

import static org.junit.Assert.*;

import org.junit.Test;

public class MoodAnalyzerTest {

	@Test
    public void givenMeassage_WhenValid_ThenReturnMood() {
        MoodAnalyzer moodAnalyzeObj = new MoodAnalyzer("I am in sad mood");
        String mood=moodAnalyzeObj.analyzeMood("");
        assertEquals("SAD", mood);
    }
	
    //TEST CASE TO CHECK HAPPY MOOD
    @Test
    public void givenMeassage_WhenInvalid_ThenReturnMood() {
        MoodAnalyzer moodAnalyzeObj = new MoodAnalyzer("I am in any mood");
        String mood = moodAnalyzeObj.analyzeMood("");
        assertEquals("HAPPY", mood);
    }
}
