package alberobin;

public class AlberoBin<T> {

    private NodoAlb inizio;
    private int size;
    NodoAlb questo;
    NodoAlb nuovo;

    AlberoBin(T valore) {
        nuovo = new NodoAlb(valore);

        if (this.size == 0) {
            inizio = new NodoAlb(valore);
            questo = new NodoAlb(valore);
            questo.setSinistro(null);
            questo.setDestro(null);
        }
    }

    public void addDestro(T valore) {
        this.nuovo = new NodoAlb(valore);
        this.questo = questo.setDestro(nuovo);
      

    public void addSinistro(T valore) {
        this.nuovo = new NodoAlb(valore);
        this.questo = questo.setSinistro(nuovo);
    }
}
}
