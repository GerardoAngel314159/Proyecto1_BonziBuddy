public class SSD1TB implements MemoriaSSDKingstone{

    private String tipoSSD;

    

    @Override
    public void ensamblarSSD(){
        tipoSSD = "1 TB";
    }

    @Override
    public void getTipo(){
        System.out.pritnln(tipoSSD);
    }

}