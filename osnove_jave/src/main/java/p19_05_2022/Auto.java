package p19_05_2022;

//Kreirati klasu Auto koja ima:
//ime i prezime vozaca
//marku automobila
//broj vrata
//potrosnju na 100km (npr: 10)
//trenutnu brzinu kojom se auto krece
//metodu za stampu koja stampa podatke u formatu:
//  [Vozac]
//	[Marka] - [br vrata]-ro vrata
//	Sa potrosnjom od [potrosnja] l na 100km
//	[Trenutna brzina auta] km/h je trenutna brzina.
//metoda koja vraca informaciju da li je vozac prekoracio brzinu.
// Kao parametar metode se prima ogranicenje (kao broj) a metoda vraca
// true ili false ako je trenutna brzina veca od ogranicenja.
//metoda koja vraca visinu novcane kazne za prekoracenje, za svaku jedinicu
// prekoracenja placa se 1000din. Metoda od parametara prima ogranicenje brzine
//U glavnom programu pozvati ove metode i odstmpajte neke poruke na osnovu
// informacija koje dobijete od njih.

public class Auto {
    public String imeIprezime;
    public String markaAuta;
    public int brVrata;
    public int potrosnaNa100km;
    public int trenutnaBrzina;
    public String brojRegistracije;
    public boolean klimaJeUkljucena;

    //F4 skociti u metodu iz mejna
    public void stampaj() {
        System.out.println(this.imeIprezime);
        System.out.println(this.markaAuta + "-" + this.brVrata + "-ro vrata ");
        System.out.println("sa potrosnjom od " + this.potrosnaNa100km + "l na 100km");
        System.out.println(this.trenutnaBrzina + "km/h je trenutna brzina");
        System.out.println();
    }

    public boolean prekoracio(int ogranicenje) {

        return this.trenutnaBrzina > ogranicenje;

//        if (this.trenutnaBrzina > ogranicenje) {
//            return true;
//        } else {
//            return false;
//        }
    }

    public int kazna(int ogranicenje) {

        if (this.prekoracio(ogranicenje)) {
            return (trenutnaBrzina - ogranicenje) * 1000;
        }
        return 0;

//        if (this.trenutnaBrzina > ogranicenje) {
//            iznos = (this.trenutnaBrzina - ogranicenje) * 1000;
//            return iznos;
//        } else {
//            return 0;
//        }
    }

    public void dodajGas() {
        this.trenutnaBrzina += 10;
    }

    public void koci() {
        this.trenutnaBrzina=trenutnaBrzina-10;
      if (trenutnaBrzina<10) {
            trenutnaBrzina=0;
        }
    }

    public double potrosnjaAuta() {
        if (klimaJeUkljucena) {
            return ((trenutnaBrzina / 100.0) * this.potrosnaNa100km) * 1.2;
        }
        return ((trenutnaBrzina / 100.0) * this.potrosnaNa100km) * 1.0;
    }
}

