module br.com.oliverdev {
    requires javafx.controls;
    requires javafx.fxml;

    opens br.com.oliverdev to javafx.fxml;
    exports br.com.oliverdev;
}
