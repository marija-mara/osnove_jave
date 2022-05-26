package d23_05_2022;

public class Knjiga {
    private int ISBN;
    private String naziv;
    private int godinaIzdavanja;
    private Autor autor;

    public Knjiga() {
    }

    public Knjiga(int ISBN, String naziv, int godinaIzdavanja, Autor autor) {
        this.ISBN = ISBN;
        this.naziv = naziv;
        this.godinaIzdavanja = godinaIzdavanja;
        this.autor = autor;
    }

    public int getISBN() {
        return ISBN;
    }


    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public int getGodinaIzdavanja() {
        return godinaIzdavanja;
    }

    public void setGodinaIzdavanja(int godinaIzdavanja) {
        this.godinaIzdavanja = godinaIzdavanja;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public void stampaj(){
        System.out.println("ISBN: " + getISBN());
        System.out.println("(" + naziv + ")-(" + godinaIzdavanja + ")" );
        System.out.println("autor: " + autor.getIme() + " " +  autor.getPrezime());
    }
}
