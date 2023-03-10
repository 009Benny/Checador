/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package Modules.MainMenu;

import checador.Checador;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

/**
 * FXML Controller class
 *
 * @author Benny
 */
public class MainmenuController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }
    
    @FXML
    private void showAdmin() throws IOException {
       System.out.println("Se muestra ADMIN");
       Checador.showAdminView();
    }
    
    @FXML
    private void showRegisterTable() throws IOException {
       System.out.println("TableRegister");
       Checador.showRegisterView();
    }
    
}
