package vaniercollege.zyd;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.input.KeyCombination;
import javafx.stage.FileChooser;
import javafx.stage.Popup;

import java.io.File;

/**
 * @author Yu Duo Zhang (2480549)
 * https://github.com/zyd-074/Vanier_F25_420-SF3-RE_Lab10.git
 *
 * NOTE: Please read the README.md from the repository BEFORE TESTING OPEN AND SAVE FILE functions.
 */
public class MainController {
    @FXML public ToggleGroup sizeGroup;
    @FXML private MenuItem closeItem;
    @FXML private MenuItem copyItem;
    @FXML private MenuItem findItem;
    @FXML private CheckMenuItem gridItem;
    @FXML private RadioMenuItem largeItem;
    @FXML private RadioMenuItem mediumItem;
    @FXML private MenuItem newItem;
    @FXML private MenuItem openItem;
    @FXML private MenuItem replaceItem;
    @FXML private MenuItem saveItem;
    @FXML private Menu searchMenu;
    @FXML private RadioMenuItem smallItem;

    @FXML
    void handleClose(ActionEvent event) {
        newItem.setDisable(false);
        openItem.setDisable(false);
        closeItem.setDisable(true);
        saveItem.setDisable(true);
        System.out.println("User closed the file");
    }

    @FXML
    void handleCopy(ActionEvent event) {
        System.out.println("COPY has been pressed");
    }

    @FXML
    void handleFind(ActionEvent event) {
        System.out.println("FIND has been pressed");
    }

    @FXML
    void handleGrid(ActionEvent event) {
        if (gridItem.isSelected()) {
            System.out.println("USE GRIDLINES selected");
        } else {
            System.out.println("USE GRIDLINES unselected");
        }
    }

    @FXML
    void handleNew(ActionEvent event) {
        System.out.println("NEW has been pressed");
        newItem.setDisable(true);
        openItem.setDisable(true);
        closeItem.setDisable(false);
        saveItem.setDisable(false);
    }

    @FXML
    void handleOpen(ActionEvent event) {
        FileChooser fc = new FileChooser();
        fc.setTitle("Open File");
        fc.getExtensionFilters().addAll(
                new FileChooser.ExtensionFilter("All Files", "*")
        );
        File selected = fc.showOpenDialog(new Popup());
        if (selected != null) {
            String path = selected.getPath();
            System.out.println("User opened: " + path);
        }
        closeItem.setDisable(false);
        saveItem.setDisable(false);
        openItem.setDisable(true);
        newItem.setDisable(true);
    }

    @FXML
    void handleReplace(ActionEvent event) {
        System.out.println("REPLACE has been pressed");
    }

    @FXML
    void handleSave(ActionEvent event) {
        FileChooser fc = new FileChooser();
        fc.setTitle("Save File");
        File selected = fc.showSaveDialog(new Popup());
        fc.getExtensionFilters().addAll(
                new FileChooser.ExtensionFilter("All Files", "*")
        );
        if (selected != null) {
            String path = selected.getPath();
            System.out.println("User saved file to: " + path);
        }
    }

    @FXML
    void handleSizeLarge(ActionEvent event) {
        System.out.println("User switched to LARGE");
    }

    @FXML
    void handleSizeMedium(ActionEvent event) {
        System.out.println("User switched to MEDIUM");
    }

    @FXML
    void handleSizeSmall(ActionEvent event) {
        System.out.println("User switched to SMALL");
    }

    public void initialize() {
        // Initialize shortcuts for items in File Menu
        closeItem.setDisable(true);
        saveItem.setDisable(true);
        closeItem.setAccelerator(KeyCombination.keyCombination("Ctrl+C"));
        newItem.setAccelerator(KeyCombination.keyCombination("Ctrl+N"));
        openItem.setAccelerator(KeyCombination.keyCombination("Ctrl+O"));
        saveItem.setAccelerator(KeyCombination.keyCombination("Ctrl+S"));
    }
}
