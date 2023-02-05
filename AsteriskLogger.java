package wk5;

public class AsteriskLogger implements Logger {

	String asterisk = "*";
	
	@Override
	public void log(String log) {
	System.out.println("***" + log + "***");
		
	}

	@Override
	public void error(String error) {
		System.out.println(asterisk.repeat(error.length() + 13));
		System.out.println("***Error: " + error + "***");
		System.out.println(asterisk.repeat(error.length() + 13));
		
	}

	
}
