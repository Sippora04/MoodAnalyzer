package com.moodanalyzer;

import static org.junit.Assert.*;

import org.junit.Test;

public class MoodAnalyzerTest {

	@Test
    public void givenMeassage_WhenSad_ThenReturnMood() {
        MoodAnalyzer moodAnalyzeObj = new MoodAnalyzer("I am in sad mood");
        String mood=moodAnalyzeObj.analyzeMood("");
        assertEquals("SAD", mood);
    }
	
	@Test
    public void givenMeassage_WhenNotSad_ThenReturnMood() {
        MoodAnalyzer moodAnalyzeObj = new MoodAnalyzer("I am in any mood");
        String mood = moodAnalyzeObj.analyzeMood("");
        assertEquals("HAPPY", mood);
    }
	
	 @Test
	 public void givenNull_WhenInvalid_ShouldReturnHappy() {
		 MoodAnalyzer moodAnalyzeObj = new MoodAnalyzer();
	     String mood = moodAnalyzeObj.analyzeMood("");
	     assertEquals("HAPPY", mood);
	    }
}
