package mainlogin;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class logincontroller {
    @FXML
    private Label lblstatus;
    @FXML
    private Label txtmeno;
    @FXML
    private Label txtheslo;

    public void login(ActionEvent event) {
        if (txtheslo.getText().equals("user")&& txtheslo.getText().equals("pass")){
            lblstatus.setText("Loginsuccses");
        }else {
            lblstatus.setText("Loginfaild");
        }

    }
}