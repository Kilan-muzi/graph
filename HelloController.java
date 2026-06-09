package com.example.demo2;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class HelloController {
    @FXML
    private Canvas zeichenCanvas;

    private GraphicsContext gc;
    private double xMin = -4, xMax = 4;
    private double yMin = -3, yMax = 3;


    @FXML
    public void initialize() {
        gc = zeichenCanvas.getGraphicsContext2D();
      //  zeichneKoordinatensystem();
    }



}

