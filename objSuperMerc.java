import java.util.Scanner;

public class objSuperMerc 
{
    Scanner sc = new Scanner(System.in);
    public String nombre;
    public double precio;
    public boolean disponible;
    public objSuperMerc()
    {

    }
    public objSuperMerc(String nombre, double precio, boolean disponible)
    {
        this.nombre = nombre;
        this.precio = precio;
        this.disponible = disponible;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public double getPrecio() {
        return precio;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    public boolean isDisponible() {
        return disponible;
    }
    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }
    public objSuperMerc[][] llenarMaSupMerc(int d)
    {
        objSuperMerc[][] ma = new objSuperMerc[d][d];
        for (int i = 0; i < ma.length; i++) 
        {
            for (int j = 0; j < ma[i].length; j++) 
            {
                objSuperMerc obj = new objSuperMerc(); //Siempre se crea, NO OLIVDAR
                System.out.println("Ingrese el nombre del producto ");
                obj.setNombre(sc.next());
                System.out.println("Ingrese el precio del producto");
                while (!sc.hasNextDouble())//VALIDANDO QUE INGRESE UN DOUBLE 
                {
                    System.out.println("El valor del precio es incorrecto");
                    sc.next();//PARA QUE VUELVA Y PREGUNTE Y NO SEA UN CICLO INFINITO
                }
                obj.setPrecio(sc.nextDouble());
                System.out.println("Ingrese si el prodcuto esta disponible ");
                while (!sc.hasNextBoolean()) //Validando que ingrese un dooble 
                {
                    System.out.println("Es incorrecto, ingrese true o false");
                    sc.next();
                }
                obj.setDisponible(sc.nextBoolean());
                ma[i][j] = obj;
            }
        }
        return ma;
    }
    public void mostrarMatSupMerc(objSuperMerc[][] m)
    {
        for (int i = 0; i < m.length; i++) 
        {
            for (int j = 0; j < m[i].length; j++) 
            {
                System.out.println("Nombre del producto: " + m[i][j].getNombre());
                System.out.println("Precio del producto: " + m[i][j].getPrecio());
                System.out.println("Disponibilidad del producto:" + m[i][j].isDisponible());
                System.out.println("\n");
            }
        }
    }
    public objSuperMerc[][] matFiltradaDisp(objSuperMerc[][] ma)
    {
        objSuperMerc[][] maFiltroDisp = new objSuperMerc[ma.length][];
        for (int i = 0; i < ma.length; i++) 
        {
            maFiltroDisp[i] = new objSuperMerc[ma[i].length];//vector para encontrar el tamaño de las columnas que serian productos los disponibles
            for (int j = 0; j < ma[i].length; j++) 
            {
                if (ma[i][j] != null && ma[i][j].isDisponible() ) 
                {
                    maFiltroDisp[i][j] = ma[i][j];
                }
                else
                {
                    maFiltroDisp[i][j] = null;
                }
            }
        }
        return maFiltroDisp;
    }
    
}
