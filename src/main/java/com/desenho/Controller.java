package com.desenho;

import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;

public class Controller {

    private Desenho desenho = new Desenho();
    Pane canvas = new Pane();

    public void render(Scene scene) {
        canvas.setStyle("-fx-background-color: #1D1D1D");
        canvas.getChildren().clear();

    //     for (Circulo circulo : desenho.getCirculos()) {
    //         canvas.getChildren().add( converterCirculoParaCircle(circulo) );
    //     }

    //     for (Retangulo retangulo : desenho.getRetangulos()) {
    //         canvas.getChildren().add( converterRetanguloParaRectangle(retangulo) );
    //     }

    //     for (Triangulo triangulo : desenho.getTriangulos()) {
    //         canvas.getChildren().add( converterTrianguloParaPolygon(triangulo) );
    //     }

        scene.setRoot(canvas);
    }

    // private Node converterTrianguloParaPolygon(Triangulo triangulo) {
    //     javafx.scene.shape.Polygon polygon = new javafx.scene.shape.Polygon();
    //     polygon.getPoints().addAll(new Double[]{
    //         (double) triangulo.getX(), (double) triangulo.getY(),
    //         (double) triangulo.getX() + triangulo.getBase(), (double) triangulo.getY(),
    //         (double) triangulo.getX() + triangulo.getBase() / 2, (double) triangulo.getY() - triangulo.getAltura()
    //     });
    //     polygon.setStyle("-fx-fill: " + triangulo.getCor());
    //     return polygon;
    // }

    // private Rectangle converterRetanguloParaRectangle(Retangulo retangulo) {
    //     Rectangle rectangle = new Rectangle(retangulo.getLargura(), retangulo.getAltura());
    //     rectangle.setStyle("-fx-fill: " + retangulo.getCor());
    //     rectangle.setX(retangulo.getX());
    //     rectangle.setY(retangulo.getY());
    //     return rectangle;
    // }

    // private Circle converterCirculoParaCircle(Circulo circulo) {
    //     Circle circle = new Circle(circulo.getRaio());
    //     circle.setStyle("-fx-fill: " + circulo.getCor());
    //     circle.setCenterX(circulo.getX());
    //     circle.setCenterY(circulo.getY());
    //     return circle;
    // }
}
