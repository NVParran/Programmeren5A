public class Decorator implements AbstractVoertuig {

    private AbstractVoertuig abstractVoertuig;

    public Decorator(AbstractVoertuig abstractVoertuig){
        this.abstractVoertuig = abstractVoertuig;
    }

    @Override
    public String getdetails() {
        return null;
    }

    @Override
    public String getMerk() {
        return null;
    }

    @Override
    public String getModel() {
        return null;
    }

    @Override
    public int getBouwjaar() {
        return 0;
    }

    @Override
    public Engine getMotor() {
        return null;
    }

    @Override
    public void setMotor(Engine engine) {

    }

    @Override
    public String getKleur() {
        return null;
    }

    @Override
    public void setKleur(String kleur) {

    }

    @Override
    public String getNummerplaat() {
        return null;
    }

    @Override
    public void setNummerplaat(String nummerplaat) {

    }

    @Override
    public int getAantalWielen() {
        return 0;
    }

    @Override
    public void setAantalWielen(int aantalWielen) {

    }

    @Override
    public String getUitvoering() {
        return null;
    }

    @Override
    public double getPrijs() {
        return 0;
    }

    @Override
    public void setPrijs(double prijs) {

    }
}
