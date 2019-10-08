import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.println("I'm a ping-pong application!");
        System.out.println("Enter a number(s):");
        try {
            String stringUserNumber = input.nextLine();
            int intUserNumber = Integer.parseInt(stringUserNumber);
            PingPong pingPong = new PingPong();
            ArrayList<Object> pingPongResult = pingPong.runPingPong(intUserNumber);
            System.out.println(pingPongResult);
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
