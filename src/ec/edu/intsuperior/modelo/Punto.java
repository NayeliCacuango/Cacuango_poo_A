
package ec.edu.intsuperior.modelo;
//los grados de visivilidad son: private, public, protected, defaut
//los atributos son de visibilidad private
public class Punto {
 private int x;
 private int y;
 
 //constructor por defecto
 public Punto() {
     
     System.out.println("objeto creado");
    }
 //constructor por por parametros
 public Punto(int x, int y) {
     this.x=x;
     this.y=y;
     System.out.println("Objeto Creado");
 
     }

    public void setX(int x) {
        this.x = x;
    }

    public int getX() {
        return x;
    }
 
 public void setY(int y){
     this.y=y;
 }

    public int getY() {
        return y;
    }
 
 }
