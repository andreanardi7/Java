package prova1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class FXMLDocumentController {

    int i = 0;
    double test = 0;
    double input = 0;

    String componimento = "";
    String risultato = "";

    @FXML
    private TextField calcolo;

    @FXML
    private TextField result;

    @FXML
    private Button uno;

    @FXML
    private Button due;

    @FXML
    private Button tre;

    @FXML
    private Button quattro;

    @FXML
    private Button cinque;

    @FXML
    private Button sei;

    @FXML
    private Button sette;

    @FXML
    private Button otto;

    @FXML
    private Button nove;

    @FXML
    private Button zero;

    @FXML
    private Button punto;

    @FXML
    private Button Cancella;

    @FXML
    private Button Calcola;

    @FXML
    private Button somma;

    @FXML
    private Button sottrazione;

    @FXML
    private Button moltiplicazione;

    @FXML
    private Button divisione;

    @FXML
    void Calcola(ActionEvent event) {
        if (i == 0) {
            test = Double.parseDouble(componimento);
        } else {
            input = Double.parseDouble(componimento);
        }
        this.componimento = "";
        i++;
    }

    @FXML
    void Cancella(ActionEvent event) {
        this.componimento = "";
        this.risultato = "";
        calcolo.setText("");
        result.setText("");
        this.i = 0;
        this.test = 0;
        this.input = 0;

    }

    @FXML
    void divisione(ActionEvent event) {
        this.test = this.test / input;
        risultato = String.valueOf(test);
        result.setText(risultato);
    }

    @FXML
    void moltiplicazione(ActionEvent event) {
        this.test = this.test * this.input;
        risultato = String.valueOf(test);
        result.setText(risultato);
    }

    @FXML
    void print0(ActionEvent event) {
        this.componimento = this.componimento + "0";
        calcolo.setText(componimento);
    }

    @FXML
    void print1(ActionEvent event) {
        this.componimento = this.componimento + "1";
        calcolo.setText(componimento);
    }

    @FXML
    void print2(ActionEvent event) {
        this.componimento = this.componimento + "2";
        calcolo.setText(componimento);
    }

    @FXML
    void print3(ActionEvent event) {
        this.componimento = this.componimento + "3";
        calcolo.setText(componimento);
    }

    @FXML
    void print4(ActionEvent event) {
        this.componimento = this.componimento + "4";
        calcolo.setText(componimento);
    }

    @FXML
    void print5(ActionEvent event) {
        this.componimento = this.componimento + "5";
        calcolo.setText(componimento);
    }

    @FXML
    void print6(ActionEvent event) {
        this.componimento = this.componimento + "6";
        calcolo.setText(componimento);
    }

    @FXML
    void print7(ActionEvent event) {
        this.componimento = this.componimento + "7";
        calcolo.setText(componimento);
    }

    @FXML
    void print8(ActionEvent event) {
        this.componimento = this.componimento + "8";
        calcolo.setText(componimento);
    }

    @FXML
    void print9(ActionEvent event) {
        this.componimento = this.componimento + "9";
        calcolo.setText(componimento);
    }

    @FXML
    void printdot(ActionEvent event) {
        this.componimento = this.componimento + ".";
        calcolo.setText(componimento);
    }

    @FXML
    void somma(ActionEvent event) {
        this.test = this.test + this.input;
        risultato = String.valueOf(test);
        result.setText(risultato);
    }

    @FXML
    void sottrazione(ActionEvent event) {
        this.test = this.test - this.input;
        risultato = String.valueOf(test);
        result.setText(risultato);
    }

}
