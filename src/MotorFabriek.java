public class MotorFabriek extends AbstactVoertuigFabriek{
    static private String uitvoering = "PersoonsMotor";


    @Override
    AbstractVoertuig getVoertuig(Voertuigtype voertuigtype, String model, int bouwjaar, Engine engine, String kleur, String nummerplaat, double prijs) {
        switch (voertuigtype){
            case Nissan:
                return new NissanMotor(model,bouwjaar, engine,kleur,nummerplaat,2,uitvoering, prijs);
            case BMW:
                return new BMWMotor(model,bouwjaar, engine,kleur,nummerplaat,2,uitvoering,prijs);
        }
        return null;
    }

    AbstractVoertuig getVoertuig(Voertuigtype voertuigtype, String model, int bouwjaar, Engine engine, String kleur, String nummerplaat, double prijs, int aantalWielen) {
        switch (voertuigtype){
            case Nissan:
                return new NissanMotor(model,bouwjaar, engine,kleur,nummerplaat,aantalWielen,uitvoering, prijs);
            case BMW:
                return new BMWMotor(model,bouwjaar, engine,kleur,nummerplaat,aantalWielen,uitvoering, prijs);
        }
        return null;
    }
}
