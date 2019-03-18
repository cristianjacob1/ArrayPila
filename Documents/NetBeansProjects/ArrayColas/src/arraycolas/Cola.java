
package arraycolas;

/**
 *
 * @author Christian Isturiz
 */
public class Cola {
    private int Max, In, Last, First;
    private Nodo[] Cola;
    public Cola(int Max){
        this.Max=Max;
        In=0;
        Last=-1;
        First=-1;
        Cola= new Nodo[Max];
    }
    public boolean Es_Vacio(){
        return (In==0);
    }
    
    public boolean Es_Lleno(){
        return (In==Max);
    }
    public int Pfirst(){
        return Cola[First].getElemento();
    }
    public void Encolar(int x){
        if(!Es_Lleno()){
            if(Es_Vacio()){
            Last=(Last+1)%(Max);
            First=(First+1)%(Max);
            Nodo Paux=new Nodo();
            Paux.setElemento(x);
            Cola[Last]=Paux;
             }else{
            Last=(Last+1)%(Max);
            Nodo Paux=new Nodo();
            Paux.setElemento(x);
            Cola[Last]=Paux;
            }
            In=In+1;
    }else{
            System.out.println("Error de memoria");
        }
    }
    public void Desencolar(){
        if(!Es_Vacio()){
            In=In-1;
            if(!Es_Vacio()){
              First=(First+1)%(Max);  
            }
        }else{
            System.out.println("La cola esta Vacia");
        }
    }
    
}
