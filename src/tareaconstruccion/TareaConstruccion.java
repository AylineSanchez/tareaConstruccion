/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tareaconstruccion;

import java.io.IOException;
import java.util.ArrayList;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Modality;
import javafx.stage.Stage;

/**
 *
 * @author Aylinee
 */
public class TareaConstruccion extends Application {
    
    public static ArrayList<Farmacia> farmacias = new ArrayList<>();
    
    @Override
    public void start(Stage stage) throws IOException {
        
        Parent root = FXMLLoader.load(getClass().getResource("ingresarUsuario.fxml"));
        
        Scene scene = new Scene(root, 600, 400);
        
        stage.setScene(scene);
        stage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Medicina> medicinas = new ArrayList<>();
        Medicina medicina1= new Medicina("Paracetamol","sadsadas","sdasd","dsadsad");
        Medicina medicina2= new Medicina("Tapsin","dkjskda","jdsa","ahdas");
        medicinas.add(medicina1);
        medicinas.add(medicina2);
        Farmacia salco= new Farmacia("salco","sdsdads","dsdsad","sadas",medicinas);
        farmacias.add(salco);
        System.out.println(""+farmacias.size());
        launch(args);
        
    }
    
}
