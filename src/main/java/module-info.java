module com.example.fitness_support {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;

    opens com.example.fitness_support to javafx.fxml;
    exports com.example.fitness_support;
}