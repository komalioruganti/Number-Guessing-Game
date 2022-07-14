module com.example.number_guessing_game {
    requires javafx.controls;
    requires javafx.fxml;


    opens java_code to javafx.fxml;
    exports java_code;
}