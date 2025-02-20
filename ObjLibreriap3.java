public class ObjLibreriap3 
{
    private String titulo;
    private String autor;
    private double precio;
    public ObjLibreriap3()
    {

    }
    public ObjLibreriap3(String titulo, String autor, double precio)
    {
        this.autor = autor;
        this.titulo = titulo;
        this.precio = precio;
    }
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public double getPrecio() {
        return precio;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
}
