package calculadora;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.Initializable;
import java.lang.Math;

public class CalculadoraController implements Initializable {

double valor1 = 0; 
double valor2 = 0; 
double resultado = 0; 
String operacao = "";
boolean contemponto;
String temp = "";


    @FXML
    private Button quatroButton;

    @FXML
    private Button cincoButton;

    @FXML
    private Button seisButton;

    @FXML
    private Button noveButton;

    @FXML
    private Button divisaoButton;

    @FXML
    private Button multButton;

    @FXML
    private Button cleanButton;

    @FXML
    private Label label;

    @FXML
    private Button oitoButton;

    @FXML
    private Button doisButton;

    @FXML
    private Button pontoButton;

    @FXML
    private Button igualButton;

    @FXML
    private Button somaButton;

    @FXML
    private Button raizButton;

    @FXML
    private Button tresButton;

    @FXML
    private Button seteButton;

    @FXML
    private Button zeroButton;

    @FXML
    private Button menosButton;

    @FXML
    private Button umButton;

    @FXML
    private TextField telaTextField;

    @FXML
    private Button factButton;

    @FXML
    void noveButtonAction(ActionEvent event) {

    }

    @FXML
    void seisButtonAction(ActionEvent event) {

    }

    @FXML
    void umButtonAction(ActionEvent event) {
    }

    @FXML
    void doisButtonAction(ActionEvent event) {

    }

    @FXML
    void cincoButtonAction(ActionEvent event) {

    }

    @FXML
    void oitoButtonAction(ActionEvent event) {

    }

    @FXML
    void multButtonAction(ActionEvent event) {

    }

    @FXML
    void divisaoButtonAction(ActionEvent event) {

    }

    @FXML
    void somaButtonAction(ActionEvent event) {

    }

    @FXML
    void tresButtonAction(ActionEvent event) {

    }

    @FXML
    void quatroButtonAction(ActionEvent event) {

    }

    @FXML
    void seteButtonAction(ActionEvent event) {

    }

    @FXML
    void cleanButtonAction(ActionEvent event) {

    }

    @FXML
    void factButtonAction(ActionEvent event) {

    }

    @FXML
    void raizButtonAction(ActionEvent event) {

    }

    @FXML
    void menosButtonAction(ActionEvent event) {

    }

    @FXML
    void igualButtonAction(ActionEvent event) {

    }

    @FXML
    void pontoButtonAction(ActionEvent event) {

    }

    @FXML
    void zeroButtonAction(ActionEvent event) {

    }

    @Override
    public void initialize(URL url, ResourceBundle rb){

    telaTextField.setEditable(false);

        umButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event){
                telaTextField.setText(telaTextField.getText() + "1");
            } 
        });

        doisButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event){
                telaTextField.setText(telaTextField.getText() + "2");
            } 
        });

        tresButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event){
                telaTextField.setText(telaTextField.getText() + "3");
            } 
        });

        quatroButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event){
                telaTextField.setText(telaTextField.getText() + "4");
            } 
        });

        cincoButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event){
                telaTextField.setText(telaTextField.getText() + "5");
            } 
        });

        seisButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event){
                telaTextField.setText(telaTextField.getText() + "6");
            } 
        });

        seteButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event){
                telaTextField.setText(telaTextField.getText() + "7");
            } 
        });

        oitoButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event){
                telaTextField.setText(telaTextField.getText() + "8");
            } 
        });

        noveButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event){
                telaTextField.setText(telaTextField.getText() + "9");
            } 
        });

        zeroButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event){
                telaTextField.setText(telaTextField.getText() + "0");
            } 
        });

        pontoButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event){
                temp = telaTextField.getText();
                contemponto = temp.contains(".");

                if(!contemponto && !("".equals(telaTextField.getText()))){
                    telaTextField.setText(telaTextField.getText() + ".");
                }

            } 
        });

        multButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event){
                valor1 = Double.parseDouble(telaTextField.getText());
                telaTextField.setText("");
                operacao = "*";
            } 
        });

        divisaoButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event){
                valor1 = Double.parseDouble(telaTextField.getText());
                telaTextField.setText("");
                operacao = "/";
            } 
        });

        somaButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event){
                valor1 = Double.parseDouble(telaTextField.getText());
                telaTextField.setText("");
                operacao = "+";
            } 
        });

        menosButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event){
                valor1 = Double.parseDouble(telaTextField.getText());
                telaTextField.setText("");
                operacao = "-";
            } 
        });

        raizButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event){
                valor1 = Double.parseDouble(telaTextField.getText());
                resultado = Math.sqrt(valor1);
                telaTextField.setText(String.valueOf(resultado));
                valor1 = 0;
            } 
        });

        factButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event){
                valor1 = Double.parseDouble(telaTextField.getText());
                resultado = 1; 

                for(int i=1;i<=valor1;i++){    
                    resultado=resultado*i;    
                }    

                telaTextField.setText(String.valueOf(resultado));
            } 
        });

        cleanButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event){
                telaTextField.setText("");
                operacao = "";
                valor1 = 0; 
                valor2 = 0;
            } 
        });

        igualButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event){
                valor2 = Double.parseDouble(telaTextField.getText());

                switch(operacao){

                    case "+":
                        resultado = valor1 + valor2;
                        telaTextField.setText(String.valueOf(resultado));
                    break;

                    case "-":
                        resultado = valor1 - valor2;
                        telaTextField.setText(String.valueOf(resultado));
                    break;

                    case "*":
                        resultado = valor1 * valor2;
                        telaTextField.setText(String.valueOf(resultado));
                    break;

                    case "/":
                        resultado = valor1 / valor2;
                        telaTextField.setText(String.valueOf(resultado));
                    break;
                }

                operacao = "";
                valor1 = 0;
                valor2 = 0; 
            } 
        });
    }
}
