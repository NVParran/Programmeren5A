public class App {
    public static void main(String[] args) {
        MitsubishiLanEvo3 car = new MitsubishiLanEvo3("Mitsubishi",1990, new Motor("Epicmotor"),"Rood", "IeatS");
        System.out.println(car.getdetails());
    }
}
