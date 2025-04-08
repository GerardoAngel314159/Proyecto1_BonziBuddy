public class FabricaSSD extends AbstractFactory{

    @Override
    public Object getComponente(String tipoComponente){
        return getSSD(tipoComponente);
    }

    public SSD getSSD(String tipoSSD){
        if(tipoSSD==null){
            return null;
        }else if (tipoSSD.equals("SSD500GB")){

        }
    }
    /**
     * Falta terminar el metodo de arriba pero lo reservo por la duda
     */
} 