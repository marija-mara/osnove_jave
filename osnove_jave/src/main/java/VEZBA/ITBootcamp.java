package VEZBA;


import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ITBootcamp {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String[] rezultatiPretrage = new String[]{
                "ITBootcamp - Besplatna IT prekvalifikacija - Free IT Bootcamp ...",
                "Prijava - Beograd - ITBootcamp",
                "IT Bootcamp kursevi",
                "IT Bootcamp - Education - Belgrade, Serbia - 1 Review - 342 ...",
                "IT Bootcamp - Образовање - Belgrade, Serbia - 1 утисак ...",
                "IT Bootcamp | LinkedIn",
                "Otvorene prijave za IT Bootcamp, program obuke ... - Startit",
                "Specijalizovani sistem za ŠKOLE SRBIJE - IT Bootcamp ...",
                "Vesti - Početak rada neprofitne IT škole - IT Bootcamp",
                "Otvorene prijave za IT Bootcamp u Nišu : Ekonomija : Južne ...",
                "Vesti - IT Bootcamp: traži se predavač Jave u Beogradu",
                "I spent 3 months applying to jobs after a coding bootcamp ...",
                "Are Coding Bootcamps Worth It? | Course Report",
                "Free Coding Bootcamps: The Best No-Cost Coding Programs",
                "Coding Dojo: Coding Bootcamp - Learn Coding &amp; Data Science",
                "Free Coding Bootcamp Prep Course | Flatiron School",
                "Coding Bootcamp Kyoto | Le Wagon",
                "Bootcamps won't make you a coder: Here's what will ...",
                "2020 Best Coding Bootcamps - SwitchUp.org",
                "Software Engineering Coding Bootcamp | Hack Reactor",
                "Coding Bootcamp | USF Corporate Training and Professional ...",
                "Is a Coding Bootcamp right for me? | Ubiqum Code Academy",
                "Istanbul Coding Bootcamp - Summer 2020 — Re:Coded",
                "What Are IT Boot Camps? Webopedia Definition",
                "Coding bootcamp - Wikipedia",
                "IT Bootcamp #2 online edition – Data Analytics in the Cloud",
                "Coding Bootcamp Market Current Trends, Segmentation, Key ...",
                "Learn Coding Bootcamps with Online Courses and Lessons ...",
                "What is a coding bootcamp? — Firehose Project",
                "Coding Bootcamp Programs Overview| ComputerScience.org",
                "Program Details | Tech Elevator Coding Bootcamp",
                "IT Bootcamp škola nastavlja online nastavu - Resurs Centar",
                "Houston's #1 Rated Coding Bootcamp - DigitalCrafts",
                "Toronto Coding Bootcamp: Advanced Front End Web ...",
                "The 15 best coding schools and coding bootcamps in Europe ...",
                "How Much Can You Make After Coding Bootcamp? Eleven ...",
                "Is a Coding Bootcamp Worth It? Find out. - Analytics, Product ...",
                "7 Phases of Changing Careers through a Coding Bootcamp ..."
        };
        List<String> tekst = Arrays.asList(rezultatiPretrage);

        System.out.print("Unesite stranu :");
        int brstrane = s.nextInt();
        System.out.print("Unesi broj rezultata po stani: ");
        int brojRez = s.nextInt();

        int start = brojRez * (brstrane - 1);
        for (int i = start; i < start + brojRez; i++) {
            System.out.println(tekst.get(i));
        }


    }
}