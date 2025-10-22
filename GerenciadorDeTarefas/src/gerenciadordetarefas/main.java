/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMain.java to edit this template
 */
package gerenciadordetarefas;

import Util.GerenteDeNavegacao;
import java.io.IOException;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.stage.Stage;

/**
 *
 * @author willi
 */
public class main extends Application {
    
   @Override
    public void start(Stage stage) throws IOException {
        
        GerenteDeNavegacao gerenteDeNavegacao = new GerenteDeNavegacao(stage);
        gerenteDeNavegacao.irParaTelaInicial();
        
        
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
