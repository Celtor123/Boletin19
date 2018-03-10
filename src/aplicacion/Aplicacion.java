package aplicacion;

import boletin19.Libreria;
import javax.swing.JOptionPane;

public class Aplicacion {

    public void menu() {
         Libreria k=new Libreria();
         int y = 0;
         while(y<6){
       String z= JOptionPane.showInputDialog("Elixa a operacion a realizar \n 1.meter \n 2.vender \n 3.amosar \n 4.dar de baixa \n 5.consultar \n 6.salir" );
       y=Integer.parseInt(z);
       
       switch(y){
           case 1:
            k.agregar();
            break;
           case 2:
            k.venderLibros();
             break;
           case 3:
            k.amosarLibros();
             break;
           case 4:
            k.darBaixa();
             break;
           case 5:   
                break;
            
       
       }}
    }
     public static void main(String[] args) {
         Aplicacion a= new Aplicacion();
            a.menu();
       
    }
}
