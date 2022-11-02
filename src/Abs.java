public class Abs extends Decorator{
    public Abs(AbstractVoertuig abstractVoertuig) {
        super(abstractVoertuig);
    }

    @Override
    public String getdetails() {
        return super.getdetails() +
                "heeft A.B.S" + "\n";

    }
}
