public class MitsubishiAuto extends AbstractAuto {
    static private String merk = "Mitsubishi";
    private String model;
    private int bouwjaar;
    private Motor motor;
    private String kleur;
    private String nummerplaat;
    private int aantalWielen;

    public MitsubishiAuto(String model, int bouwjaar, Motor motor, String kleur, String nummerplaat) {
        this.model = model;
        this.bouwjaar = bouwjaar;
        this.motor = motor;
        this.kleur = kleur;
        this.nummerplaat = nummerplaat;
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
