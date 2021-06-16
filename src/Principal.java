package src;

import java.util.*;

public class Principal{
		
	public static void main(String[] args){
		
		Principal ej = new Principal();
	}	
	
	public Principal(){
		Scanner sn = new Scanner(System.in);
		Contador conta = new Contador(0);
		Contador conta2 = conta;
		conta2.setContador(5);
		System.out.println("Incremento: "+conta.getContador());
		System.out.println("Incremento: "+conta.mostrarIncremento());
		System.out.println("Decremento: "+conta.mostrarDecremento());
		
		Cuadrado cuadrado = new Cuadrado();
		Cuadrado cuadrado2 = cuadrado;
		cuadrado2.setCuadrado(6);
		System.out.println("Lado cuadrado: "+cuadrado.getCuadrado());
		System.out.println("Area cuadrado: "+cuadrado.calcularArea());
		System.out.println("Perimetro cuadrado: "+cuadrado.calcularPerimetro());
		
		circulo circulo1 = new circulo();
		circulo circulo2 = circulo1;
		circulo2.setCirculo(6);
		System.out.println("Radio circulo: "+circulo1.getCirculo());
		System.out.println("Area circulo: "+circulo1.calcularArea());
		System.out.println("Perimetro circulo: "+circulo1.calcularPerimetro());
		
		Rectangulo rectangulo = new Rectangulo();
		Rectangulo rectangulo2 = rectangulo;
		rectangulo2.setRectangulo(7.5, 8.5);
		System.out.println("Ancho rectangulo: "+rectangulo.getAncho());
		System.out.println("Largo rectangulo: "+rectangulo.getLargo());
		System.out.println("Area rectangulo: "+rectangulo.calcularArea());
		System.out.println("Perimetro rectangulo: "+rectangulo.calcularPerimetro());
		
		Fraccion fraccion = new Fraccion();
		Fraccion fraccion2 = fraccion;
		fraccion2.setNumerador(1);
		fraccion2.setDenominador(2);
		System.out.println("Numerador: "+fraccion.getNumerador());
		System.out.println("Denominador: "+fraccion.getDenominador());
	}
}