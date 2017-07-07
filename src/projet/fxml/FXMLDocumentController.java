/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projet.fxml;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

/**
 *
 * @author super
 */
public class FXMLDocumentController implements Initializable {
 
    @FXML
    Label label1 ;
    
    @Override
    public void initialize(URL location, ResourceBundle resources) {
    label1.setText("new Value Whoooo");
    
    }

    
}
