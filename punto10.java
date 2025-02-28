public class punto10 
{
    public void prodofertap10 ( int d)
    {
        objp10ofertaprod ob = new objp10ofertaprod();
        objp10ofertaprod[][] ma = ob.llenarMatrp10(d);
        ob.mostrarMatp10(ma);
        ob.cantProdenOferta(ma);
    }
}
