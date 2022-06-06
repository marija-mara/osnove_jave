public class main {
    public static void main(String[] args) {
        //dve discipline    jedna za trkace(Trkaci),   jedna za skakace(Skakaci)
        Disciplina skok = new Disciplina("Skok u dalj", "skakaci");
        Disciplina sprint = new Disciplina("110m s preponama", "trakaci");

        skok.dodajAtletica(new Skakac("Marko Markovic", 8.9));
        skok.dodajAtletica(new Skakac("Darko Darkovic", 7.2));
        skok.dodajAtletica(new Skakac("Zarko Zarkovic", 6.8));

        skok.diskvalifikuj("Marko Markovic");

        skok.stampajPobednika();


        sprint.dodajAtletica(new Trkac("Nikola Nikolic", 10.1));
        sprint.dodajAtletica(new Trkac("Usain Bolt", 9.1));
        sprint.dodajAtletica(new Trkac("Dragan Jankovic", 9.9));
        sprint.diskvalifikuj("Dragan Jankovic");
        sprint.stampajPobednika();
    }
}
