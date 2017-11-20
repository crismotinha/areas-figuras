package areasfiguras;

public class Triangulo extends FiguraGenerica {
    
    @Override
    public int calcArea(){
        return (this.getMedidas()[0]*this.getMedidas()[1])/2;
    }
    
    public Triangulo(int[] medidas){
        super(medidas);
    }
}
