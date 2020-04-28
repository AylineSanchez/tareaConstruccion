/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tareaconstruccion;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;

/**
 * FXML Controller class
 *
 * @author Aylinee
 */
public class BusquedaController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @FXML
    private AnchorPane root;
    
    @FXML
    private Button buscar;

    @FXML
    private Button generarPdf;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    @FXML 
    private void generarPDF(ActionEvent event) throws IOException{
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Listo, se genero pfd");
        alert.setHeaderText("Generador de PDF");
        alert.showAndWait();
    }
    
    @FXML 
    private void busqueda(ActionEvent event) throws IOException{
        System.out.println(""+TareaConstruccion.farmacias.get(0).getMedicinas().get(0).getNombre());
        if (TareaConstruccion.farmacias.get(0).getMedicinas().get(0).getNombre().equals("Paracetamol")){
            Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
            alert.setTitle("Se encontro");
            alert.setHeaderText("Buscador de medicina");
            alert.showAndWait();
        }
    }
}
