package ca.ualberta.cs.lonelytwitter.data;

import java.util.Date;


import android.util.Log;

public class ImportantTweet extends LonelyTweet {

	private static final String IDENTIFIER = "IMPORTANT ";
	private static final String SEPARATOR = " | ";
	private static final long serialVersionUID = 1L;

	public ImportantTweet() {		
	}

	public ImportantTweet(String text, Date date) {
		this.setTweetDate(date);
		this.setTweetBody(text);
	}
	
	@Override
	public boolean isValid()
	{
		int length = getTweetBody().trim().length();
		if (length == 0	|| length > 10) {
			return false;
		}

		return true;
	}

	@Override
	public String getTweetBody()
	{
		return IDENTIFIER + getTweetBody();
	}

	@Override
	public String toString()
	{
		String impTweet = IDENTIFIER + getTweetDate() + SEPARATOR + getTweetBody();
		Log.i("MY_TAG", impTweet);
		return impTweet;
	}

	
}
