import java.util.Scanner;

public class objEscuela
{
    Scanner sc = new Scanner(System.in);
    public String nombre;
    public String calificacion;
    public objEscuela() {
    }
    public objEscuela(String nombre, String calificacion) {
        this.nombre = nombre;
        this.calificacion = calificacion;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getCalificacion() {
        return calificacion;
    }
    public void setCalificacion(String calificacion) {
        this.calificacion = calificacion;
    }
    public objEscuela[][] llenarMatEstudiantes(int d)
    {
        objEscuela[][] ma = new objEscuela[d][d];
        for (int i = 0; i < ma.length; i++) 
        {
            for (int j = 0; j < ma.length; j++) 
            {
                objEscuela obj = new objEscuela(); //Siempre se crea y se pregunda dentro del for interno para que me llene y se renueve para la sgtre persona
                System.out.println("Ingrese el nombre del estudiante ");
                obj.setNombre(sc.next());
                System.out.println("Ingrese la calificación del estudiante ");
                obj.setCalificacion(sc.next());
                ma[i][j] = obj;
            }
        }
        return ma;
    }
    public objEscuela[] calificacionUnica(objEscuela[][] ma)
    {
        objEscuela[] calificacionesUnicas = new objEscuela[ma.length*ma[0].length];
        int cont = 0;
        for (int i = 0; i < ma.length; i++) 
        {
            for (int j = 0; j < ma.length; j++) 
            {
                String calificaciones = ma[i][j].getCalificacion();
                boolean existe = false;
                for (int k = 0; k < cont; k++) //Recorre el vector calificaciones unicas
                {
                    if(calificacionesUnicas[k].getCalificacion().equals(calificaciones))
                    {
                        existe = true;//ya existe la calificacion, entonces no la guardo
                        break;
                    }
                }
                if(!existe)
                {
                    calificacionesUnicas[cont++] = ma[i][j];//Guardo la nueva calificacion y se pone en la sgte posicion del vector(cont++)
                                                                    
                }
            }
        }
        return calificacionesUnicas;
    }
    public void matrizXCalificación(objEscuela[][] ma, objEscuela[] unicas)
    {
        int cont = unicas.length;
        //Crear y mostrar matrices para cada calificacion unica
        for (int k = 0; k < cont; k++) //ciclo del vector con las calificaciones unicas que hay
        {
            String calificacionActual = unicas[k].getCalificacion();
            objEscuela[][] grupo = new objEscuela[ma.length][ma.length];
            for (int i = 0; i < ma.length; i++) 
            {
                for (int j = 0; j < ma.length; j++) 
                {
                    if(ma[i][j].getCalificacion().equals(calificacionActual))
                    {
                        grupo[i][j] = ma[i][j];
                    }
                }
            }
            System.out.println("Grupo " + calificacionActual + ":");
            mostrarMatrizEscuela(grupo);
        }
    }
    public static void mostrarMatrizEscuela(objEscuela[][] ma)
    {
        for (int i = 0; i < ma.length; i++) 
        {
            for (int j = 0; j < ma[i].length; j++) 
            {
                if(ma[i][j] != null)
                {
                    System.out.println("Nombre: " + ma[i][j].getNombre());
                    System.out.println("Calificación:" + ma[i][j].getCalificacion());
                    System.out.println("\n");
                }
               
            }
        }
    }
}