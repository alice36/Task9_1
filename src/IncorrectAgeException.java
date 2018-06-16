public class IncorrectAgeException extends RuntimeException {
    public IncorrectAgeException() {
        super("Wiek musi być większy od 1!");
    }
}
