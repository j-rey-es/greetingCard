
import javax.swing.*;
public class main {
    public static void main (String [] args){
        cardOrganizer box = new cardOrganizer();

        //adding cards
        box.addCard("Joel","James","Sorry for scratching your car","Apology");
        box.addCard("James","Joel","Happy Valentine's Day","Valentine's Day");
        box.addCard("Joel","Mom","Happy Mother's Day","Mother's Day");
        box.addCard("James","Kevin","Get Well Soon!","illness");
        box.addCard("Joel","Nick","Best Roommate ever!","Birthday");
        box.addCard("Andre","Marcus","I miss you","being away");
        box.addCard("Joel","Robi","Happy Birthday!","Birthday");
        box.addCard("Robi","Mark","Hello","being away");
        box.addCard("Nick","Albert","Nice to meet you!","Just Because");
        box.addCard("James","Powin","Thank you","Birthday");
        box.addCard("Joel","Doogie","Sorry you lost your phone","Apology");
        box.addCard("James","Oscar","Nice to meet you!","Just Because");
        box.addCard("Joel","Hieu","Happy Birthday!","Birthday");
        box.addCard("Hieu","Tommy","Get Well Soon!","illness");;
        box.addCard("Ken","Will","Happy Father's Day","Father's Day");
        box.addCard("Joel","Ken","Merry Christmas!","Christmas");
        box.addCard("Gill","Jong","Thank you","Birthday");
        box.addCard("John","Gilbert","Hello!","Thank you");
        box.addCard("Bobby","Elaine","Merry Xmas!","Christmas");

        //demonstrating addCard return value
        boolean cardAdded = box.addCard("Joel","Jonny","Happy Birthday!","Birthday");
        System.out.println("Card added is: " + cardAdded);
        cardAdded = box.addCard("Joel","Jerome","Happy Belated Birthday!","Birthday");
        System.out.println("Card added is: " +  cardAdded);

        //finding cards with Occasion: Chirstmas
        box.displayCards("Christmas");

        //Finding cards addressed to Joel
        String find = box.findRecipient("Joel");
        System.out.println(find);

    }
}
