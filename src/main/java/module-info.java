module com.example.myfirstrad {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.myfirstrad to javafx.fxml;
    exports com.example.myfirstrad;
}