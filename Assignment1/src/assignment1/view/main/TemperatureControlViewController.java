package assignment1.view.main;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class TemperatureControlViewController
{
  @FXML
  private TextField radiatorPowerField;
  @FXML
  private TextField indoorTempField;
  @FXML
  private TextField outdoorTempField;
  @FXML
  private Label errorField;

  @FXML
  private void onPowerUpButton(ActionEvent actionEvent)
  {
    System.out.println("Power Up button pressed");
  }

  @FXML
  private void onPowerDownButton(ActionEvent actionEvent)
  {
    System.out.println("Power down button pressed");
  }
}
