package token;

public enum Punctuation {
	PERIOD,
	EXCLAMATION,
	QUESTION,
	COMMA;
	
	public static Punctuation determineType(char c) {
		switch(c) {
		case '.': return PERIOD;
		case '!': return EXCLAMATION;
		case '?': return QUESTION;
		case ',': return COMMA;
		default: return null;
		}
	}
}
