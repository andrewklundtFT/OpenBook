public abstract class MathObject  {
    protected String description;

    public MathObject () {
        description = "";
    }

    public MathObject (String clientDescription) {
        description = clientDescription;
    }

    public abstract int getDimension ();
}
