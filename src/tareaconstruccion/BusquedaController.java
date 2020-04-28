/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tareaconstruccion;

import java.io.IOException;
import java.net.URL;
import java.util.Iterator;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;
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
    
    @FXML
    private TextField medicamento;
    
    @FXML
    final ChoiceBox<String> opciones = new ChoiceBox<String>(FXCollections.observableArrayList("Precio", "Presentacion", "Region"));
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {

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
        Iterator it = TareaConstruccion.farmacias.iterator();
        System.out.println(""+medicamento.getText().toString());
        String nombreMedicamento= medicamento.getText();
        while(it.hasNext()){
            Farmacia f= (Farmacia)it.next();
            System.out.println("entre aqui");
            for(int i=0;i<f.getMedicinas().size()-1;i++){
                System.out.println("entre aca");
                if (f.getMedicinas().get(i).getNombre().equals(nombreMedicamento)){
                    Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
                    alert.setTitle("Buscador de medicina");
                    alert.setHeaderText("Se encontro en la farmacia: "+f.getNombre());
                    alert.showAndWait();
                }           
            }
        }
    }
    
    @FXML 
    private void opcionesFiltro(ActionEvent event) throws IOException{
        if(opciones.getValue().equals("Precio")){
            Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
            alert.setTitle("Filtro");
            alert.setHeaderText("Se ordeno por precio");
            alert.showAndWait();
        }
        if(opciones.getValue().equals("Presentacion")){
            Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
            alert.setTitle("Filtro");
            alert.setHeaderText("Se ordeno por presentacion");
            alert.showAndWait();
        }
        if(opciones.getValue().equals("Region")){
            Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
            alert.setTitle("Filtro");
            alert.setHeaderText("Se ordeno por region");
            alert.showAndWait();
        }
    }
    
    
}
