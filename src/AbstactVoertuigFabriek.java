public abstract class AbstactVoertuigFabriek {
    abstract AbstractVoertuig getVoertuig(Voertuigtype voertuigtype, String model, int bouwjaar, Motor motor, String kleur, String nummerplaat);
    abstract AbstractVoertuig getVoertuig(Voertuigtype voertuigtype, String model, int bouwjaar, Motor motor, String kleur, String nummerplaat, int aantalWielen);
}
