/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMain.java to edit this template
 */
package checador;

import Models.DefaultData;
import Modules.Admin.AdminviewController;
import Modules.MainMenu.MainmenuController;
import Modules.Register.RegisterviewController;
import java.io.IOException;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author Benny
 */
public class Checador extends Application {
    private static Scene scene;
    
    @Override
    public void start(Stage primaryStage) {
        loadData();
        try{
            
            
            FXMLLoader fxmlLoader = new FXMLLoader(MainmenuController.class.getResource("mainmenu.fxml"));
            scene = new Scene(fxmlLoader.load());
            
            primaryStage.setTitle("Checador de entrada y salida");
            primaryStage.setScene(scene);
            primaryStage.setResizable(true);
            primaryStage.setMinWidth(800);
            primaryStage.setMinHeight(600);
            primaryStage.show();
        }catch(IOException e){
            System.out.println("No se pudo cargar!");
            System.out.println(e);
        }
    }
    
    private void loadData(){
        DefaultData def = new DefaultData();
        def.checkAll();
    }
    
    public static void showRegisterView(){
        try{
            FXMLLoader fxmlLoader = new FXMLLoader(RegisterviewController.class.getResource("registerview.fxml"));
            scene.setRoot(fxmlLoader.load());
        }catch(IOException e){
            System.out.println(e);
        }
    }
    
    public static void showAdminView(){
        try{
            FXMLLoader fxmlLoader = new FXMLLoader(AdminviewController.class.getResource("adminview.fxml"));
            scene.setRoot(fxmlLoader.load());
        }catch(IOException e){
            System.out.println(e);
        }
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}