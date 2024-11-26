public class Localizacao {
    private boolean isLocal;
    private boolean isInternacional;
    private boolean isMetropolitana;

    public Localizacao(boolean isLocal, boolean isInternacional, boolean isMetropolitana) {
        this.isLocal = isLocal;
        this.isInternacional = isInternacional;
        this.isMetropolitana = isMetropolitana;
    }

    public boolean isLocal() {
        return isLocal;
    }

    public boolean isInternacional() {
        return isInternacional;
    }

    public boolean isMetropolitana() {
        return isMetropolitana;
    }
}