package areasfiguras;

public abstract class FiguraGenerica {
    private final int[] medidas;
    
    public int[] getMedidas (){
        return this.medidas;
    }
    
    public abstract int calcArea();
    
    public FiguraGenerica(int[] medidas){
        this.medidas = medidas;
    }
}
