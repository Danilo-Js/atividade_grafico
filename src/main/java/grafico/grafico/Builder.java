package grafico.grafico;

import org.jfree.chart.plot.PlotOrientation;

public interface Builder {
    public GraficoBuilder buildTitle(String title);

    public GraficoBuilder buildOrientation(PlotOrientation orientation);

    public GraficoBuilder buildColor(String color);

    public GraficoBuilder buildColorGroup(String colorGroup);

    public GraficoBuilder buildLegenda(boolean legenda);

    public GraficoBuilder buildTituloEixo1(String tituloEixo1);

    public GraficoBuilder buildTituloEixo2(String tituloEixo2);
}
