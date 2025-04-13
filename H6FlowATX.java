/**
 * Clase que representa a los Gabinetes H6 Flow ATX, los cuales eimplementan a la interfaz Gabinetes
 */
public class H6FlowATX implements Gabinetes{


    /**
     * Atributos de la clase 
     */
    
    /**
     * Representa a la marca del gabinete
     */
    private String marca;

    /**
     * Representa al modelo del gabinete
     */
    private String modelo;

    /**
     * Representa si el Gabinete cuenta con RGB
     */
    private boolean RGB;

    /**
     * Representa el precio del componente
     */
    private double precio;

    /**
     * Representa la descripcion del componente
     */
    private String desripcion;

    /**
    * Metodos de la clase 
    */
    

    /**
     * Regresa la marca del gabinete
     * @return String con valor de la marca del gabinete
     */
    public String getMarca(){
        return marca;
    }

    /**
     * Regresa el modelo del gabinete
     * @return String con valor del modelo
     */
    public String getModelo(){
        return modelo;
    }

    /**
     * Regresa si el gabinete tiene RGB
     * @return boolean con valor si tiene rgb o no
     */
    public boolean getRGB(){
        return RGB;
    }

    public double getPrecio(){
        return precio;
    }

    public String getDescripcion(){
        return desripcion;
    }



    @Override
    public void ensamblarSSD(){
        modelo = "H6 Flow ATX";
    }

    @Override
    public void getTipo(){
        System.out.pritnln(tipoGabinete);
    }

}