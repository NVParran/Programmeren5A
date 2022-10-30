public class App {
    public static void main(String[] args) {
        Engine V8voorBWM = new Engine("V8", 1990, 8, 250, "Benzine", 99.99);
        AbstractVoertuig BWM = FabriekMaker.getFabriek(FabriekType.MOTORFABRIEK).getVoertuig(Voertuigtype.BMW, "yaris", 1990, V8voorBWM, "zilver", "XJ-79-65" ,499.95);
        System.out.println(BWM.getdetails());
        System.out.println(BWM.getMotor().getdetails());
    }
}
