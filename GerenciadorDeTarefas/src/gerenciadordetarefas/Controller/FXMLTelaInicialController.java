/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package gerenciadordetarefas.Controller;

import gerenciadordetarefas.Util.GerenteDeNavegacao;
import gerenciadordetarefas.Util.GerenteDeNavegacaoInterface;
import javafx.scene.control.Button;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

/**
 * FXML Controller class
 *
 * @author willi
 */
public class FXMLTelaInicialController implements Initializable, GerenteDeNavegacaoInterface{

    private GerenteDeNavegacao gerenteDeNavegacao;
    
    @FXML
    private Button btnNovaTarefa;

    @FXML
    private TableColumn<?, ?> colunaStatus;

    @FXML
    private TableColumn<?, ?> colunaTipoTarefa;

    @FXML
    private TableColumn<?, ?> colunaVisualizarEditar;

    @FXML
    private TableColumn<?, ?> colunaExcluir;

    @FXML
    private TableView<?> tabelaDeTarefas;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    @Override
    public void setGerenteDeNavegacao(GerenteDeNavegacao gerenteDeNavegacao) {
        this.gerenteDeNavegacao = gerenteDeNavegacao;
    }
    @FXML
    void abrirNovaTarefa(ActionEvent event) {
        gerenteDeNavegacao.abrirTelaNovaTarefa();
    }

    
}
