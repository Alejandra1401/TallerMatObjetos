public class punto5 
{
    public void punto5Tiendas(int d)
    {
        objTiendas ob = new objTiendas();
        objTiendas[][] matTienda1 = ob.llenarMaTienda1(d);
        objTiendas[][] matTienda2 = ob.llenarMaTienda2(d);
        ob.mostrarMatTienda1(matTienda1);
        ob.mostrarMatTienda2(matTienda2);
    }
}
