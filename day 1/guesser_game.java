import java.util.Scanner;
class Guesser{
 int guessernum;
 public int takeNumberGuesser(){
    System.out.println("guesseer guess a number : ");
    Scanner Scan = new Scanner (System.in);
    guessernum=Scan.nextInt();
    return guessernum;
 }
}

class player{
    int playernum;
 public int takeNumberplayer(){
    System.out.println("player guess a number : ");
    Scanner Scan = new Scanner (System.in);
    playernum=Scan.nextInt();
    return playernum;}
}

class umpire{
   int numfromguesser;
   int numfromplayer1;
   int numfromplayer2;
   int numfromplayer3;

   void collectfromguesser(){
    Guesser g=new Guesser();
    numfromguesser= g.takeNumberGuesser();
   }

   void collectfromplayer(){
    player p1=new player();
    numfromplayer1=p1.takeNumberplayer();

    player p2=new player();
    numfromplayer2=p2.takeNumberplayer();

    player p3=new player();
    numfromplayer3=p3.takeNumberplayer();
    
   }

   void compare(){
    if(numfromplayer1==numfromguesser){
       if(numfromplayer2==numfromguesser && numfromplayer3==numfromguesser){
        System.out.println("all players won the game");
       }

       else if(numfromplayer2==numfromguesser){
        System.out.println("only player 1 and player 2 won the game");

       }

       else if(numfromplayer3==numfromguesser){
        System.out.println("only player 1 and player 3 won the game");

       }
    }
    else if(numfromplayer2==numfromguesser){
        if(numfromplayer3==numfromguesser){
            System.out.println("only player 2 and 3 won the game");

        }
    }

    else if(numfromplayer3==numfromguesser){
            System.out.println("only player 3 won the game");
    }

    else{
        System.out.println("nobody won the game");
    }
   }
}

public class guesser_game {
    public static void main(String[] args){
       umpire u=new umpire();
       u.collectfromguesser();
       u.collectfromplayer();
       u.compare();
    }
}
