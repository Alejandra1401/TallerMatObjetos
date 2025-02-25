import java.util.Scanner;

public class punto7 
{
    Scanner sc = new Scanner(System.in);
    public void punto7Estudiantes(int d)
    {
        objEscuela ob = new objEscuela();
        objEscuela[][] ma = ob.llenarMatEstudiantes(d);
        objEscuela[] vectCalif = ob.calificacionUnica(ma);
        ob.matrizXCalificación(ma, vectCalif);
        
       
        
    }
    
    
}
