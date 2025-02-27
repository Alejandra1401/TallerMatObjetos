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
    public objTiendas[][] llenarMatrizTiendasp5(int f, int c)
    {
        objTiendas[][] ma = new objTiendas[f][c];
        for (int i = 0; i < f; i++) //ó m.length
        {
            for (int j = 0; j < c; j++) // ó m[i].length 
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
    public objTiendas[][] SumarStock(objTiendas[][] m1, objTiendas[][]m2)
    {
        if (((m1.length * m1[0].length) > (m2.length * m2[0].length))) 
        {
            for (int i = 0; i < m1.length; i++) 
            {
                for (int j = 0; j < m1[0].length; j++) 
                {
                    for (int i2 = 0; i2 < m2.length; i2++) 
                    {
                        for (int j2 = 0; j2 < m2[0].length; j2++) 
                        {
                            if (m1[i][j].getNombre().equalsIgnoreCase(m2[i2][j2].getNombre())) 
                            {
                                m1[i][j].setStock(m1[i][j].getStock() + m2[i2][j2].getStock());   
                            }
                        }
                        
                    }
                    
                }
                
            }
            return m1;
        }
        else if (((m1.length * m1[0].length) < (m2.length * m2[0].length))) 
        {
            for (int i = 0; i < m2.length; i++) 
            {
                for (int j = 0; j < m2[0].length; j++) 
                {
                    for (int i2 = 0; i2 < m1.length; i2++) 
                    {
                        for (int j2 = 0; j2 < m1[0].length; j2++) 
                        {
                            if (m2[i][j].getNombre().equalsIgnoreCase(m1[i2][j2].getNombre())) 
                            {
                                m2[i][j].setStock(m1[i][j].getStock() + m2[i2][j2].getStock());   
                            }
                        }
                        
                    }
                    
                }
                
            }
            return m2;
        }
        else
        {
            for (int i = 0; i < m1.length; i++) 
            {
                for (int j = 0; j < m1[0].length; j++) 
                {
                    for (int i2 = 0; i2 < m2.length; i2++) 
                    {
                        for (int j2 = 0; j2 < m2[0].length; j2++) 
                        {
                            if (m1[i][j].getNombre().equalsIgnoreCase(m2[i2][j2].getNombre())) 
                            {
                                m1[i][j].setStock(m1[i][j].getStock() + m2[i2][j2].getStock());   
                            }
                        }
                        
                    }
                    
                }
                
            }
            return m1;
        }
    }
    public void MostrarMatrizObjPunto5(objTiendas[][] m)
    {
        for (int i = 0; i < m.length; i++) 
        {
            for (int j = 0; j < m.length; j++) 
            {
                System.out.println("Nombre: " + m[i][j].getNombre());
                System.out.println("Precio: " + m[i][j].getPrecio());
                System.out.println("Cantidad: " + m[i][j].getStock());
                System.out.println("\n");
                
            }
            
        }
    }
}
