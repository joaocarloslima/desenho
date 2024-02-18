module com.desenho {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.desenho to javafx.fxml;
    exports com.desenho;
}
