package ca.ualberta.cs.lonelytwitter.data;

import java.util.Date;

public class NormalLonelyTweet extends LonelyTweet {

	private static final String SEPARATOR = " | ";
	private static final long serialVersionUID = 1L;

	public NormalLonelyTweet() {
	}

	public NormalLonelyTweet(String text, Date date) {
		this.setTweetDate(date);
		this.setTweetBody(text);
	}

	@Override
	public boolean isValid() {
		int length = getTweetBody().trim().length();
		if (length == 0	|| length > 10) {
			return false;
		}

		return true;
	}

	@Override
	public String toString() {
		return getTweetDate() + SEPARATOR + getTweetBody();
	}

}
