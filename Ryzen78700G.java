/**
 * Representa un procesador Ryzen78700G.
 */
public class Ryzen78700G implements ProcesadorAMD{
    /**
     * Marca del procesador.
     */
    public String marca;

    /**
     * Modelo especifico del procesador.
     */
    public String modelo;

    /**
     * Numero de nucleos del procesador.
     */
    public int nucleos;

    /**
     * Numero de hilos del procesador.
     */
    public int hilos;

    /**
     * Frecuencia de operacion en GHz.
     */
    public double frecuencia;

    /**
     * Precio del procesador en la moneda local.
     */
    public double precio;

    /**
     * Descripcion adicional del procesador.
     */
    public String descripcion;

    /**
     * Obtiene la marca del procesador.
     *
     * @return la marca del procesador
     */
    public String getMarca() {
        return marca;
    }

    /**
     * Obtiene el modelo del procesador.
     *
     * @return el modelo especifico
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * Obtiene el numero de nucleos.
     *
     * @return la cantidad de nucleos
     */
    public int getNucleos() {
        return nucleos;
    }

    /**
     * Obtiene el numero de hilos.
     *
     * @return la cantidad de hilos
     */
    public int getHilos() {
        return hilos;
    }

    /**
     * Obtiene la frecuencia de operacion.
     *
     * @return la frecuencia en GHz
     */
    public double getFrecuencia() {
        return frecuencia;
    }

    /**
     * Obtiene el precio del procesador.
     *
     * @return el precio
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * Obtiene la descripcion del procesador.
     *
     * @return la descripcion adicional
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * Realiza el ensamblaje del procesador
     */
    public void getTipo() {
    }
}
