public interface Procesador{
    public String getMarca();
    public String getModelo();
    public int getNucleos();
    public int getHilos();
    public double getFrecuencia();
    public double getPrecio();
    public String getDescripcion();

    public void ensamblarProcesador();

    public void getTipo();
}