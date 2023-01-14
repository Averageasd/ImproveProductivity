/**
 * Sample Skeleton for 'main.fxml' Controller Class
 */

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class MainController {

    @FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resources;

    @FXML // URL location of the FXML file that was given to the FXMLLoader
    private URL location;

    @FXML // fx:id="btn"
    private Button btn; // Value injected by FXMLLoader

    @FXML
    void onClick(ActionEvent event) {
        System.out.println("hello");
    }

    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {}

}