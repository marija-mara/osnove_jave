package d18_05_2022;

//Napisati klasu Proizvod koja ima atribute
//naziv proizvoda (String)
//cenu proizvoda (double)
//težinu proizvoda u gramima. (double)	i metode:
//stampaj - stampa podatke proizvoda u formatu {{naziv}}, {{cena}}, {{tezina}}
//U glavnom programu kreirati minimum 2 proizvoda i za
// svaki od njih pozvati metodu za stampu.
public class Proizvod {
    public String naziv;
    public double cena;
    public double tezina;
    public int year;
    public String email;
    public String pasvord;

    public void stampaj() {
        System.out.print("{" + this.naziv + "}," + "{" + this.cena + "}," + "{" + this.tezina + "}");
        System.out.println();
    }

    public int age(int trenutnaGodina) {
        return trenutnaGodina - this.year;
    }

    public boolean daLiJepunoletan(int currentYear) {
        int age = currentYear - this.year;
        if (age >= 18) {
            return true;
        } else {
            return false;
        }
    }

    public boolean login(String emailSalogina, String pasvorSaLogina) {
        if (email.equals(emailSalogina) && pasvord.equals(pasvorSaLogina))
        {
            return true;
        }
        else {
            return false;
        }
    }

}
