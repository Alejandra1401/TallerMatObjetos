import java.util.Scanner;
public class objEstanteriap8 
{
    Scanner sc = new Scanner(System.in);
    private String nombre;
    private double peso;
    private String categoria;
    public objEstanteriap8() {
    }
    public objEstanteriap8(String nombre, double peso, String categoria) {
        this.nombre = nombre;
        this.peso = peso;
        this.categoria = categoria;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public double getPeso() {
        return peso;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }
    public String getCategoria() {
        return categoria;
    }
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    public objEstanteriap8[][] llenarMatrP8(int d)
    {  
        objEstanteriap8[][] matProd = new objEstanteriap8[d][d];
        for (int i = 0; i < matProd.length; i++) 
        {
            for (int j = 0; j < matProd.length; j++) 
            {
                objEstanteriap8 obj = new objEstanteriap8(); //Siempre se crea, NO OLVIDAR
                System.out.println("Ingrese el nombre del producto ");
                obj.setNombre(sc.next());
                System.out.println("Ingrese el peso del producto ");
                obj.setPeso(sc.nextDouble());
                System.out.println("Ingrese la categoria del producto ");
                obj.setCategoria(sc.next());
                matProd[i][j] = obj;
            }
        }
        return matProd;
    }
    
}
