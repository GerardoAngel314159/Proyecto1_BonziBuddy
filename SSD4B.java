public class SSD4B implements MemoriaSSDKingstone{

    private String tipoSSD;

    

    @Override
    public void ensamblarSSD(){
        tipoSSD = "4 TB";
    }

    @Override
    public void getTipo(){
        System.out.pritnln(tipoSSD);
    }

}