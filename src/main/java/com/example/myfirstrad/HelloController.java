package com.example.myfirstrad;

import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.ComboBoxListCell;
import javafx.scene.paint.Paint;

import java.util.List;

public class HelloController {
    // fields for all data

    // fields for all your controls
    @FXML
    public Button New;
    public Button Delete;
    public Button Completed;
    public TextField textField;
    public ListView listView;

    public ListView listView1;



    // initialize method

    // onAction methods
    public void onActionNew() {
        String whatTheUserTyped = textField.getText();
        listView.getItems().add(whatTheUserTyped);
    }
    public void onActionDelete() {
        ObservableList selectedIndices = listView.getSelectionModel().getSelectedItems();
        for(Object o : selectedIndices) {
            listView.getItems().remove(o);
            listView1.getItems().remove(o);

        }
    }
    public void OnActionComplete() {
        ObservableList selectedIndices = listView.getSelectionModel().getSelectedItems();
        for (Object o : selectedIndices) {
            listView.getItems().remove(o);
            listView1.getItems().add(o);


        }

        }
    }