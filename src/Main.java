import com.engeto.ja.Carrots;
import java.math.BigDecimal;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args)  {
        Carrots seller1 = new Carrots();

        seller1.setName("Franta");
        System.out.println("Jméno prodejce: "+seller1.getName());
        seller1.setBirth(LocalDate.of(2000,2,3));
        System.out.println("Datum narození: "+seller1.getBirth());
        seller1.setContractNo(666);
        System.out.println("Počet smluv: "+seller1.getContractNo());
        seller1.setCarrotsSold(BigDecimal.valueOf(66));
        System.out.println("Váha prodaných mrkví: "+seller1.getCarrotsSold()+" tun");
        seller1.setCityName("Pržno");
        System.out.println("Obec: "+seller1.getCityName());
        seller1.setCarConsumption(7.8);
        System.out.println("Spotřeba vozidla: "+seller1.getCarConsumption()+" litrů/100km");
        seller1.setIpAddress("456.546.1.1");
        System.out.println("IP adresa: "+seller1.getIpAddress());

    }
}



        



