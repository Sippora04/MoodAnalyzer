package com.moodanalyzer;

import static org.junit.Assert.*;

import org.junit.Test;

public class MoodAnalyzerTest {

	@Test
    public void givenMeassage_WhenSad_ThenReturnMood() throws MoodAnalysisException {
        MoodAnalyzer moodAnalyzeObj = new MoodAnalyzer("I am in sad mood");
        String mood=moodAnalyzeObj.analyzeMood("");
        assertEquals("SAD", mood);
    }
	
	@Test
    public void givenMeassage_WhenNotSad_ThenReturnMood() throws MoodAnalysisException {
        MoodAnalyzer moodAnalyzeObj = new MoodAnalyzer("I am in any mood");
        String mood = moodAnalyzeObj.analyzeMood("");
        assertEquals("HAPPY", mood);
    }
	
	@Test
    public void givenNull_WhenInvalid_ThenReturn() {
        MoodAnalyzer mood = new MoodAnalyzer(null);
        try {
        	String reaction=mood.moodAnalyzer("");
        } catch (MoodAnalysisException e) {
            assertEquals(MoodAnalysisException.MyException_Type.NULL,e.type);
        }
    }
	
    @Test
    public void givenEmpty_WhenInvalid_ThenTrue()  {
        MoodAnalyzer mood = new MoodAnalyzer("");
        try {
            String reaction=mood.moodAnalyzer("");
        } catch (MoodAnalysisException e) {
            assertEquals(MoodAnalysisException.MyException_Type.EMPTY,e.type);
        }
    }
}