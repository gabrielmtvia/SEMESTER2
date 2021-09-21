package assignment1.core;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class ViewHandler
{
  private Scene assignment1Scene;
  private Stage stage;

  public void start()
  {
    stage = new Stage();
    openAssignment1();
  }

  private void openAssignment1()
  {
    if(assignment1Scene == null){
      try{
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("../view/main/TemperatureControlView.fxml"));
        Parent root = loader.load();
        stage.setTitle("Temperature Control");
        assignment1Scene = new Scene(root);
      }
      catch (IOException e)
      {
        e.printStackTrace();
      }
    }
    stage.setScene(assignment1Scene);
    stage.show();
  }

}
