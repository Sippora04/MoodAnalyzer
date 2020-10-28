package com.moodanalyzer;

@SuppressWarnings("serial")
class MoodAnalysisException extends Exception {
    enum MyException_Type{
        EMPTY,NULL;
    }
    MyException_Type type;
    MyException_Type exceptionMessage;
    MoodAnalysisException(MyException_Type type,String message) {
        super(message);
        this.type=type;
        System.out.println(message);
    }
}

public class MoodAnalyzer {
	private String message; 

	public String analyzeMood(String mood) throws MoodAnalysisException {
		try {
			if(message.length() == 0) {
				throw new MoodAnalysisException(MoodAnalysisException.MyException_Type.EMPTY,"You entered empty,please enter valid mood");
			}
			if(message.contains("sad")) 
				return "SAD";
			else if(message.contains("any"))
					return "HAPPY";
		} catch (NullPointerException e) {
			 throw new MoodAnalysisException(MoodAnalysisException.MyException_Type.NULL,"You entered null,please enter valid mood");
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
		public String moodAnalyzer(String string) {
			// TODO Auto-generated method stub
			return null;
		}
}
