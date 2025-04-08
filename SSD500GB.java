public class SSD500GB implements MemoriaSSDKingstone{

    private String tipoSSD;



    @Override
    public void ensamblarSSD(){
        tipoSSD = "500 GB";
    }

    @Override
    public void getTipo(){
        System.out.pritnln(tipoSSD);
    }

}