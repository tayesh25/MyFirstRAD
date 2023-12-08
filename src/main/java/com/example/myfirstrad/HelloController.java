package com.example.myfirstrad;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.ComboBoxListCell;
import javafx.scene.paint.Paint;

public class HelloController {
    // fields for all data

    // fields for all your controls
    @FXML
    public Button New;


    public Button Delete;

    public Button Completed;

    public TextField textField;

    public ListView listView;



    // initialize method

    // onAction methods
    public void onActionNew() {
        String whatTheUserTyped = textField.getText();
        listView.getItems().add(whatTheUserTyped);
    }
    public void onActionDelete() {
        String whatTheUserTyped = textField.getText();
        listView.getItems().remove(whatTheUserTyped);
    }
    public void onActionComplete() {
        String whatTheUserTyped = textField.getText();

    }


}