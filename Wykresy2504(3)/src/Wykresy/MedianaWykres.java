package Wykresy;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.stage.Stage;


import java.util.Arrays;



public class MedianaWykres extends Application {
    public static long median(double[]a)
    {
        Arrays.sort(a);
        int middle = a.length / 2;
        try{
            if (a.length % 2 == 0)

            {
                double left = a[middle - 1];
                double right = a[middle];

                return (long) ((left + right) / 2);}

            else{
                return (long) a[middle];}}
        catch (ArrayIndexOutOfBoundsException e){
            return 0;
        }}
    @Override
    public void start(Stage primaryStage) throws Exception {




        String Euro = "Kasia";
        String Pound = "Basia";
        String A_Dollar = "Konrad";
        String frenc= "Antek";
        double   maxiNumbers1[]=new double[]{5.0,4.0,6.0,2.5,3.5} ;
        double   maxiNumbers2[]= new double[]{5.0,6.0,6.0,2.5,3.5};
        double maxiNumbers3[]=new double[]{4.0,4.0,4.0,4.0,4.0,4.0};
        double maxiNumbers4[]=new double[]{2.0,2.0,2.0,2.0,2.0,2.0};
        double maxiNumbers5[]=new double[]{2.5,2.5,2.5};
        //Configuring category and NumberAxis
        CategoryAxis xaxis= new CategoryAxis();
        NumberAxis yaxis = new NumberAxis(1,12,1);
        xaxis.setLabel("Mediana");
        yaxis.setLabel("Mediana");
        //Configuring BarChart
        BarChart<String,Float> bar = new BarChart(xaxis,yaxis);
        bar.setTitle("Mediana");
        double maxAll=median(maxiNumbers1);
        double maxAll2=median(maxiNumbers2);
        double maxAll3=median(maxiNumbers3);
        double maxAll4=median(maxiNumbers4);

        XYChart.Series<String,Float> series = new XYChart.Series<>();
        series.getData().add(new XYChart.Data(Euro,maxAll));

        series.getData().add(new XYChart.Data(Pound,maxAll2));
        series.getData().add(new XYChart.Data(frenc,maxAll3));
        series.getData().add(new XYChart.Data(A_Dollar,maxAll4));


        bar.getData().add(series);


        Group root = new Group();
        root.getChildren().add(bar);
        Scene scene = new Scene(root,600,400);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Mediana");
        primaryStage.show();
        scene.getStylesheets().add(getClass().getResource("chart4.css").toExternalForm());
    }
    public static void main(String[] args) {
        launch(args);
    }}