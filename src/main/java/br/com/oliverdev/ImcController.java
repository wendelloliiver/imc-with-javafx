package br.com.oliverdev;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;

public class ImcController 
{
    @FXML
    private TextField txtPeso;

    @FXML
    private TextField txtAltura;

    @FXML
    private void calcular(ActionEvent event) 
    {
        try 
        {
            double peso = Double.parseDouble(txtPeso.getText().replace(",", "."));
            double altura = Double.parseDouble(txtAltura.getText().replace(",", "."));

            if (peso <= 0 || altura <= 0)
                throw new NumberFormatException();

            double imc = peso / (altura * altura);
            String resultado = String.format("Seu IMC é %.2f", imc);

            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Resultado do IMC");
            alert.setHeaderText(null);
            alert.setContentText(resultado);
            alert.showAndWait();
        } 
        catch (NumberFormatException e) 
        {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Erro de entrada");
            alert.setHeaderText(null);
            alert.setContentText("Informe peso e altura válidos em números.");
            alert.showAndWait();
        }
    }
}
