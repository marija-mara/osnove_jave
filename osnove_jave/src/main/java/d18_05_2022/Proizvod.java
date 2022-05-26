package d18_05_2022;

//Napisati klasu Proizvod koja ima atribute
//  naziv proizvoda (String)
//  cenu proizvoda (double)
//  težinu proizvoda u gramima. (double)	i metode:
//  stampaj - stampa podatke proizvoda u formatu {{naziv}}, {{cena}}, {{tezina}}
//U glavnom programu kreirati minimum 2 proizvoda i za
// svaki od njih pozvati metodu za stampu..
public class Proizvod {
    public String naziv;
    public double cena;
    public double tezina;

    public void stampaj() {
        System.out.println("{" + this.naziv + "}," + "{" + this.cena + "}," + "{" + this.tezina + "}");
    }

    public void povecajCenu(double povecanje) {
        this.cena += povecanje;
    }

    public double vratiCenuSaPopustom(double popust) {
        return this.cena - this.cena * popust / 100;
    }

    public double racunajPostarinu() {
        int cenapostarine = 0;
        if (this.tezina <= 100) {
            return cenapostarine = 200;
        } else if (this.tezina >= 101 && this.tezina <= 500) {
            return cenapostarine = 400;
        } else if (this.tezina > 500) {
            return cenapostarine = 1000;
        }
        return -1;
    }
}
