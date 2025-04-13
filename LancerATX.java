public class LancerATX implements Gabinetes{


    private String tipoGabinete;

    
    @Override
    public void ensamblarSSD(){
        tipoSSD = "Lancer ATX";
    }

    @Override
    public void getTipo(){
        System.out.pritnln(tipoGabinete);
    }

}