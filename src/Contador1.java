package src;

import java.util.*;

public class Contador1{
	
	private int contador;
	
	public static void main(String[] args){
		Scanner sn = new Scanner(System.in);
		
		Contador1 contador1 = new Contador1();
		
		int num;
		System.out.println("Aca vemos lo que hace el contador por defecto.\n");
		System.out.print("Introduce un valor para inicializar el contador: ");
		num = sn.nextInt();
		System.out.print("\n");
		contador1.setContador(num);
		contador1.mostrarIncremento();
		System.out.println(contador1.getContador());
		
		contador1.mostrarIncremento();
		System.out.println(contador1.getContador());
		contador1.mostrarIncremento();
		System.out.println(contador1.getContador());
		
		contador1.mostrarDecremento();
		System.out.println(contador1.getContador());
		
		System.out.println("\nAca vemos lo que hace el contador por parametros.\n");
		Contador contador2 = new Contador(10);
		contador2.mostrarIncremento();
		System.out.println(contador2.getContador());
		contador2.mostrarDecremento();
		System.out.println(contador2.getContador());
		
		System.out.println("\nAca vemos lo que hace el contador copia.\n");
		Contador contador3 = new Contador(contador2);
		System.out.println(contador3.getContador());
		
	}
	
	//constructor por defecto
	public Contador1(){

	}
	
	//constructor por parametros
	public Contador1(int contador){
		if (contador < 0) {
            this.contador = 0;
        } else {
            this.contador = contador;
        }
	}
	
	//constructor copia
	public Contador1(final Contador1 copia){
		contador = copia.contador;
	}
	
	//Metodo incremento
	public void mostrarIncremento(){
		contador++;
	}
	
	//Metodo decremento
	public void mostrarDecremento(){
		contador--;
        if (contador < 0) {
            contador = 0;
        }
	}
	
	//Metodo getter
	public int getContador(){
		return contador;
	}
	
	//Metodo setter
	public void setContador(int contador){
		 if (contador < 0) {
            this.contador = 0;
        } else {
            this.contador = contador;
        }
	}
	
}