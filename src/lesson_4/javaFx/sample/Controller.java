package lesson_4.javaFx.sample;

import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class Controller {
    @FXML
    private TextArea textArea;

    @FXML
    private TextField textField;

    public void sendMsg() {
        if (!textField.getText().equals("")) {
            textArea.appendText(textField.getText() + "\n");
            textField.clear();
        }
        textField.requestFocus();
    }
}
