
package boletin19;
import java.util.ArrayList;
import javax.swing.JOptionPane;
public class Libreria {
    Libro k=new Libro();
        ArrayList<Libro> lista = new ArrayList<>();

    public Libreria() {
    }
        
    public void agregar(){
        String w=JOptionPane.showInputDialog("Ingrese nome");
         String y=JOptionPane.showInputDialog("Ingrese autor");
          String t=JOptionPane.showInputDialog("Ingrese ISBN");
          String e=JOptionPane.showInputDialog("Ingrese numero de unidad");
         int s= Integer.parseInt(e);
             String i=JOptionPane.showInputDialog("Ingrese prezo:");
         int a= Integer.parseInt(i);
        lista.add(new Libro(w,y,t,s,a));
         
    }
    public void venderLibros(int a){
        lista.remove(a);
    }
    public void amosarLibros(){
        
    System.out.println(lista);
    }
    public void darBaixa(){
        for(){
        if(lista.contains(titulo=null)){
            lista.remove)
        }
        }
    }
    
       
    
    
}
