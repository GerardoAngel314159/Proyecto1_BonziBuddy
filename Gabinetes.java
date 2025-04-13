/**
*interfaz que representa a los gabinetes en general, de las computadorasque se crearan  
*/
public interface Gabinetes{

    
    public String getMarca();
    public String getModelo();
    public boolean getRGB();
    public double getPrecio();
    public String getDescripcion();
    public void ensamblarGabinete();
    public void getTipo();
}