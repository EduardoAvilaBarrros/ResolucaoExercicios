module com.example.exercicios2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.exercicios2 to javafx.fxml;
    exports com.example.exercicios2;
}