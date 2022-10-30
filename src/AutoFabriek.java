public class AutoFabriek extends AbstactVoertuigFabriek {
    static private String uitvoering = "Persoonsauto";

    @Override
    AbstractVoertuig getVoertuig(Voertuigtype voertuigtype, String model, int bouwjaar, Engine engine, String kleur,  String nummerplaat, double prijs) {
        switch (voertuigtype) {
            case Mitsubishi:
                return new MitsubishiAuto(model, bouwjaar, engine, kleur, nummerplaat, 4, uitvoering, prijs);
            case Toyota:
                return new ToyotaAuto(model, bouwjaar, engine, kleur, nummerplaat, 4, uitvoering , prijs);
        }
        return null;
    }

    AbstractVoertuig getVoertuig(Voertuigtype voertuigtype, String model, int bouwjaar, Engine engine, String kleur, String nummerplaat, double prijs, int aantalWielen) {
        switch (voertuigtype) {
            case Mitsubishi:
                return new MitsubishiAuto(model, bouwjaar, engine, kleur, nummerplaat, aantalWielen, uitvoering, prijs);
            case Toyota:
                return new ToyotaAuto(model, bouwjaar, engine, kleur, nummerplaat, aantalWielen, uitvoering, prijs);
        }
        return null;
    }
}
