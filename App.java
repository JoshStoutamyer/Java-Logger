package wk5;

public class App {

	public static void main(String[] args) {

		Logger logAsterisk = new AsteriskLogger();
		Logger logSpace = new SpacedLogger();
		
		logAsterisk.log("Hello");
		logAsterisk.error("Hello");
		
		logSpace.log("Hello");
		logSpace.error("Hello");
		
	}

}
