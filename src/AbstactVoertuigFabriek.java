public abstract class AbstactVoertuigFabriek {
    abstract AbstractVoertuig getVoertuig(Voertuigtype voertuigtype, String model, int bouwjaar, Engine engine, String kleur, String nummerplaat, double prijs);
    abstract AbstractVoertuig getVoertuig(Voertuigtype voertuigtype, String model, int bouwjaar, Engine engine, String kleur, String nummerplaat,double prijs, int aantalWielen);
}
