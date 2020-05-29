package Wykresy;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.stage.Stage;


import java.util.HashMap;
import java.util.Map;

import static Wykresy.MeanWykres.mean;


public class VarWykres extends Application {
    public static double var(double []a){
        double avg=mean(a);
        double sum=0.0;
        for (int i = 0; i <a.length ; i++) {
            sum+=(a[i]-avg)*(a[i]-avg);
        }
        return sum/(a.length-1);
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
        NumberAxis yaxis = new NumberAxis(1,12,1);
        xaxis.setLabel("Wariancja");
        yaxis.setLabel("Wariancja");

        BarChart<String,Float> bar = new BarChart(xaxis,yaxis);
        bar.setTitle("Wariancja");
        double maxAll=var(maxiNumbers1);
        double maxAll2=var(maxiNumbers2);
        double maxAll3=var(maxiNumbers3);
        double maxAll4=var(maxiNumbers4);

        XYChart.Series<String,Float> series = new XYChart.Series<>();
        series.getData().add(new XYChart.Data(Euro,var(maxiNumbers1)));

        series.getData().add(new XYChart.Data(Pound,maxAll));
        series.getData().add(new XYChart.Data(frenc,maxAll2));
        series.getData().add(new XYChart.Data(A_Dollar,maxAll3));
        series.getData().add(new XYChart.Data(A_Dollar,maxAll4));


        bar.getData().add(series);


        Group root = new Group();
        root.getChildren().add(bar);
        Scene scene = new Scene(root,600,400);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Wariancja");
        primaryStage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }}




