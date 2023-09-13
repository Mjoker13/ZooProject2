import Controller.ZooController;
import GameController.Controller;
import GameDomain.*;
import lombok.extern.java.Log;
import org.Domain.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


@Log
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("In che stanza vuoi andare ?");
        String input = scanner.nextLine();

        ZooController zooController= new ZooController();

        List<Class<? extends Animal>> tigers = new ArrayList<>();


        List<Item> items= new ArrayList<>();
        Item item1= new Item("Martello", "ahahahshsiejd",1);
        Item item2= new Item("Martello", "ahahahshsiejd",1);
        items.add(item2);
        items.add(item1);

        RoomNord nord = new RoomNord(items,tigers);
        RoomOvest ovest = new RoomOvest(items,tigers);
        RoomEst est = new RoomEst(items,tigers);
        RoomSud sud = new RoomSud(items,tigers);

        Player player1= new Player("ciccio",100,sud.getClass());

        Controller controller = new Controller();
        controller.changeRoom(player1,input);
        System.out.println(player1.getStartedPositionInToMap());
    }
}