package academy.mindswap;

import academy.mindswap.sims.Sims;
import academy.mindswap.sims.SimsRoomsActions;
import academy.mindswap.sims.exceptions.SimsExceptions;
import academy.mindswap.sims.house.Maid;
import academy.mindswap.sims.house.RoomType;
import academy.mindswap.sims.utils.Messages;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Sims joe= new Sims();
        try {
            joe.doAction(SimsRoomsActions.EAT);
        }catch (SimsExceptions e){
            System.out.println(e.getMessage());
        }

        try {
            joe.buyHouse();
            joe.buyHouse();
        }catch (SimsExceptions e){
            System.out.println(e.getMessage());
        }


        try {
            joe.addRooms(RoomType.LIVING_ROOM);
            joe.addRooms(RoomType.BEDROOM);
            joe.addRooms(RoomType.BATHROOM);
            joe.addRooms(RoomType.CINEMA);
            joe.addRooms(RoomType.OFFICE);
            joe.addRooms(RoomType.LIBRARY);
            joe.addRooms(RoomType.SWIMMING_POOL);
            joe.addRooms(RoomType.GYM);
            joe.addRooms(RoomType.KITCHEN);
           // joe.listRooms();
        }catch (SimsExceptions e){
            System.out.println(e.getMessage());
        }


        try {
            joe.doAction(SimsRoomsActions.EAT);
        }catch (SimsExceptions e){
            System.out.println(e.getMessage());
        }

        try {
            joe.moveToRoom(1);
            joe.doAction(SimsRoomsActions.EAT);

        }catch (SimsExceptions e){
            System.out.println(e.getMessage());
        }

        try {
            joe.moveToRoom(0);
            joe.doAction(SimsRoomsActions.WATCH_TV);
        }catch (SimsExceptions e){
            System.out.println(e.getMessage());
        }
        joe.printDirtLevel();
        joe.printEnergyLevel();

        try {
            joe.moveToRoom(8);
            joe.doAction(SimsRoomsActions.EAT);
            joe.doAction(SimsRoomsActions.EAT);
            joe.moveToRoom(2);
            joe.doAction(SimsRoomsActions.USE_BATHROOM);
            joe.moveToRoom(6);
            joe.doAction(SimsRoomsActions.SWIM);
        }catch (SimsExceptions e){
            System.out.println(e.getMessage());
        }

        try {
            joe.moveToRoom(2);
            joe.doAction(SimsRoomsActions.USE_BATHROOM);
            joe.moveToRoom(6);
            joe.doAction(SimsRoomsActions.SWIM);
        }catch (SimsExceptions e){
            System.out.println(e.getMessage());
        }



        try {
            joe.moveToRoom(0);
            joe.printDirtLevel();
            joe.doAction(SimsRoomsActions.WORK);
        }catch (SimsExceptions e){
            System.out.println(e.getMessage());
        }




        Maid maid=new Maid();

        try {
        joe.cleanHouse(maid,20);
        }catch (SimsExceptions e){
            System.out.println(e.getMessage());
        }

        try {
            joe.cleanHouse(maid,30);
        }catch (SimsExceptions e){
            System.out.println(e.getMessage());
        }
        joe.printDirtLevel();
        joe.printEnergyLevel();

        try {
            joe.doAction(SimsRoomsActions.WORK);
            joe.doAction(SimsRoomsActions.WORK);
            joe.doAction(SimsRoomsActions.WORK);
        }catch (SimsExceptions e){
            System.out.println(e.getMessage());
        }

        try {
            joe.doAction(SimsRoomsActions.SLEEP);
            joe.doAction(SimsRoomsActions.WATCH_TV);
        }catch (SimsExceptions e){
            System.out.println(e.getMessage());
        }
        joe.printDirtLevel();
        joe.printEnergyLevel();

    }
}
