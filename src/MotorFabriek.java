public class MotorFabriek extends AbstactVoertuigFabriek{
    static private String uitvoering = "PersoonsMotor";


    @Override
    AbstractVoertuig getVoertuig(Voertuigtype voertuigtype, String model, int bouwjaar, Engine engine, String kleur, String nummerplaat) {
        switch (voertuigtype){
            case Nissan:
                return new NissanMotor(model,bouwjaar, engine,kleur,nummerplaat,2,uitvoering);
            case BMW:
                return new BMWMotor(model,bouwjaar, engine,kleur,nummerplaat,2,uitvoering);
        }
        return null;
    }

    AbstractVoertuig getVoertuig(Voertuigtype voertuigtype, String model, int bouwjaar, Engine engine, String kleur, String nummerplaat, int aantalWielen) {
        switch (voertuigtype){
            case Nissan:
                return new NissanMotor(model,bouwjaar, engine,kleur,nummerplaat,aantalWielen,uitvoering);
            case BMW:
                return new BMWMotor(model,bouwjaar, engine,kleur,nummerplaat,aantalWielen,uitvoering);
        }
        return null;
    }
}
