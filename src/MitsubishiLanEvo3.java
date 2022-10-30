public class MitsubishiLanEvo3 extends AbstractAuto {
    public String merk;
    public int bouwjaar;
    public Motor motor;
    public String kleur;
    public String nummerplaat;

    public MitsubishiLanEvo3(String merk, int bouwjaar, Motor motor, String kleur, String nummerplaat) {
        this.merk = merk;
        this.bouwjaar = bouwjaar;
        this.motor = motor;
        this.kleur = kleur;
        this.nummerplaat = nummerplaat;
    }

    @Override
    public String getdetails() {
        return "Merk: " + merk + "\n" +
               "Bouwjaar: " + bouwjaar + "\n" +
               "Motor: " + motor.getNaam() + "\n" +
               "Kleur: " + kleur + "\n" +
               "Nummerplaat: " + nummerplaat + "\n";
    }
}
