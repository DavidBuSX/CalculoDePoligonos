package Ejercicio9;


public abstract class Poligono {
    
    protected int numeroLados;
    
    public  Poligono(int numeroLados){
        this.numeroLados = numeroLados;
    }
    
    public int getPoligono(){
        return numeroLados;
    }
    @Override
    public String toString(){
        return "Numero de lados :"+numeroLados;
    
    }
    //Declaramos el metodo area como bastracto
    public abstract double area();
}
