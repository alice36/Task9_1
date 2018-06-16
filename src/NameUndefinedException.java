public class NameUndefinedException extends RuntimeException {
    public NameUndefinedException() {
        super("Imię lub nazwisko jest null");
    }
}
