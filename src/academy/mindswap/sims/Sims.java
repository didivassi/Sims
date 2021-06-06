package academy.mindswap.sims;

import academy.mindswap.sims.exceptions.*;
import academy.mindswap.sims.house.House;
import academy.mindswap.sims.house.Maid;
import academy.mindswap.sims.house.Room;
import academy.mindswap.sims.house.RoomType;
import academy.mindswap.sims.utils.Messages;

public class Sims {

    private House house;
    private Room actualRoom;
    private int energyLevel;
    private boolean needsToUseToilet;
    public Sims(){
        energyLevel=100;
        needsToUseToilet=false;
    }

    public void buyHouse() throws CantBuyMoreThanOneHouseException {
        if (house!=null){
            throw new CantBuyMoreThanOneHouseException();
        }
        house=new House();
        System.out.println(Messages.YOU_BOUGHT_A_HOUSE);
    }


    public void addRooms(RoomType room) throws YouNeedAHouseException{
        if(house==null){
            throw new YouNeedAHouseException();
        }
        house.addDivision(room);
        System.out.printf(Messages.YOU_ADDED_ROOM,room);
    }

    public void cleanHouse(Maid maid, double payment) throws MaidNotEnoughPaymentException{
        try {
            maid.cleanHouse(house,payment);
            System.out.println("Your House has been cleaned");
        }catch (SimsExceptions e){
            System.out.println(e.getMessage());
        }

    }

    public void listRooms() throws YouNeedAHouseException{
        if(house==null){
            throw new YouNeedAHouseException();
        }
        house.listRooms();
    }

    public void moveToRoom(int roomDivision){
        try {
            actualRoom= house.getRoom(roomDivision);
            System.out.printf(Messages.YOU_ARE_NOW_IN_ROOM,actualRoom);
        }catch (SimsExceptions e){
            System.out.println(e.getMessage());
        }

    }

    public void doAction(SimsRoomsActions action) throws  YouNeedAHouseException ,YouNeedARoomException, FullBladderException {
        if(house==null){
            throw new YouNeedAHouseException();
        }
        if(actualRoom==null){
            throw new YouNeedARoomException();
        }
        if(needsToUseToilet&& action!=SimsRoomsActions.USE_BATHROOM){
            throw new FullBladderException();
        }
        try {
            house.useRoom(actualRoom.getRoomCleanlinessDecrease());
            action.canDoAction(actualRoom.getRoomType());
            changeEnergyLevel(action.getEnergyConsumption());
            System.out.printf(Messages.YOU_DID_ACTION_ON_ROOM,action,actualRoom);
            switch (action){
                case EAT:
                    needsToUseToilet=true;
                    break;
                case USE_BATHROOM:
                    needsToUseToilet=false;
            }
        }catch (SimsExceptions e){
            System.out.printf(e.getMessage(),action,actualRoom);
        }

    }


    private void changeEnergyLevel(int energyLevelToRemove) throws NoEnergyException {
        if(energyLevel<energyLevelToRemove){
            throw new NoEnergyException();
        }
        energyLevel -= energyLevelToRemove;
        energyLevel= Math.min(energyLevel, 100);
    }


    public void printDirtLevel(){
        System.out.println("Your dirtiness level is "+house.getDirtinessLevel());
    }
    public void printEnergyLevel(){
        System.out.println("Your energy level is "+energyLevel);
    }

}
