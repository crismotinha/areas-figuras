package areasfiguras;
import java.util.Scanner;

public class AreasFiguras {

    public static void main(String[] args) {
        Boolean escolhendo = true;
        Scanner teclado = new Scanner(System.in);
        while(escolhendo){
            System.out.println("Escolha qual forma geométrica você quer:");
            System.out.println("1 - Quadrado\n2 - Retângulo\n3 - Triângulo\n" 
                    + "4 - Círculo\n\n\n0 - Sair\n\n---");
            int escolha = teclado.nextInt();
            switch(escolha){
                case 1:
                    System.out.println("Insira o valor do lado");
                    int[] lado = new int[1];
                    lado[0] = teclado.nextInt();
                    Quadrado square = new Quadrado(lado);
                    System.out.println("Area:" + square.calcArea());
                break;
                case 2:
                    System.out.println("Insira o valor da base");
                    int[] medidasRet = new int[2];
                    medidasRet[0] = teclado.nextInt();
                    System.out.println("Insira o valor da altura");
                    medidasRet[1] = teclado.nextInt();
                    Retangulo retangle = new Retangulo(medidasRet);
                    System.out.println("Area:" + retangle.calcArea());
                break;
                case 3:
                    System.out.println("Insira o valor da base");
                    int[] medidasTri = new int[2];
                    medidasTri[0] = teclado.nextInt();
                    System.out.println("Insira o valor da altura");
                    medidasTri[1] = teclado.nextInt();
                    Triangulo primeiro = new Triangulo(medidasTri);
                    System.out.println("Area:" + primeiro.calcArea());
                break;
                case 4:
                    System.out.println("Insira o valor do raio");
                    int[] medidasCir = new int[1];
                    medidasCir[0] = teclado.nextInt();
                    Circulo circle = new Circulo(medidasCir);
                    System.out.println("Area:" + circle.calcArea());
                break;
                case 0:
                    escolhendo = false;
                break;
            }
        }

        
        
        
    }
    
}
