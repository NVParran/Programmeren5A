public class AutoFabriek extends AbstactVoertuigFabriek{
    static private String uitvoering = "Persoonsauto";

    @Override
    AbstractVoertuig getVoertuig(Voertuigtype voertuigtype, String model, int bouwjaar, Motor motor, String kleur, String nummerplaat) {
        switch (voertuigtype){
            case Mitsubishi:
                return new MitsubishiAuto(model,bouwjaar,motor,kleur,nummerplaat,4,uitvoering);
            case Toyota:
                return new ToyotaAuto(model,bouwjaar,motor,kleur,nummerplaat,4,uitvoering);
        }
        return null;
    }

    AbstractVoertuig getVoertuig(Voertuigtype voertuigtype, String model, int bouwjaar, Motor motor, String kleur, String nummerplaat, int aantalWielen) {
        switch (voertuigtype){
            case Mitsubishi:
                return new MitsubishiAuto(model,bouwjaar,motor,kleur,nummerplaat,aantalWielen,uitvoering);
            case Toyota:
                return new ToyotaAuto(model,bouwjaar,motor,kleur,nummerplaat,aantalWielen,uitvoering);
        }
        return null;
    }
}
