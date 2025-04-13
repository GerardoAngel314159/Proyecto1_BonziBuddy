/**
 * Interfaz la cual representa a las SSd que se usaran para construir las computadoras
 */
public interface SSD {

    public String getMarca();
    public String getModelo();
    public int getCapacidad();
    public double getPrecio();
    public String getDescripcion();

    public void ensamblarSSD();

    public void getTipo();

}