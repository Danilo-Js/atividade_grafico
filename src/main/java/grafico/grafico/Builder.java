/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package grafico.grafico;

import org.jfree.chart.plot.PlotOrientation;

/**
 *
 * @author mathe
 */
public interface Builder {
    private String title;
    private PlotOrientation orientation;
    private String color;
    private String colorGroup;
    private boolean legenda;
    private String tituloEixo1;
    private String tituloEixo2;

    public GraficoBuilder() {
    }

    public GraficoBuilder buildTitle(String title) {
        this.title = title;
        return this;
    }

    public GraficoBuilder buildOrientation(PlotOrientation orientation) {
        this.orientation = orientation;
        return this;
    }

    public GraficoBuilder buildColor(String color) {
        this.color = color;
        return this;
    }

    public GraficoBuilder buildColorGroup(String colorGroup) {
        this.colorGroup = colorGroup;
        return this;
    }

    public GraficoBuilder buildLegenda(boolean legenda) {
        this.legenda = legenda;
        return this;
    }

    public GraficoBuilder buildTituloEixo1(String tituloEixo1) {
        this.tituloEixo1 = tituloEixo1;
        return this;
    }

    public GraficoBuilder buildTituloEixo2(String tituloEixo2) {
        this.tituloEixo2 = tituloEixo2;
        return this;
    }
}
