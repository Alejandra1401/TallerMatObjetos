import java.util.Scanner;

public class objTeatro 
{
    Scanner sc = new Scanner(System.in);
    public int numero;
    public int fila;
    public double precio;
    public objTeatro()
    {

    }
    public objTeatro(int numero, int fila, double precio)
    {
        this.numero = numero;
        this.fila = fila;
        this.precio = precio;
    }
    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
    public int getFila() {
        return fila;
    }
    public void setFila(int fila) {
        this.fila = fila;
    }
    public double getPrecio() {
        return precio;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    public objTeatro[][] llenarMatTeaP4()
    {
        int n,m;
        System.out.println("Ingrese la cantidad de filas para el teatro");
        n = sc.nextInt();
        System.out.println("Ingrese el numero de sillas para el teatro");
        m = sc.nextInt();
        objTeatro[][] ma = new objTeatro[n][m];
        for (int i = 0; i < ma.length; i++) 
        {
            for (int j = 0; j < ma[0].length; j++) 
            {
                objTeatro obj = new objTeatro(); //Siempre se crea, NO OLVIDAR 
                System.out.println("Ingrese la fila que desea");
                obj.setFila(sc.nextInt());
                System.out.println("Ingrese el número del asiento");
                obj.setNumero(sc.nextInt());
                System.out.println("Ingrese el precio del asiento ");
                obj.setPrecio(sc.nextDouble());
                ma[i][j] = obj;
            }
        }
        return ma;
    }
    public void mostrarMatTeatroP4(objTeatro[][] m)
    {
        for (int i = 0; i < m.length; i++) 
        {
            for (int j = 0; j < m[0].length; j++) 
            {
                System.out.println("La fila es:" + m[i][j].getFila());
                System.out.println("Número del asiento:" + m[i][j].getNumero());
                System.out.println("Precio del asiento:" + m[i][j].getPrecio());
                System.out.println("\n");
            }
        }
    }
    public objTeatro[] ordenamientoBurbuja (objTeatro[] vecMa)
    {
        for (int i = 0; i < vecMa.length - 1; i++) //Ordenamiento burbuja, de menor a mayor
        {
            for (int j = 0; j < vecMa.length -1 -i; j++) 
            {
                if(vecMa[j].getPrecio() > vecMa[j+1].getPrecio())
                {
                    objTeatro auxil = vecMa[j];
                    vecMa[j] = vecMa[j+1];
                    vecMa[j+1] = auxil;
                }
            }
        }
        return vecMa;
    }
    public objTeatro[] pasarMatAVector(objTeatro[][] ma)//Paso de vector a matriz en punto4
    {
        int filas = ma.length;
        int columnas = ma[0].length;
        int k = 0;
        objTeatro[] vectMatriz = new objTeatro[filas*columnas];
        for (int i = 0; i < ma.length; i++) 
        {
            for (int j = 0; j < ma[0].length; j++) 
            {
                vectMatriz[k++] = ma[i][j];
                
            }
        }
        return vectMatriz;
    }
    public objTeatro[][] pasarVectAMatriz(objTeatro[] vectOrd, objTeatro[][] ma)
    {
        int recVec = 0;
        for (int i = 0; i < ma.length; i++) //Paso de vector a matriz 
        {
            for (int j = 0; j < ma[0].length; j++) 
            {
                ma[i][j] = vectOrd[recVec++];
            }
        }
        return ma;
    }
}
