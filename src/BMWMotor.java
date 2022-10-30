public class BMWMotor extends AbstractAuto {
    static private String merk = "Nissan";
    private String model;
    private int bouwjaar;
    private Motor motor;
    private String kleur;
    private String nummerplaat;
    private int aantalWielen;


    public BMWMotor(String model, int bouwjaar, Motor motor, String kleur, String nummerplaat, int aantalWielen) {
        this.model = model;
        this.bouwjaar = bouwjaar;
        this.motor = motor;
        this.kleur = kleur;
        this.nummerplaat = nummerplaat;
        this.aantalWielen = aantalWielen;
    }

    @Override
    public String getdetails() {
        return "Merk: " + merk + "\n" +
                "Model: " + model + "\n" +
                "Bouwjaar: " + bouwjaar + "\n" +
                "Motor: " + motor.getNaam() + "\n" +
                "Kleur: " + kleur + "\n" +
                "Nummerplaat: " + nummerplaat + "\n" +
                "AantalWielen: " + aantalWielen + "\n";
    }
}