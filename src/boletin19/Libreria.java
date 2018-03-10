
package boletin19;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import javax.swing.JOptionPane;
public class Libreria{
 
        ArrayList<Libro> lista = new ArrayList<>();

    public Libreria() {
    }

    public ArrayList<Libro> getLista() {
        return lista;
    }

    public void setLista(ArrayList<Libro> lista) {
        this.lista = lista;
    }
        
    public void agregar(){
        String w=JOptionPane.showInputDialog("Ingrese nome");
         String y=JOptionPane.showInputDialog("Ingrese autor");
          String t=JOptionPane.showInputDialog("Ingrese ISBN");
          String e=JOptionPane.showInputDialog("Ingrese numero de unidad");
         int s= Integer.parseInt(e);
             String i=JOptionPane.showInputDialog("Ingrese prezo:");
         float a= Float.parseFloat(i);
        lista.add(new Libro(w,y,t,s,a));
         
    }
    public void venderLibros(){
        String w=JOptionPane.showInputDialog("Poña o numero do libro que quere eliminar");
        int r=Integer.parseInt(w);
        Iterator p=lista.iterator();
        p.remove();
    }
    public void amosarLibros(){
        
        for(Libro a:lista){
    System.out.println(a);
        }
    }
    public void darBaixa(){
    for(Libro noUnidade:lista){
        if(noUnidade!=null){
           
        }
        else{
             lista.remove(noUnidade);
        }
    }
        
    }
       public void consultarLibro(){
          String zs=JOptionPane.showInputDialog("Meta o nome do libro");
            for (Libro titulo : lista) {
                System.out.println(titulo);
                if(titulo.getTitulo()==zs){
                    System.out.println(titulo);
                }
                else{
                     System.out.println("No existe el libro");
                }
                          }
           
           }
       
       
    

    @Override
    public String toString() {
        return "Libreria{" + "lista=" + lista + '}';
    }
    
}
