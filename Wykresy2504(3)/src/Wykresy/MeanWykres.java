package Wykresy;


import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.stage.Stage;




public class MeanWykres extends Application {
    public static double mean(double []a){
        double sum=0.0;
        for (int i = 0; i <a.length ; i++) {
            sum=sum+a[i];}
        return sum/a.length;
    }

    @Override
    public void start(Stage primaryStage) throws Exception {


        String Pound = "Basia";
        String Euro = "Kasia";

        String A_Dollar = "Konrad";
        String frenc= "Antek";
        double   maxiNumbers1[]=new double[]{5.0,4.0,6.0,2.5,3.5} ;
        double   maxiNumbers2[]= new double[]{5.0,6.0,6.0,2.5,3.5};
        double maxiNumbers3[]=new double[]{4.0,4.0,4.0,4.0,4.0,4.0,5.0};
        double maxiNumbers4[]=new double[]{2.0,2.0,2.0,2.0,2.0,2.0};
        double maxiNumbers5[]=new double[]{2.5,2.5,2.5};

        CategoryAxis xaxis= new CategoryAxis();
        NumberAxis yaxis = new NumberAxis(1,12,1);
        xaxis.setLabel("Srednia ocen");
        yaxis.setLabel("Srednia ocen");

        BarChart<String,Float> bar = new BarChart(xaxis,yaxis);
        bar.setTitle("Wykres srednich ocen");
        double maxAll=mean(maxiNumbers1);
        double maxAll2=mean(maxiNumbers2);
        double maxAll3=mean(maxiNumbers3);
        double maxAll4=mean(maxiNumbers4);

        XYChart.Series<String,Float> series = new XYChart.Series<>();
        series.getData().add(new XYChart.Data(Euro,mean(maxiNumbers1)));

        series.getData().add(new XYChart.Data(Pound,maxAll));
        series.getData().add(new XYChart.Data(frenc,maxAll2));
        series.getData().add(new XYChart.Data(A_Dollar,maxAll3));
        series.getData().add(new XYChart.Data(A_Dollar,maxAll4));


        bar.getData().add(series);


        Group root = new Group();
        root.getChildren().add(bar);
        Scene scene = new Scene(root,600,400);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Srednie oceny");
        primaryStage.show();
        scene.getStylesheets().add(getClass().getResource("chart4.css").toExternalForm());
    }
    public static void main(String[] args) {
        launch(args);
    }}




