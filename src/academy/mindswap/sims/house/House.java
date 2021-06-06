package academy.mindswap.sims.house;

import academy.mindswap.sims.exceptions.HouseIsTooDirtyException;
import academy.mindswap.sims.exceptions.RoomDoesNotExistsException;

import java.util.ArrayList;
import java.util.Iterator;

public class House implements Iterable<Room>{
    private final int MAX_DIRTINESS_LEVEL=60;
    private final ArrayList<Room> rooms=new ArrayList<>();
    private int dirtinessLevel;


    public House(){
        dirtinessLevel=0;
    }

    public void addDivision(RoomType roomType){
        rooms.add(new Room(roomType));
    }

    public Room getRoom(int index) throws RoomDoesNotExistsException {
        if(index> rooms.size()){
            throw new RoomDoesNotExistsException();
        }

        return rooms.get(index);
    }

    public void useRoom(int dirtinessLevelToAdd) throws HouseIsTooDirtyException{
        if (dirtinessLevel + dirtinessLevelToAdd>=MAX_DIRTINESS_LEVEL){
            throw new HouseIsTooDirtyException();
        }
        dirtinessLevel += dirtinessLevelToAdd;
    }

    void cleanHouse(){
        dirtinessLevel=0;
    }


    public int getDirtinessLevel() {
        return dirtinessLevel;
    }

    public void listRooms(){
        for (Room room:rooms) {
            System.out.println(room);
        }
    }

    @Override
    public Iterator<Room> iterator() {
        return new Iterator<Room>() {
            int index;
            @Override
            public boolean hasNext() {
                return index<rooms.size();
            }

            @Override
            public Room next() {
                index++;
                return rooms.get(index);
            }
        };
    }
}
