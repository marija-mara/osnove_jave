package TestJava2;

public class main {
    public static void main(String[] args) {

        InstagramLocationAddOn lokacija = new InstagramLocationAddOn(50, 15, 15,
                10, 10, "Trg");
        lokacija.stampaj();

        InstagramUser user1 = new InstagramUser("marita", "Marija Jankovic");
        InstagramUser user2 = new InstagramUser("neca", "Neca Necic");
        InstagramUser user3 = new InstagramUser("ana", "Ana Zivanovic");
        InstagramUser user4 = new InstagramUser("jas", "Jasna Stam");

        InstagramMentionAddOn tag1 = new InstagramMentionAddOn(44, 20, 25,
                90, 110, user1);
        InstagramMentionAddOn tag2 = new InstagramMentionAddOn(45, 25, 35,
                100, 100, user2);
        InstagramMentionAddOn tag3 = new InstagramMentionAddOn(46, 60, 45,
                80, 80, user3);

        InstagramStory story1 = new InstagramStory(user1, null, " https://www.instagram.com/p/CecrcPyrPMj/");
        InstagramStory story2 = new InstagramStory(user2, "http://google.com", " https://www.instagram.com/p/Ce");

        story1.dodajDodatak(lokacija);
        story1.dodajDodatak(tag1);
        story1.dodajDodatak(tag2);
        story1.dodajDodatak(tag3);
        story1.postaviStori();
        story1.pregledajStory(user2);
        story1.pregledajStory(user3);
        story1.pregledajStory(user4);
        story1.brisanje(44);
        story1.postaviStori();
        story1.stampajPreglede();

        story2.dodajDodatak(lokacija);
        story2.dodajDodatak(tag1);
        story2.dodajDodatak(tag2);
        story2.dodajDodatak(tag3);
        story2.postaviStori();

    }
}
