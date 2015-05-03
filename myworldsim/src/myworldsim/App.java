package myworldsim;

import javafx.application.Application;
import javafx.stage.Stage;

public class App extends Application
{
	/*
	 * main method
	 * 
	 */
	
	public static void main(String[] args)
	{
		Application.launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
	
		Controller controller = new Controller();
		View view = new View(primaryStage, controller);
	}
}
