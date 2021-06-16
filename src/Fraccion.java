package src;

import java.util.*;

public class Fraccion{
	
	private int numerador;
	private int denominador;
	
	public static void main(String[] args){
		Scanner sn = new Scanner(System.in);
		
		//constructor por defecto.
		
		int num, dem;
		System.out.println("Constructor por defecto.\n");
		
		System.out.println("Ingrese el numerador: ");
		num = sn.nextInt();
		System.out.println("Ingrese el denominador: ");
		dem = sn.nextInt();
		System.out.println("\n");
		
		Fraccion f1 = new Fraccion(num, dem);
		Fraccion f2 = new Fraccion(num, dem);
		Fraccion f3 = new Fraccion(num, dem);
		Fraccion f4 = new Fraccion(num, dem);
		
		Fraccion suma = f1.sumar(f2);
		Fraccion resta = f1.restar(f3);
		Fraccion producto = f1.multiplicar(f4);
		Fraccion cociente = f1.dividir(f2);
		
		System.out.println(f1+" + "+f2+" = "+suma);
		System.out.println(f1+" - "+f3+" = "+resta);
		System.out.println(f1+" * "+f4+" = "+producto);
		System.out.println(f1+" / "+f2+" = "+cociente);
		
		//constructor por parametros
		System.out.println("\nConstructor por parametros.\n");
		Fraccion f5 = new Fraccion(1, 4);
		Fraccion f6 = new Fraccion(1, 2);
		Fraccion f7 = new Fraccion();
		Fraccion f8 = new Fraccion(4);
		
		Fraccion sumaa = f5.sumar(f6);
		Fraccion restaa = f5.restar(f7);
		Fraccion productoo = f5.multiplicar(f8);
		Fraccion cocientee = f5.dividir(f6);
		
		System.out.println(f5+" + "+f6+" = "+sumaa);
		System.out.println(f5+" - "+f7+" = "+restaa);
		System.out.println(f5+" * "+f8+" = "+productoo);
		System.out.println(f5+" / "+f6+" = "+cocientee);
		
	}
	
	public Fraccion(){
		this.numerador = 0;
		this.numerador = 1;
	}
	
	public Fraccion(int numerador, int denominador){
		this.numerador = numerador;
		if(denominador==0){
			denominador=1;
		}
		this.denominador = denominador;
		simplificar();
	}
	
	public Fraccion(int numerador){
		this.numerador = numerador;
		this.denominador = 1;
	}
	
	public int getDenominador(){
		return denominador;
	}
	
	public void setDenominador(int denominador){
		this.denominador = denominador;
	}
	
	public int getNumerador(){
		return numerador;
	}
	
	public void setNumerador(int numerador){
		this.numerador = numerador;
	}
	
	public Fraccion sumar(Fraccion f){
		Fraccion aux = new Fraccion();
		aux.numerador = this.numerador * f.denominador + this.denominador * f.numerador;
		aux.denominador = this.denominador*f.denominador;
		aux.simplificar();
		return aux;
	} 
	
	public Fraccion restar(Fraccion f){
		Fraccion aux = new Fraccion();
		aux.numerador = this.numerador * f.denominador - this.denominador * f.numerador;
		aux.denominador = this.denominador*f.denominador;
		aux.simplificar();
		return aux;
	} 
	
	public Fraccion multiplicar(Fraccion f){
		Fraccion aux = new Fraccion();
		aux.numerador = this.numerador * f.numerador;
		aux.denominador = this.denominador*f.denominador;
		aux.simplificar();
		return aux;
	} 
	
	public Fraccion dividir(Fraccion f){
		Fraccion aux = new Fraccion();
		aux.numerador = this.numerador * f.denominador;
		aux.denominador = this.denominador*f.numerador;
		aux.simplificar();
		return aux;
	} 
	
	private int mcd(){
		int u = Math.abs(numerador);
		int v = Math.abs(denominador);
		if(v == 0){
			return u;
		}
		
		int r;
		while(v != 0){
			r = u%v;
			u = v;
			v = r;
		}
		return u;
	}
	
	private void simplificar(){
		int n = mcd();
		numerador = numerador/n;
		denominador = denominador/n;
	}
	
	public String toString(){
		simplificar();
		return numerador+"/"+denominador;
	}
	
}