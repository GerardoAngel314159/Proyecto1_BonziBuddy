/**
 * Representa una tarjeta grafica AMDRX6600.
 */
public class AMDRX6600 {
    /**
     * Marca del fabricante de la tarjeta grafica.
     */
    private String marca;

    /**
     * Modelo especifico de la tarjeta grafica.
     */
    private String modelo;

    /**
     * Cantidad de memoria RAM dedicada a la tarjeta.
     */
    private int ramTG;

    /**
     * Precio de la tarjeta grafica en la moneda local.
     */
    private double precio;

    /**
     * Obtiene la marca de la tarjeta grafica.
     *
     * @return la marca
     */
    public String getMarca() {
        return marca;
    }

    /**
     * Obtiene el modelo de la tarjeta grafica.
     *
     * @return el modelo especifico
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * Obtiene la cantidad de memoria RAM de la tarjeta.
     *
     * @return la memoria RAM de la Tarjeta Grafica
     */
    public int getRamTG() {
        return ramTG;
    }

    /**
     * Obtiene el precio de la tarjeta grafica.
     *
     * @return el precio en la moneda local
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * Metodos para ensamblar la tarjeta gráfica.
     */
    public void ensamblarTargeta() {
    }
}
