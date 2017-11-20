package areasfiguras;

public class Retangulo extends FiguraGenerica {
    
    @Override
    public int calcArea(){
        return this.getMedidas()[0]*this.getMedidas()[1];
    }
    
    public Retangulo(int[] medidas){
        super(medidas);
    }
}
