import java.util.Scanner;

public class objTiendas 
{
    Scanner sc = new Scanner(System.in);
    public String nombre;
    public double precio;
    public int stock;
    public objTiendas()
    {

    }
    public objTiendas(String nombre, double precio, int stock)
    {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
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
    public int getStock() {
        return stock;
    }
    public void setStock(int stock) {
        this.stock = stock;
    }
    public objTiendas[][] llenarMaTienda1(int d)
    {
        objTiendas[][] ma = new objTiendas[d][d];
        for (int i = 0; i < ma.length; i++) 
        {
            for (int j = 0; j < ma.length; j++) 
            {
                objTiendas obj = new objTiendas(); //Siempre se crea, NO OLIVDAR
                System.out.println("Ingrese el nombre del producto de la tienda 1 ");
                obj.setNombre(sc.next());
                System.out.println("Ingrese el precio del producto de la tienda 1");
                while (!sc.hasNextDouble())//VALIDANDO QUE INGRESE UN DOUBLE 
                {
                    System.out.println("El valor del precio es incorrecto");
                    sc.next();//PARA QUE VUELVA Y PREGUNTE Y NO SEA UN CICLO INFINITO
                }
                obj.setPrecio(sc.nextDouble());
                System.out.println("Ingrese el stock(CANTIDAD) del producto de la tienda 1 ");
                obj.setStock(sc.nextInt());
                ma[i][j] = obj;
            }
        }
        return ma;
    }
    public objTiendas[][] llenarMaTienda2(int d)
    {
        objTiendas[][] ma = new objTiendas[d][d];
        for (int i = 0; i < ma.length; i++) 
        {
            for (int j = 0; j < ma.length; j++) 
            {
                objTiendas obj = new objTiendas(); //Siempre se crea, NO OLIVDAR
                System.out.println("Ingrese el nombre del producto de la tienda 2 ");
                obj.setNombre(sc.next());
                System.out.println("Ingrese el precio del producto de la tienda 2 ");
                while (!sc.hasNextDouble())//VALIDANDO QUE INGRESE UN DOUBLE 
                {
                    System.out.println("El valor del precio es incorrecto");
                    sc.next();//PARA QUE VUELVA Y PREGUNTE Y NO SEA UN CICLO INFINITO
                }
                obj.setPrecio(sc.nextDouble());
                System.out.println("Ingrese el stock(CANTIDAD) del producto de la tienda 2 ");
                obj.setStock(sc.nextInt());
                ma[i][j] = obj;
            }
        }
        return ma;
    }
    public void mostrarMatTienda1(objTiendas[][] m)
    {
        for (int i = 0; i < m.length; i++) 
        {
            for (int j = 0; j < m.length; j++) 
            {
                System.out.println("Nombre del producto tienda 1:" + m[i][j].getNombre());
                System.out.println("Precio del producto tienda 1:" + m[i][j].getPrecio());
                System.out.println("Stock del producto tienda 1:" + m[i][j].getStock());
                System.out.println("\n");
            }
        }
    }
    public void mostrarMatTienda2(objTiendas[][] m)
    {
        for (int i = 0; i < m.length; i++) 
        {
            for (int j = 0; j < m.length; j++) 
            {
                System.out.println("Nombre del producto tienda 2:" + m[i][j].getNombre());
                System.out.println("Precio del producto tienda 2:" + m[i][j].getPrecio());
                System.out.println("Stock del producto tienda 2:" + m[i][j].getStock());
                System.out.println("\n");
            }
        }
    }
}
