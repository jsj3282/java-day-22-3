package ex01;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class Controller implements Initializable {
	@FXML private Button btn;
	@FXML private TextField txtField;
	@FXML private TextField txtField02;
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		System.out.println("호출하면 자동으로 실행됩니다!!!");
		btn.setOnAction(e->handlerButton());
		
	}
	public void handlerButton() {
		System.out.println(txtField.getText());
		txtField.setText(txtField02.getText());
		txtField02.setText("");
		Alert alert = new Alert(AlertType.WARNING);
		alert.setContentText(txtField.getText());
		alert.show();
	}
}
