package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Modality;
import javafx.scene.Node;
import javafx.stage.Stage;

import java.io.IOException;

public class EditDialogController {

    @FXML
    public void showDialog(ActionEvent actionEvent){

        try {
            Stage stage = new Stage();
            Parent root = FXMLLoader.load(getClass().getResource("fxml/calculator.fxml"));
            stage.setTitle("Calculator");
            stage.setMinWidth(400);
            stage.setMaxHeight(420);
            stage.setResizable(false);
            stage.setScene(new Scene(root));
//            stage.initModality(Modality.WINDOW_MODAL);
            stage.initOwner(((Node)actionEvent.getSource()).getScene().getWindow());
            stage.show();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
