import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        String valorantNick = "TG | king";
        System.out.println("Your Valorant nick is " + valorantNick);
        Scanner header = new Scanner(System.in);
        int rakingPoints;
        System.out.println("Enter your ranking points: ");
        rakingPoints = header.nextInt();
        String rank = "";
        if(rakingPoints <= 1000) {
            rank = "Iron";
            System.out.println(rank);
        } else if(rakingPoints > 1000 && rakingPoints <= 2000) {
            rank = "Bronze";
            System.out.println(rank);
        } else if(rakingPoints > 2000 && rakingPoints <= 5000) {
            rank = "Silver";
            System.out.println(rank);
        } else if(rakingPoints > 5000 && rakingPoints <= 6000) {
            rank = "Gold";
            System.out.println(rank);
        } else if(rakingPoints > 6000 && rakingPoints <= 7000) {
            rank = "Platinum";
            System.out.println(rank);
        } else if(rakingPoints > 7000 && rakingPoints <= 8000) {
            rank = "Diamond";
            System.out.println(rank);
        } else if(rakingPoints > 8000 && rakingPoints <= 9000) {
            rank = "Ascendant";
            System.out.println(rank);
        } else if(rakingPoints > 9000 && rakingPoints <= 10000) {
            rank = "Immortal";
            System.out.println(rank);
        } else if(rakingPoints > 10000) {
            rank = "Radiant";
            System.out.println(rank);
        } else {
            rank = "Invalid";
            System.out.println(rank);
        }
        System.out.println(valorantNick + ", your rank is:" + rank);
        
        header.close();
    }
}