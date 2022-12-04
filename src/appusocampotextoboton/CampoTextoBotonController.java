/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXML2.java to edit this template
 */
package appusocampotextoboton;

import componentes_santosalejandro.CampoTextoBoton;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

/**
 *
 * @author Lourdes
 */
public class CampoTextoBotonController implements Initializable {
    
    
    @FXML
    private CampoTextoBoton componente1;
    @FXML
    private CampoTextoBoton componente2;
    @FXML
    private Label label;
    @FXML
    private Label mensaje;
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        
        componente1.setText("Nombre");
        componente2.setText("Apellidos");
        
       
        componente1.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                mensaje.setText("Se ha grabado "+ componente1.getText());
            }
        });
        
        componente2.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                mensaje.setText("Se ha grabado "+ componente2.getText());
            }
        });
    }    
    
}
