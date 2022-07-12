package grafico.presenter;

import grafico.view.TelaPrincipal;

public class TelaPrincipalPresenter {
    private TelaPrincipal view; 
    
    public TelaPrincipalPresenter() {
        this.view = new TelaPrincipal();
        
        // Elementos Gráficos
        // Título
        this.view.getRadio_Titulo().addActionListener((e) -> {

        });
        
        // Legenda
        this.view.getRadio_Legenda().addActionListener((e) -> {

        });
        
        // Título dos eixos
        this.view.getRadio_TituloDosEixos().addActionListener((e) -> {
            
        });
        
        // Rótulo de dados (%)
        this.view.getRadio_RotuloDeDadosPercent().addActionListener((e) -> {
            
        });
        
        // Rótulo de dados - Valor
        this.view.getRadio_RotuloDeDadosValor().addActionListener((e) -> {
            
        });
        
        // Rótulo de dados - Valor (%)
        this.view.getRadio_RotuloDeDadosValorPercent().addActionListener((e) -> {
            
        });
        
        // Cor das barras
        this.view.getRadio_CorDasBarras().addActionListener((e) -> {
            
        });
        
        // Cor das barras (por grupo)
        this.view.getRadio_CorDasBarrasPorGrupo().addActionListener((e) -> {
            
        });
        
        // Grade
        this.view.getRadio_Grade().addActionListener((e) -> {
            
        });
        
        
        this.view.setVisible(true);
    }
}
