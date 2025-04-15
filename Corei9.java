public class Corei9 implements Procesador{
    /**
    * Atributos de la clase 
    */
    
    /**
     * Representa a la marca del procesador
     */
    private String marca;

    /**
     * Representa el modelo del procesador
     */
    private String modelo;

    /**
     * Representa los nucleos del procesador
     */
    private int nucleos;

    /**
     * Representa a los hilos del procesador
     */
    private int hilos;

    /**
     * Representa a la frecuencia del procesador
     */
    private double frecuencia;

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
     * Regresa la marca del procesador
     * @return String con valor de la marca del procesador
     */
    public String getMarca(){
        return marca;
    }

    /**
    * Regresa el modelo del procesador
    * @return String con valor del modelo
    */
    public String getModelo(){
        return modelo;
    }


    public int getNucleos(){
        return nucleos;
    }

    public int getHilos(){
        return hilos;
    }

    public double getFrecuencia(){
        return frecuencia;
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
        modelo = "COre i9-13900K";
    }

    @Override
    public void getTipo(){
        System.out.pritnln(modelo);
    }

}