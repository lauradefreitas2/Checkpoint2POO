public class ExisteMedicamentoException extends Exception{

    public ExisteMedicamentoException() {
    }

    public ExisteMedicamentoException(String message) {
        super(message);
    }

    @Override
    public String toString() {
        return "-----" + this.getClass().getName() + ": " + this.getMessage() + "-----";
    }
}
