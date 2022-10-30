public class FabriekMaker {
    public static AbstactVoertuigFabriek getFabriek(FabriekType fabriekType){
        switch (fabriekType){
            case AUTOFABRIEK:
                return new AutoFabriek();
            case MOTORFABRIEK:
                return new MotorFabriek();
        }
        return null;
    }
}
