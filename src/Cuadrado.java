package src;

import java.util.*;

public class Cuadrado{
	
	private double lado;
	private double area;
	private double perimetro;
	
	public static void main(String[] args){
		Scanner sn = new Scanner(System.in);
		
		Cuadrado cuadrado1 = new Cuadrado();
		
		double lad;
		System.out.println("Ingrese el valor de un lado del cuadrado: ");
		lad = sn.nextDouble();
		
		cuadrado1.setCuadrado(lad);
		cuadrado1.calcularArea();
		System.out.println("El area del cuadrado es: "+cuadrado1.getArea());
		cuadrado1.calcularPerimetro();
		System.out.println("El perimetro del cuadrado es: "+cuadrado1.getPerimetro());
	}
	
	public Cuadrado(){
		
	}
	
	public double getCuadrado(){
		return lado;
	}
	
	public void setCuadrado(double lado){
		this.lado = lado;
	}

	public double getArea(){
		return area;
	}
	
	public double getPerimetro(){
		return perimetro;
	}
	
	public double calcularArea(){
		area = lado*lado;
		return area;
	}
	
	public double calcularPerimetro(){
		perimetro = 4*lado;
		return perimetro;
	}
	
}