package jokenpo;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import java.util.Random;

public class FXMLDocumentController implements Initializable {

private String escolha;
private String escolha_computador;
private int rand; 
Random gerador = new Random(); 
    
    @FXML
    private Label lblLabel;

    @FXML
    private Button startButton;

    @FXML
    private Button pedraButton;

    @FXML
    private Button papelButton;

    @FXML
    private Button tesouraButton;

    @FXML
    private TextArea computerField;

    @FXML
    void pedraButtonAction(ActionEvent event) {

    }

    @FXML
    void tesouraButtonAction(ActionEvent event) {

    }

    @FXML
    void papelButtonAction(ActionEvent event) {

    }

    @FXML
    void startButtonAction(ActionEvent event) {

    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
         computerField.setEditable(false);

        pedraButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event){
            escolha = "pedra";
            lblLabel.setText("Pedra");
            computerField.setText("Você escolheu Pedra!\nClique em jogar");
            } 
        });
    
        papelButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event){
            escolha = "papel";
            lblLabel.setText("Papel");
            computerField.setText("Você escolheu Papel!\nClique em jogar");
            } 
        });

        tesouraButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event){
            escolha = "tesoura";
            lblLabel.setText("Tesoura");
            computerField.setText("Você escolheu Tesoura!\nClique em jogar");
            } 
        });

        startButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event){
                rand = gerador.nextInt(3);

                switch(rand){
                case 0:
                    escolha_computador = "pedra";
                    break;

                case 1:
                    escolha_computador = "papel";
                    break;

                case 2:
                    escolha_computador = "tesoura";
                    break;
                }

                if("pedra".equals(escolha_computador)){
                    if("papel".equals(escolha)){
                      computerField.setText("O computador escolheu\n pedra! Você ganhou.");
                    }

                    else if("tesoura".equals(escolha)){
                      computerField.setText("O computador escolheu\n pedra! Você perdeu...");
                    }

                    else{
                      computerField.setText("O computador escolheu\n pedra! Você empatou...");
                    }
                }

                if("papel".equals(escolha_computador)){
                    if("tesoura".equals(escolha)){
                      computerField.setText("O computador escolheu\n papel! Você ganhou.");
                    }

                    else if("pedra".equals(escolha)){
                      computerField.setText("O computador escolheu\n papel! Você perdeu...");
                    }

                    else{
                      computerField.setText("O computador escolheu\n papel! Você empatou...");
                    }
                }

                if("tesoura".equals(escolha_computador)){
                    if("pedra".equals(escolha)){
                      computerField.setText("O computador escolheu\n tesoura! Você ganhou.");
                    }

                    else if("papel".equals(escolha)){
                      computerField.setText("O computador escolheu\n tesoura! Você perdeu...");
                    }

                    else{
                      computerField.setText("O computador escolheu\n tesoura! Você empatou...");
                    }
                }
            }
        });

    }    
}
