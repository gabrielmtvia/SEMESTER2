package assignment1;

import assignment1.core.ViewHandler;
import javafx.application.Application;
import javafx.stage.Stage;

public class Assignment1App extends Application
{
  @Override public void start(Stage stage) throws Exception
  {
    ViewHandler vh = new ViewHandler();
    vh.start();
  }
}
