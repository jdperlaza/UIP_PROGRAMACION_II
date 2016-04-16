package sample;

import javafx.beans.InvalidationListener;
import javafx.collections.FXCollections;
import javafx.collections.ListChangeListener;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import java.io.IOException;
import java.net.URL;
import java.util.*;


public class Controller {
    @FXML
    private TextField txnombre, txnota;
    @FXML
    private Button btnhome;
    @FXML
    private Button btn1, btn2;
    @FXML ListView<String> test= new ListView<>(), Listanombre= new ListView<>(), Listanota = new ListView<>();

    ObservableList<String> lsNombre = FXCollections.observableArrayList();
    ObservableList<String> lsNota = FXCollections.observableArrayList();
    @FXML
    private void cambiopantalla(ActionEvent e) throws IOException {
        Stage stage = null;
        Parent root = null;
        if (e.getSource() == btnhome) {
            stage = (Stage) btnhome.getScene().getWindow();
            root = FXMLLoader.load(getClass().getResource("Registro.fxml"));
        } else if (e.getSource() == btn1) {

            stage = (Stage) btn1.getScene().getWindow();
            root = FXMLLoader.load(getClass().getResource("Lista.fxml"));
            Listanombre.setItems(lsNombre);

            Listanota.setItems(lsNota);
        }
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

    }

    @FXML
    public void guardar(ActionEvent event) {

      lsNombre.add(txnombre.getText());
      Listanombre.setItems(lsNombre);
        test.setItems(lsNombre);

      lsNota.add(txnota.getText());
      Listanota.setItems(lsNota);
    }
}