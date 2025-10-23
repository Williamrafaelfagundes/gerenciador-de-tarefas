/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package gerenciadordetarefas.Controller;

import javafx.scene.control.Button;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author willi
 */
public class FXMLNovaTarefaController implements Initializable {
    
    
    @FXML
    private TextArea inputDescricaoTarefa;

    @FXML
    private Button btnAdicionarTarefa;

    @FXML
    private TextField inputTitulo;

    @FXML
    private ComboBox<?> comboboxStatus;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
