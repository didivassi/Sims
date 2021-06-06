package academy.mindswap.sims.house;

public class Room {

    private RoomType  roomType;
    public Room(RoomType roomType){
        this.roomType=roomType;
    }

    public RoomType getRoomType() {
        return roomType;
    }
    public int getRoomCleanlinessDecrease(){
        return roomType.getHouseCleanlinessDecrease();
    }

    @Override
    public String toString(){
        return roomType.toString();
    }
}
