package alberobin;

public class NodoAlb<T> {

    NodoAlb destra, sinistra, precedente;
    T valore;

    NodoAlb(T valore) {
        this.valore = valore;
    }

    public void setDestro(NodoAlb destra) {
        this.destra = destra;
    }

    public void setSinistro(NodoAlb sinistra) {
        this.sinistra = sinistra;
    }

    public NodoAlb getDestro() {
        return destra;
    }

    public NodoAlb getSinistro() {
        return sinistra;
    }

    public T getValore() {
        return valore;
    }

    public void setValore(T valore) {
        this.valore = valore;
    }
}
