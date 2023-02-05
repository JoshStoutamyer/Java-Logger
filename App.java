package wk5;

public class App {

	public static void main(String[] args) {

		Logger logAsterisk = new AsteriskLogger();
		Logger logSpace = new SpacedLogger();
		
		logAsterisk.log("hey");
		logAsterisk.error("hi");
		
		logSpace.log("Ho");
		logSpace.error("Hello");
		
	}

}
