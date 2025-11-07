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
        
        int tier;
        if (rakingPoints <= 1000) tier = 1;
        else if (rakingPoints <= 2000) tier = 2;
        else if (rakingPoints <= 5000) tier = 3;
        else if (rakingPoints <= 6000) tier = 4;
        else if (rakingPoints <= 7000) tier = 5;
        else if (rakingPoints <= 8000) tier = 6;
        else if (rakingPoints <= 9000) tier = 7;
        else if (rakingPoints <= 10000) tier = 8;
        else if (rakingPoints > 10000) tier = 9;
        else tier = 0;

        switch (tier) {
            case 1:
                rank = "Iron";
                break;
            case 2:
                rank = "Bronze";
                break;
            case 3:
                rank = "Silver";
                break;
            case 4:
                rank = "Gold";
                break;
            case 5:
                rank = "Platinum";
                break;
            case 6:
                rank = "Diamond";
                break;
            case 7:
                rank = "Ascendant";
                break;
            case 8:
                rank = "Immortal";
                break;
            case 9:
                rank = "Radiant";
                break;
            default:
                rank = "Invalid";
        }
        System.out.println(rank);
        System.out.println(valorantNick + ", your rank is:" + rank);
        
        header.close();
    }
}