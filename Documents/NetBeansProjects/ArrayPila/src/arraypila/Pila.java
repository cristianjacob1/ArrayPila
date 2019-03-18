/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraypila;

/**
 *
 * @author pc
 */
public class Pila {
    private int pCima, Max;
    private Nodo[] P;
    
    public Pila(int Max){
        this.Max=Max;
        this.pCima=-1;
        this.P= new Nodo[Max];
    }
    public Pila(){
        Max=5;
        this.pCima=-1;
        this.P= new Nodo[5];
    }
    public boolean Es_Vacio(){
        return (pCima==-1);
    }
    public boolean Es_Llena(){
        return (pCima==Max);
    }
    public int pCima(){
        return (P[pCima].getElemento());
    }
    public void Apilar(int x){
        if(!Es_Llena()){
            pCima=pCima+1;
            P[pCima].setElemento(x);
        }else{
            System.out.println("Error de Memoria");
        }
    }
    public void Desapilar(){
        pCima=pCima-1;
    }
}
