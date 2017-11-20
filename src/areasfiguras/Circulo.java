package areasfiguras;

public class Circulo extends FiguraGenerica {
    
    @Override
    public int calcArea(){
        return (int) (this.getMedidas()[0]*this.getMedidas()[0]*Math.PI);
    }
    
    public Circulo(int[] raio){
        super(raio);
    }
}
