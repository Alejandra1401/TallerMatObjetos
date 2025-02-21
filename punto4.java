public class punto4 
{
    public void punto4Teatro()
    {
        objTeatro ob = new objTeatro();
        objTeatro[][] ma = ob.llenarMatTeaP4();
        ob.mostrarMatTeatroP4(ma);
        objTeatro[] vectMatriz = ob.pasarMatAVector(ma);
        objTeatro[] vecMatOrdenado = ob.ordenamientoBurbuja(vectMatriz);
        objTeatro[][] maOrde = ob.pasarVectAMatriz(vecMatOrdenado, ma);
        System.out.println("Los asientos ordenados con precio dentro de cada fila:");
        for (int i = 0; i < ma.length; i++) 
        {
            for (int j = 0; j < ma[0].length; j++) 
            {
                System.out.print("Fila " + maOrde[i][j].getFila() + " asiento " + maOrde[i][j].getNumero()
                                     + " precio " + maOrde[i][j].getPrecio());
            }
            System.out.println();
            
        }
    }
    
}
