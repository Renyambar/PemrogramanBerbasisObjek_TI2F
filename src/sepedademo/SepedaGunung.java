package sepedademo;

public class SepedaGunung extends Sepeda {
    private String tipeSuspensi;

    public void setTipeSuspensi(String newValue){
        tipeSuspensi = newValue;
    }

    public void CetakStatus(){
        super.cetakStatus();
        System.out.println("Tipe Suspensi: " + tipeSuspensi);
    }
}
