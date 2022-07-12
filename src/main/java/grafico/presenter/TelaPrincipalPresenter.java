package grafico.presenter;

import grafico.view.TelaPrincipal;

public class TelaPrincipalPresenter {
    private TelaPrincipal view; 
    
    public TelaPrincipalPresenter() {
        this.view = new TelaPrincipal();
        
        //  Listeners
        
        this.view.setVisible(true);
    }
}
