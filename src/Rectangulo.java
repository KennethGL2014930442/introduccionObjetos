package src;

import java.util.*;

public class Rectangulo{
	
	private double largo;
	private double ancho;
	private double area;
	private double perimetro;
	
	public static void main(String[] args){
		Scanner sn = new Scanner(System.in);
		
		Rectangulo rectangulo1 = new Rectangulo();
		
		double an, lg;
		System.out.print("\nIngrese el largo del rectangulo: ");
		lg = sn.nextDouble();
		System.out.print("\nIngrese el ancho del rectangulo: ");
		an = sn.nextDouble();
		
		if(lg != an){
			rectangulo1.setRectangulo(lg, an);
			rectangulo1.calcularArea();
			System.out.print("\nEl area del circulo es: "+rectangulo1.getArea());
			rectangulo1.calcularPerimetro();
			System.out.println("\nEl perimetro del circulo es: "+rectangulo1.getPerimetro());
		}else{
			System.out.println("\nEl ancho y el largo deben ser distintos.");
		}
	}
	
	public Rectangulo(){
		
	}
	
	public double getAncho(){
		return ancho;
	}
	
	public double getLargo(){
		return largo;		
	}
	
	public void setRectangulo(double largo, double ancho){
		if((largo < 0) || (ancho<0)){
			System.out.println("\nEl largo y ancho deben ser positivos. Por lo tanto: ");
		}else{
			this.largo = largo;
			this.ancho = ancho;
		}
	}

	public double getArea(){
		return area;
	}
	
	public double getPerimetro(){
		return perimetro;
	}
	
	public double calcularArea(){
		area = ancho*largo;
		return area;
	}
	
	public double calcularPerimetro(){
		perimetro = 2*(ancho+largo);
		return perimetro;
	}
	
}