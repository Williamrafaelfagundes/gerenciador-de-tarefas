/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gerenciadordetarefas.Util;

/**
 *
 * @author willi
 */

import java.io.IOException;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author willi
 */
public class GerenteDeNavegacao {

    private final Stage stage;

    public GerenteDeNavegacao(Stage primaryStage) {
        this.stage = primaryStage;
    }

    public void irParaLogin() {
        abrirTela(" ");
    }

    public void irParaTelaInicial() {
        abrirTela("/GerenciadorDeTarefas/View/FXMLTelaInicial.fxml");
    }
    

    // Método genérico para carregar qualquer tela
    private void abrirTela(String telaFXML) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource(telaFXML));

            Parent root = loader.load();

            Object controller = loader.getController();

            if (controller instanceof GerenteDeNavegacaoInterface) {
                ((GerenteDeNavegacaoInterface) controller).setGerenteDeNavegacao(this);
            }

            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
            stage.setResizable(true);
           
                stage.setMaximized(false);
            

        } catch (IOException e) {
            System.err.println("Erro ao carregar o FXML: " + telaFXML);
            e.printStackTrace();
        }
    }
}
