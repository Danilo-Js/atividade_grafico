package com.mycompany.grafico;
import org.jfree.chart.*;
import java.awt.Dimension;
import org.jfree.data.xy.*;
import java.io.BufferedReader;
import java.io.FileReader;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.block.BlockBorder;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.xy.XYLineAndShapeRenderer;
import org.jfree.chart.title.TextTitle;

import java.awt.BasicStroke;
import java.awt.Color;

import java.awt.Font;



import grafico.presenter.TelaPrincipalPresenter;

public class Index extends javax.swing.JFrame{

    public ChartPanel start(){
    
        XYSeries Goals = new XYSeries("Goals Scored");
        Goals.add(1, 1.0);
        Goals.add(2, 3.0);
        Goals.add(3, 2.0);
        Goals.add(4, 0.0);
        Goals.add(5, 3.0);
        
        XYDataset xyDataset = new XYSeriesCollection(Goals);
        JFreeChart chart = ChartFactory.createXYLineChart(
            "Goals Scored Over Time", "Fixture Number", "Goals",
            xyDataset, PlotOrientation.VERTICAL, true, true, false);
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