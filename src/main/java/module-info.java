module com.example.morespinner {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.morespinner to javafx.fxml;
    exports com.example.morespinner;
}