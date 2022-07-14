package com.mycompany.grafico;
import org.jfree.chart.*;
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

public class Index {

    public static ChartFrame start(){
    
        org.jfree.data.xy.XYSeries casos = new XYSeries("Casos");
        org.jfree.data.xy.XYSeries recuperados = new XYSeries("Recuperados");

        try {
            FileReader fr;
            fr=new FileReader("pessoas.csv");
            BufferedReader bf;
            bf = new BufferedReader(fr);
            String linha=bf.readLine();
            linha=bf.readLine();
            System.out.println(linha);
            int x=1;
            while(x<112){
                String[] dados=linha.split(";");
                if(dados.length>=15){
                    System.out.println(dados[11]);
                    System.out.println(dados[14]);
                    casos.add(x, Integer.parseInt(dados[11]));
                    recuperados.add(x, Integer.parseInt(dados[14]));
                }
                x++;
                linha=bf.readLine();
            }
        }catch(Exception e){
            System.out.println("Erro ao ler arquivo");
            System.out.println("Working Directory = " + System.getProperty("user.dir"));
            e.printStackTrace();
        }

        org.jfree.data.xy.XYSeriesCollection dataset = new XYSeriesCollection();
        dataset.addSeries(casos);
        dataset.addSeries(recuperados);

        JFreeChart chart = ChartFactory.createXYLineChart(
                "Comparativo de Novos Casos com Recuperados ",
                "Evolução",
                "Número de ocorrências",
                dataset,
                PlotOrientation.VERTICAL,
                true,
                true,
                false
        );

        XYPlot plot = chart.getXYPlot();

        org.jfree.chart.renderer.xy.XYLineAndShapeRenderer renderer = new XYLineAndShapeRenderer();

        renderer.setSeriesPaint(0, Color.RED);
        renderer.setSeriesStroke(0, new BasicStroke(2.0f));
        renderer.setSeriesPaint(1, Color.BLUE);
        renderer.setSeriesStroke(1, new BasicStroke(2.0f));

        plot.setRenderer(renderer);
        plot.setBackgroundPaint(Color.white);
        plot.setRangeGridlinesVisible(false);
        plot.setDomainGridlinesVisible(false);

        chart.getLegend().setFrame(BlockBorder.NONE);

        ChartFrame frame1 = new ChartFrame("Gráfico de linhas", chart);
        frame1.setVisible(true);
        frame1.setSize(1300, 800);
    
        return frame1;
    }

    public static void main(String[] args) {
        new TelaPrincipalPresenter();
    }
    
}