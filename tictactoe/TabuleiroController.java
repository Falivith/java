package tictactoe;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.Button;

public class TabuleiroController implements Initializable {

//Tentativa de emular defines com static boolean

private static final boolean BOLINHA = false;
private static final boolean X = true;
private boolean jogavel = true; 

char[][] board = new char[3][3];
boolean quem_joga = X;

/* 2 = O jogo continua 
 * 1 = X Ganha
 * 0 = BOLINHA Ganha
 * Sinto falta dos defines
 */

int fim = 2;

    @FXML
    private Button btn00;

    @FXML
    private Button btn10;

    @FXML
    private Button btn20;

    @FXML
    private Button btn21;

    @FXML
    private Button btn02;

    @FXML
    private Button btn01;

    @FXML
    private Button btn12;

    @FXML
    private Button btn11;

    @FXML
    private Button btn22;

    @FXML
    private Button btnRestartGame;

    @FXML
    private Button btnNewGame;

    @FXML
    private Label oPlacar;

    @FXML
    private Label xPlacar;
    

    @Override
    public void initialize(URL url, ResourceBundle rb) {

        btn00.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event){

                if(jogavel){
                    if( board[0][0] != 'X' && board[0][0] != 'O' ){
                        if(quem_joga == X){
                            board[0][0] = 'X';
                            btn00.setText(String.valueOf(board[0][0]));
                            quem_joga = BOLINHA;
                        }
                        else{
                            board[0][0] = 'O';
                            btn00.setText(String.valueOf(board[0][0]));
                            quem_joga = X;
                        }
                    }

                    fim = checkwin(board);

                    if(fim != 2)
                    end_game_handler(fim); 
                }
            }
        });

        btn01.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event){

                if(jogavel){
                    if( board[0][1] != 'X' && board[0][1] != 'O' ){
                        if(quem_joga == X){
                            board[0][1] = 'X';
                            btn01.setText(String.valueOf(board[0][1]));
                            quem_joga = BOLINHA;
                        }
                        else{
                            board[0][1] = 'O';
                            btn01.setText(String.valueOf(board[0][1]));
                            quem_joga = X;
                        }
                    }

                    fim = checkwin(board);

                    if(fim != 2)
                    end_game_handler(fim); 
                }
            }
        });

        btn02.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event){

                if(jogavel){
                    if( board[0][2] != 'X' && board[0][2] != 'O' ){
                        if(quem_joga == X){
                            board[0][2] = 'X';
                            btn02.setText(String.valueOf(board[0][2]));
                            quem_joga = BOLINHA;
                        }
                        else{
                            board[0][2] = 'O';
                            btn02.setText(String.valueOf(board[0][2]));
                            quem_joga = X;
                        }
                    }

                    fim = checkwin(board);

                    if(fim != 2)
                    end_game_handler(fim); 
                }
            }
        });

        btn10.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event){

                if(jogavel){
                    if( board[1][0] != 'X' && board[1][0] != 'O' ){
                        if(quem_joga == X){
                            board[1][0] = 'X';
                            btn10.setText(String.valueOf(board[1][0]));
                            quem_joga = BOLINHA;
                        }
                        else{
                            board[1][0] = 'O';
                            btn10.setText(String.valueOf(board[1][0]));
                            quem_joga = X;
                        }
                    }

                    fim = checkwin(board);

                    if(fim != 2)
                    end_game_handler(fim);
                }
            }
        });

        btn11.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event){

                if(jogavel){
                    if( board[1][1] != 'X' && board[1][1] != 'O' ){
                        if(quem_joga == X){
                            board[1][1] = 'X';
                            btn11.setText(String.valueOf(board[1][1]));
                            quem_joga = BOLINHA;
                        }
                        else{
                            board[1][1] = 'O';
                            btn11.setText(String.valueOf(board[1][1]));
                            quem_joga = X;
                        }
                    }

                    fim = checkwin(board);

                    if(fim != 2)
                    end_game_handler(fim); 
                }
            }
        });

        btn12.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event){

                if(jogavel){
                    if( board[1][2] != 'X' && board[1][2] != 'O' ){
                        if(quem_joga == X){
                            board[1][2] = 'X';
                            btn12.setText(String.valueOf(board[1][2]));
                            quem_joga = BOLINHA;
                        }
                        else{
                            board[1][2] = 'O';
                            btn12.setText(String.valueOf(board[1][2]));
                            quem_joga = X;
                        }
                    }

                    fim = checkwin(board);

                    if(fim != 2)
                    end_game_handler(fim); 
                }
            }
        });

        btn20.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event){

                if(jogavel){
                    if( board[2][0] != 'X' && board[2][0] != 'O' ){
                        if(quem_joga == X){
                            board[2][0] = 'X';
                            btn20.setText(String.valueOf(board[2][0]));
                            quem_joga = BOLINHA;
                        }
                        else{
                            board[2][0] = 'O';
                            btn20.setText(String.valueOf(board[2][0]));
                            quem_joga = X;
                        }
                    }

                    fim = checkwin(board);

                    if(fim != 2)
                    end_game_handler(fim); 
                }
            }
        });

        btn21.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event){

                if(jogavel){
                    if( board[2][1] != 'X' && board[2][1] != 'O' ){
                        if(quem_joga == X){
                            board[2][1] = 'X';
                            btn21.setText(String.valueOf(board[2][1]));
                            quem_joga = BOLINHA;
                        }
                        else{
                            board[2][1] = 'O';
                            btn21.setText(String.valueOf(board[2][1]));
                            quem_joga = X;
                        }
                    }

                    fim = checkwin(board);

                    if(fim != 2)
                    end_game_handler(fim); 
                }
            }
        });

        btn22.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event){

                if(jogavel){
                    if( board[2][2] != 'X' && board[2][2] != 'O' ){
                        if(quem_joga == X){
                            board[2][2] = 'X';
                            btn22.setText(String.valueOf(board[2][2]));
                            quem_joga = BOLINHA;
                        }
                        else{
                            board[2][2] = 'O';
                            btn22.setText(String.valueOf(board[2][2]));
                            quem_joga = X;
                        }
                    }

                    fim = checkwin(board);

                    if(fim != 2)
                    end_game_handler(fim); 
                }
            }
        });

        btnRestartGame.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle (ActionEvent event){

                int i, j;

                oPlacar.setText("0");
                xPlacar.setText("0");

                jogavel = true;
                btn00.setText(" ");
                btn01.setText(" ");
                btn02.setText(" ");
                btn10.setText(" ");
                btn11.setText(" ");
                btn12.setText(" ");
                btn20.setText(" ");
                btn21.setText(" ");
                btn22.setText(" ");

                for(i = 0; i < 3; i++){
                    for(j = 0; j < 3; j++){
                        board[i][j] = ' '; 
                    }
                }
            }
        });

        btnNewGame.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle (ActionEvent event){

                int i, j;

                jogavel = true;
                btn00.setText(" ");
                btn01.setText(" ");
                btn02.setText(" ");
                btn10.setText(" ");
                btn11.setText(" ");
                btn12.setText(" ");
                btn20.setText(" ");
                btn21.setText(" ");
                btn22.setText(" ");

                for(i = 0; i < 3; i++){
                    for(j = 0; j < 3; j++){
                        board[i][j] = ' '; 
                    }
                }

            }
        });
    }

    int checkwin(char[][] board){

        int i, j, x = 0, b = 0;

/*
            Checagem de trincas em forma de Linha
                        - - - 
                        - - - 
                        - - - 
*/

        for(i = 0; i<3; i++){
            for(j = 0; j<3; j++){
                switch(board[i][j]){
                    case 'O':
                    b++; 
                    break;

                    case 'X':
                    x++;
                    break;

                    default:
                    break;
                }
            }

            if(x == 3 || b == 3){
                if(x == 3){
                    return 1;
                }
                else{
                    return 0;
                }
            }
            else{
                x = 0;
                b = 0;
            }
        }

/*
            Checagem de trincas em forma de Coluna
                        | | | 
                        | | | 
                        | | | 
*/

        for(i = 0; i<3; i++){
            for(j = 0; j<3; j++){
                switch(board[j][i]){
                    case 'O':
                    b++; 
                    break;

                    case 'X':
                    x++;
                    break;

                    default:
                    break;
                }
            }

            if(x == 3 || b == 3){
                if(x == 3){
                    return 1;
                }
                else{
                    return 0;
                }
            }
            else{
                x = 0;
                b = 0;
            }
        }

/*
            Checagem de trincas nas diagonáis
                        x | X 
                        | x | 
                        X | x
            Sim, acredito que a eficiência na checagem esteja BIZONHA. BUT WORKS 
*/

        if(board[0][0] == 'O')
            if(board[1][1] == 'O')
                if(board[2][2] == 'O')
                    return 0;

        if(board[0][2] == 'O')
            if(board[1][1] == 'O')
                if(board[2][0] == 'O')
                    return 0; 

        if(board[0][0] == 'X')
            if(board[1][1] == 'X')
                if(board[2][2] == 'X')
                    return 1;

        if(board[0][2] == 'X')
            if(board[1][1] == 'X')
                if(board[2][0] == 'X')
                    return 1; 

    return 2;
    }

    void end_game_handler(int sinal){

        int temp;

        if(sinal == 1){
        temp = Integer.parseInt(xPlacar.getText());
        temp++;
        xPlacar.setText(String.valueOf(temp));
        }

        else{
        temp = Integer.parseInt(oPlacar.getText());
        temp++;
        oPlacar.setText(String.valueOf(temp));
        }

        jogavel = false; 
    }

}

