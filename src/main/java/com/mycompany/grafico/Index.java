package com.mycompany.grafico;
import org.jfree.chart.*;
import org.jfree.data.category.DefaultCategoryDataset;
import java.awt.Dimension;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;

import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;

import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;



import grafico.presenter.TelaPrincipalPresenter;

public class Index extends javax.swing.JFrame{
    
    public void getDataSet(DefaultCategoryDataset dataset){
        
        try {
            Reader reader = Files.newBufferedReader(Paths.get("pessoas.csv"));
            CSVReader csvReader = new CSVReaderBuilder(reader).withSkipLines(1).build();
            List<String[]> pessoas = csvReader.readAll();
            double m = 0, f = 0;
            for (String[] pessoa : pessoas){
                if (pessoa[0].equals("Masculino")){
                    m++;
                } else
                    f++;
            }
            dataset.addValue(f, "Feminino", "Feminino");
            dataset.addValue(m, "Masculino", "Masculino");
        } catch(IOException e){
            e.printStackTrace();
        }
    }
    
    public ChartPanel start(){

        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        getDataSet(dataset);
        JFreeChart chart = ChartFactory.createBarChart(null, "Sexo", "Número de pessoas", dataset, PlotOrientation.HORIZONTAL, true, false, false);
        
        ChartPanel cp = new ChartPanel(chart) {

            @Override
            public Dimension getPreferredSize() {
                return new Dimension(568, 306);
            }
        };
        cp.setMouseWheelEnabled(true);
        add(cp);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        pack();
        
        return cp;
    }

    public static void main(String[] args) {
        new TelaPrincipalPresenter();
    }    
}