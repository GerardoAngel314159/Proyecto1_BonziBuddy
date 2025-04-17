/**
 * Clase que representa una fuente de poder XPG de 500W.
 * Contiene información basica sobre el producto.
 * el precio y la certificacion de la unidad.
 */
public class XPG500W {
    /**
     * Marca de la fuente de poder.
     */
    private String marca;

    /**
     * Modelo específico de la fuente de poder.
     */
    private String modelo;

    /**
     * Potencia maxima de salida en vatios (W).
     */
    private int potencia;

    /**
     * Precio de la fuente de poder.
     */
    private double precio;

    /**
     * Certificacion de eficiencia energetica.
     */
    private String certificacion;

    /**
     * Devuelve la marca de la fuente de poder.
     *
     * @return la marca.
     */
    public String getMarca() {
        return marca;
    }

    /**
     * Devuelve el modelo de la fuente de poder.
     *
     * @return el modelo.
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * Devuelve la potencia nominal de la fuente de poder.
     *
     * @return potencia en vatios.
     */
    public int getPotencia() {
        return potencia;
    }

    /**
     * Devuelve el precio de la fuente de poder.
     *
     * @return precio de la Fuente de Alimentacion.
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * Devuelve la certificacion energetica de la fuente de poder.
     *
     * @return certificacion.
     */
    public String getCertificacion() {
        return certificacion;
    }

    /**
     * Metodo que simula el proceso de ensamblaje de la fuente de poder.
     */
    public void ensamblarFA() {
    }
}


