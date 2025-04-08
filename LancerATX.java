public class LancerATX implements GabinetesYeyian{


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