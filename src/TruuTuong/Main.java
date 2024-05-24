package TruuTuong;

public class Main {
    public static void main(String[] args) {
        DongVat dongVat = new Meo();
        dongVat.ngu();
        dongVat.noi();
        DongVatCaSi dongVat1 = new HoaSi();
        dongVat1.hat();

        HoaSi hoaSi = new HoaSi();
        hoaSi.hat();
        hoaSi.noi();
        hoaSi.ngu();
    }
}
