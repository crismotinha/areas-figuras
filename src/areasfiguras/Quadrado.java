package areasfiguras;

public class Quadrado extends FiguraGenerica {
    
    @Override
    public int calcArea(){
        return this.getMedidas()[0]*this.getMedidas()[0];
    }
    
    public Quadrado(int[] lado){
        super(lado);
    }

}
