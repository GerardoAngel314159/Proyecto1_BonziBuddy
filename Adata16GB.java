public class Adata16GB implements RAM{

    /**
    * Atributos de la clase 
    */
    
    /**
    * Representa a la marca de la RAM
    */
    private String marca;

    /**
    * Representa el modelo de la RAM
    */
    private String modelo;

    /**
    * Representa la capacidad de la RAM
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
     * Descripcion de la RAM
     */
    private String descripcion;

        /**
    * Metodos de la clase 
    */
    
    /**
     * Regresa la marca de la RAM
     * @return String con valor de la marca de la RAM
     */
    public String getMarca(){
        return marca;
    }

    /**
    * Regresa el modelo de la RAM
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
     * Regresa el precio de la RAM
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
    public void ensamblarRAM(){
        tipoRAM = "16 GB";
    }

    @Override
    public void getTipo(){
        System.out.pritnln(tipoRAM);
    }

}