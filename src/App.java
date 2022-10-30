public class App {
    public static void main(String[] args) {
        AbstractVoertuig toyota = FabriekMaker.getFabriek(FabriekType.AUTOFABRIEK).getVoertuig(Voertuigtype.Toyota, "yaris", 1990,new Motor("ultramotor",1990,4,150),"zilver","XJ-79-65");
        System.out.println(toyota.getdetails());
    }
}
