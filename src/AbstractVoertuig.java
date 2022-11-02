public interface AbstractVoertuig {
    public abstract String getdetails();

    public abstract String getMerk();

    public abstract String getModel();

    public abstract int getBouwjaar();

    public abstract Engine getMotor();

    public abstract void setMotor(Engine engine);

    public abstract String getKleur();

    public abstract void setKleur(String kleur);

    public abstract String getNummerplaat();

    public abstract void setNummerplaat(String nummerplaat);

    public abstract int getAantalWielen();

    public abstract void setAantalWielen(int aantalWielen);

    public abstract String getUitvoering();

    public abstract double getPrijs();

    public abstract void setPrijs(double prijs);

}
