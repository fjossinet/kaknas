package io.github.fjossinet.rnartist.kaknas

import javafx.fxml.FXML
import javafx.scene.control.Label

class KaknasController {
    @FXML
    private lateinit var welcomeText: Label

    @FXML
    private fun onHelloButtonClick() {
        welcomeText.text = "Welcome to JavaFX Application!"
    }
}