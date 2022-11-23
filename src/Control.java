import java.util.Scanner;

public class Control {

    Scanner keyboard = new Scanner(System.in);
    int logicPlayer1 = 0;
    int logicPlayer2 = 0;
    Game Player1Model;
    Game Player2Model;
    String player1 = "Player1";
    String player2 = "Player2";

    public Control(){

    }



    public void Player1Control(){
        System.out.print("Player1, Lutfen 1 ve 3 arasinda oyununuz icin deger giriniz. 1 ve 3 dahildir:  ");

        int getvalue = keyboard.nextInt();

        if (getvalue >= 1 && getvalue <= 3){
            Player1Model = new Game(getvalue, player1);
        }else{
            System.out.println("Araligin disinda bir deger girdiniz...");
            Player1Control();
        }
    }

    public void Player2Control(){
        System.out.print("Player2, Lutfen 1 ve 3 arasinda oyununuz icin deger giriniz. 1 ve 3 dahildir:  ");
        int getvalue2 = keyboard.nextInt();
        if (getvalue2 >= 1 && getvalue2 <= 3){
            Player2Model = new Game();
            Player2Model.setPlayer(player1);
            Player2Model.setValue(getvalue2);
        }else{
            System.out.println("Araligin disinda bir deger girdiniz...");
            Player2Control();
        }
    }

    public void compare(){
        if (Player1Model.getValue() == Player2Model.getValue()){
            System.out.println("Berabere bitti.");
        }else{
            switch (Player1Model.getValue()){
                //1-tas, 2-makas, 3-kagit

                case 1:
                    if (Player2Model.getValue() == 2){
                    System.out.println("Tebrikler ! Player1 kazandi...");
                }else{
                    System.out.println("Tebrikler! Player2 kazandi...");
                }
                    break;
                case 2:
                    if (Player2Model.getValue() == 1){
                    System.out.println("Tebrikler! Player2 kazandi...");
                }else{
                    System.out.println("Tebrikler! Player1 kazandi...");
                }
                    break;
                case 3:
                    if  (Player2Model.getValue() == 1){
                    System.out.println("Tebrikler! Player1 kazandi...");
                }else{
                    System.out.println("Tebrikler! Player2 kazandi...");
                }
                    break;
                default:
                    System.out.println("Tebrikler! Meryem her zaman kazanir...");
            }
        }
    }

    public void start(){
        Player1Control();
        Player2Control();
        compare();
    }
}
