import java.util.Scanner;

class CashAPP {
    public static void main(String[] args) {
        CashCard[] cards = {
                new CashCard("A001",500,0),
                new CashCard("A002",300,0),
                new CashCard("A003",1000,1),
                //new CashCard("A004",2000,2),
                //new CashCard("A005",3000,3),
        };

        Scanner input = new Scanner(System.in);

        for(CashCard card : cards) {
            System.out.printf("為(%s, %d, %d)儲值:",
                    card.getnumber(), card.getbalance(), card.getbonus());
            card.store(input.nextInt());
            System.out.printf("明細(%s, %d, %d)%n",
                    card.getnumber(), card.getbalance(), card.getbonus());
        }
    }
}
