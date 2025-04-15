public class MEGGodlike implements Motherboard{

    /**
    * Atributos de la clase 
    */
    
    /**
    * Representa a la marca de la SSD
    */
    private String marca;

    /**
    * Representa el modelo de la SSD
    */
    private String modelo;

    private String chipset;
    /**
    * Representa al socket de la Motherboard
    */
    private String socket;

    /**
    * Representa a el tipo de meoria que es la RAM
    */
    private String formato;
    
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
     * Regresa la marca de la HDD
     * @return String con valor de la marca de la HDD
     */
    public String getMarca(){
        return marca;
    }

    /**
    * Regresa el modelo de la HDD
    * @return String con valor del modelo
    */
    public String getModelo(){
        return modelo;
    }


    public String getChipset(){
        return chipset;
    }

    public String getSocket(){
        return socket;
    }

    public String getformato(){
        return formato;
    }

    /**
     * Regresa el precio de la HDD
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
    public void ensamblarMotherboard(){
        modelo = "MEGGodlike"
    }

    @Override
    public void getTipo(){
        System.out.pritnln(modelo);
    }

} 