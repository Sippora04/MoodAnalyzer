package com.moodanalyzer;

public class MoodAnalyzer {
	private String message; 

	public String analyzeMood(String mood) {
		try {
			if(message.contains("sad")) 
				return "SAD";
			else if(message.contains("any"))
					return "HAPPY";
		} catch (NullPointerException e) {
			return "HAPPY";
		}
		return mood;
	}
		//Default Constructor
		public MoodAnalyzer() {
		
		}
		// Parameterized Constructor
		public MoodAnalyzer(String message) {
			this.message = message;
		}
}
