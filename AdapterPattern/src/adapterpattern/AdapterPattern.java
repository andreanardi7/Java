package adapterpattern;

interface IFormatPresaTedesca {

    public inserisciSpinaTedesca();

    public inviaCorrente();
}

interface IFormatPresaItaliana {

    public inserisciSpinaItaliana();

    public inviaCorrente();
}

// Adaptee
class LavatriceTedesca implements IFormatPresaTedesca {

    private boolean spinaInserita = false;
    private boolean correntePresente = false;

    public void inserisciSpinaTedesca() {
        spinaInserita = true;
        System.out.println("Spina Tedesca inserita");
    }


public void inviaCorrente(){
        if(spinaInserita==true){
            correntePresente = true;
            System.out.println("Corrente lavatrice Tedesca presente");
        }
        else{
             System.out.println("Corrente lavatrice Tedesca non presente");
        }
    }
  public void lava()
    {
        if(this.correntePresente==true)
        {
            System.out.println("Lavaggio iniziato");
            System.out.println("Lavaggio 25%");
            System.out.println("Lavaggio 50%");
            System.out.println("Lavaggio 75%");
            System.out.println("Lavaggio terminato");
        }
        else
        {
            System.out.println("Controllare presa");
        

}
    }
}

// Adapter
class AdattatorePresaTedesca implements IFormatPresaItaliana {

    private boolean presa;

    public void construct(IFormatPresaTedesca presa) {
        this.presa = presa;
    }

    public void inserisciSpinaItaliana() {
        System.out.println("Adattatore presa Tedesca inserito");
        this.presa.inserisciSpinaTedesca();
    }

    public void inviaCorrente() {
        this.presa.inviaCorrente();
    }

    public void lava() {
        this.presa.lava();
    }
}

class LavatriceItaliana implements IFormatPresaItaliana {

    private boolean correntePresente = false;
    private boolean spinaInserita = false;

    public void inserisciSpinaItaliana() {
        this.spinaInserita = true;
        System.out.println("Spina Italiana inserita");
    }

    public void inviaCorrente() {
        if (this.spinaInserita) {
            this.correntePresente = true;
            System.out.println("Corrente lavatrice Italiana presente");
        } else {
            System.out.println("Corrente lavatrice Italiana non presente");
        }
    }

    public void lava() {
        if (this.correntePresente) {
            System.out.println("Lavaggio iniziato");
            System.out.println("Lavaggio 25%");
            System.out.println("Lavaggio 50%");
            System.out.println("Lavaggio 75%");
            System.out.println("Lavaggio terminato");
        } else {
            System.out.println("Controllare presa");
        }
    }
}

// Client
class EseguiLavaggio {

    private boolean lavatrice;
    private boolean lavatriceConAdattatore;

    public void construct() {
        System.out.println("---Lavaggio con Lavatrice Tedesca iniziato---");
        this.lavatrice = new LavatriceTedesca();
        this.lavatriceConAdattatore = new AdattatorePresaTedesca(this.lavatrice);
        this.lavatriceConAdattatore.inserisciSpinaItaliana();
        this.lavatriceConAdattatore.inviaCorrente();
        this.lavatriceConAdattatore.lava();
        System.out.println("---Vestiti pronti---");
    }
}

class AdapterPattern {

    public static void main(String[] args) {
        boolean lavaggio = new EseguiLavaggio();
    }
}
