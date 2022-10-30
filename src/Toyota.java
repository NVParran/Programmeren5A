public class Toyota extends AbstractAuto {
    public String merk = "Toyota";
    public String model;
    public int bouwjaar;
    public Motor motor;
    public String kleur;
    public String nummerplaat;

    public Toyota(String model, int bouwjaar, Motor motor, String kleur, String nummerplaat) {
        this.model = model;
        this.bouwjaar = bouwjaar;
        this.motor = motor;
        this.kleur = kleur;
        this.nummerplaat = nummerplaat;
    }

    @Override
    public String getdetails() {
        return "Merk : " + merk + "\n" +
                "Model : " + model + "\n" +
                "Bouwjaar : " + bouwjaar + "\n" +
                "Motor : " + motor.getNaam() + "\n" +
                "Kleur :" + kleur + "\n" +
                "Nummerplaat :" + nummerplaat + "\n";
    }
}
