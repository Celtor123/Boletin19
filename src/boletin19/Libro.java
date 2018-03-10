
package boletin19;

public class Libro  implements Comparable<Libro>{
     
    private String titulo,autor,ISBN;
    private int noUnidade;
    private float prezo;
    Libro(){
        
    }

    public Libro(String titulo, String autor, String ISBN, int noUnidade, float prezo) {
      
        this.titulo = titulo;
        this.autor = autor;
        this.ISBN = ISBN;
        this.noUnidade = noUnidade;
        this.prezo = prezo;
    }


  
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public int getNoUnidade() {
        return noUnidade;
    }

    public void setNoUnidade(int noUnidade) {
        this.noUnidade = noUnidade;
    }

    public float getPrezo() {
        return prezo;
    }

    public void setPrezo(float prezo) {
        this.prezo = prezo;
    }

    @Override
    public String toString() {
        return "Libro{" + "titulo=" + titulo + ", autor=" + autor + ", ISBN=" + ISBN + ", noUnidade=" + noUnidade + ", prezo=" + prezo + '}';
    }

    @Override
    public int compareTo(Libro t) {
       return titulo.compareTo(t.getTitulo());
    }
    
    
   
    
}

//1- Realiza un diagrama de clases que reflicta as relación entre as clases  e logo implementa o programa tendo en conta :
//Cada libro de levar : título , autor , ISBN (String ) , prezo , e numero de unidades.
//O programa debe :
//engadir libros
//vender ( borrar ) libros
//amosar  os libros que temos  ( Os libros deben estar ordenados polo campo titulo )
//dar de baixa os libros con numero de unidades =0
//consultar un libro determinado
//Nos métodos vender, amosar, baixas e consultar debes comprobar que o array recibido non é null. 
//No caso contrario lanza una excepción.
//Para a clase aplicación utiliza un paquete e para as demais outro paquete.
//Na aplicación do programa utiliza un menú con todas as opción .