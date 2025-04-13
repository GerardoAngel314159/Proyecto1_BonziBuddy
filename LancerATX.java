public class LancerATX implements Gabinetes{


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
    private String descripcion;

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

    /**
     * Regresa el precio del gabinete
     * @return double con valor al precio del componente
     */
    public double getPrecio(){
        return precio;
    }

    /**
     * Regresa la descripcion del producto
     * @return String con valor a la descripcion del componente
     */
    public String getDescripcion(){
        return descripcion;
    }

    
    @Override
    public void ensamblarSSD(){
        tipoSSD = "Lancer ATX";
    }

    @Override
    public void getTipo(){
        System.out.pritnln(tipoGabinete);
    }

}