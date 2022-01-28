package com.example.morespinner;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Spinner;
import javafx.scene.control.SpinnerValueFactory;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Text;

import java.net.URL;
import java.util.ResourceBundle;

public class HelloController implements Initializable {

    @FXML
    private Spinner<String> mySpinner;

    //create the list
    ObservableList<String> sal = FXCollections.observableArrayList("James", "Bill", "Janet", "Deb");
    //add the list
    SpinnerValueFactory<String> svf = new SpinnerValueFactory.ListSpinnerValueFactory<>(sal);


    @FXML
    private Text txtfld1;

    @FXML
    void selectAndShow(MouseEvent event) {
        String name=mySpinner.getValue();
        txtfld1.setText(name);





    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        mySpinner.setValueFactory(svf);
    }
}
