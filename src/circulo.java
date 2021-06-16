package src;

import java.util.*;

public class circulo{
	
	private double radio;
	private double area;
	private double perimetro;
	
	public static void main(String[] args){
		Scanner sn = new Scanner(System.in);
		
		circulo circulo1 = new circulo();
		
		double rad;
		System.out.print("Ingrese el valor del radio del circulo: ");
		rad = sn.nextDouble();
		
		circulo1.setCirculo(rad);
		circulo1.calcularArea();
		System.out.print("\nEl area del circulo es: "+circulo1.getArea());
		circulo1.calcularPerimetro();
		System.out.print("\nEl perimetro del circulo es: "+circulo1.getPerimetro());
	}
	
	public circulo(){
		
	}
	
	public double getCirculo(){
		return radio;
	}
	
	public void setCirculo(double radio){
		if(radio < 0){
			System.out.println("\nEl radio debe ser positivo. Por lo tanto: ");
		}else{
			this.radio = radio;
		}
	}

	public double getArea(){
		return area;
	}
	
	public double getPerimetro(){
		return perimetro;
	}
	
	public double calcularArea(){
		double PI = 3.1416;
		area = PI*radio*radio;
		return area;
	}
	
	public double calcularPerimetro(){
		double PI = 3.1416;
		perimetro = 2*PI*radio;
		return perimetro;
	}
	
}