package Wykresy;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.stage.Stage;



public class SkosnoscWykres extends Application {

    public static double skew (double [] data) {
        int i, n = data.length;


        double d, avg = 0.0;
        int count = 0;

        for (i=0; i<n; i++) {
            d = data [i];
            if (d != 0) {
                avg =  (avg+ d);
                count ++;
            }
        }

        if (count < 3)
            return 0;

        avg = avg / count;

        double stdev = 0.;
        for (i=0; i<n; i++) {
            d = data [i];
            if (d != 0) {
                d = d - avg;
                stdev = stdev + d * d;
            }
        }

        stdev = Math.sqrt (stdev / (count - 1));

        if (stdev == 0.)
            return 0;
        double skew = 0.;
        for (i=0; i<n; i++) {
            d = data [i];
            if (d != 0) {
                d = d - avg;
                d = d / stdev;
                skew = skew + d * d * d;
            }
        }

        return skew * count / ((count - 1) * (count - 2));
    }


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

        CategoryAxis xaxis= new CategoryAxis();

        NumberAxis yaxis = new NumberAxis(0.001,6,1.5);
        xaxis.setLabel("Skosnosc");
        yaxis.setLabel("Skosnosc");
        //Configuring BarChart
        BarChart<String,Float> bar = new BarChart(xaxis,yaxis);
        bar.setTitle("Skosnosc");
        double maxAll=skew(maxiNumbers1);
        double maxAll2=skew(maxiNumbers2);
        double maxAll3=skew(maxiNumbers3);
        double maxAll4=skew(maxiNumbers4);

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
        primaryStage.setTitle("Skosnosc");
        primaryStage.show();
        scene.getStylesheets().add(getClass().getResource("chart6.css").toExternalForm());
    }
    public static void main(String[] args) {
        launch(args);
    }}