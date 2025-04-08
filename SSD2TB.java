public class SSD2TB implements MemoriaSSDKingstone{

    private String tipoSSD;

    

    @Override
    public void ensamblarSSD(){
        tipoSSD = "2 TB";
    }

    @Override
    public void getTipo(){
        System.out.pritnln(tipoSSD);
    }

}