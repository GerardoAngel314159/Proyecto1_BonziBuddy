public class H6FlowATX implements GabinetesNZXT{


    private String tipoGabinete;

    
    @Override
    public void ensamblarSSD(){
        tipoSSD = "H6 Flow ATX";
    }

    @Override
    public void getTipo(){
        System.out.pritnln(tipoGabinete);
    }

}