module com.example.hwchat {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.hwchat to javafx.fxml;
    exports com.example.hwchat;
}