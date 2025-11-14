module vaniercollege.zyd {
    requires javafx.controls;
    requires javafx.fxml;


    opens vaniercollege.zyd to javafx.fxml;
    exports vaniercollege.zyd;
}