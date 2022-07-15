package grafico.grafico;

import org.jfree.chart.plot.PlotOrientation;

public class Grafico {
    private String title;
    private PlotOrientation orientation;
    private String color;
    private String colorGroup;
    private boolean legenda;
    private String tituloEixo1;
    private String tituloEixo2;

    public Grafico(String title, PlotOrientation orientation, String color, String colorGroup, boolean legenda, String tituloEixo1, String tituloEixo2) {
        this.title = title;
        this.orientation = orientation;
        this.color = color;
        this.colorGroup = colorGroup;
        this.legenda = legenda;
        this.tituloEixo1 = tituloEixo1;
        this.tituloEixo2 = tituloEixo2;
    }

    /**
     * @return the title
     */
    public String getTitle() {
        return title;
    }

    /**
     * @param title the title to set
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * @return the orientation
     */
    public PlotOrientation getOrientation() {
        return orientation;
    }

    /**
     * @param orientation the orientation to set
     */
    public void setOrientation(PlotOrientation orientation) {
        this.orientation = orientation;
    }

    /**
     * @return the color
     */
    public String getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * @return the colorGroup
     */
    public String getColorGroup() {
        return colorGroup;
    }

    /**
     * @param colorGroup the colorGroup to set
     */
    public void setColorGroup(String colorGroup) {
        this.colorGroup = colorGroup;
    }

    /**
     * @return the legenda
     */
    public boolean isLegenda() {
        return legenda;
    }

    /**
     * @param legenda the legenda to set
     */
    public void setLegenda(boolean legenda) {
        this.legenda = legenda;
    }

    /**
     * @return the tituloEixo1
     */
    public String getTituloEixo1() {
        return tituloEixo1;
    }

    /**
     * @param tituloEixo1 the tituloEixo1 to set
     */
    public void setTituloEixo1(String tituloEixo1) {
        this.tituloEixo1 = tituloEixo1;
    }

    /**
     * @return the tituloEixo2
     */
    public String getTituloEixo2() {
        return tituloEixo2;
    }

    /**
     * @param tituloEixo2 the tituloEixo2 to set
     */
    public void setTituloEixo2(String tituloEixo2) {
        this.tituloEixo2 = tituloEixo2;
    }
    
}
