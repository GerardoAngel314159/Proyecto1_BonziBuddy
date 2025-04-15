public class Adata8GB implements RAM{

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

    /**
    * Representa la capacidad de la SSD
    */
    private int capacidad;

    /**
    * Representa a el tipo de meoria que es la RAM
    */
    private String tipoMemoria;
    
    /**
    * Representa el precio del componente
    */
    private double precio;

    /**
    * Representa la descripcion del componente
    */
    private String certificacion;

        /**
    * Metodos de la clase 
    */
    
    /**
     * Regresa la marca de la SSD
     * @return String con valor de la marca de la SSD
     */
    public String getMarca(){
        return marca;
    }

    /**
    * Regresa el modelo de la SSD
    * @return String con valor del modelo
    */
    public String getModelo(){
        return modelo;
    }


    public int getCapacidad(){
        return capacidad;
    }

    public String getTipoMemoria(){
        return tipoMemoria;
    }

    /**
     * Regresa el precio de la SSD
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
        tipoSSD = "8 GB";
    }

    @Override
    public void getTipo(){
        System.out.pritnln(tipoSSD);
    }

}