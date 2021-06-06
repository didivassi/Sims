package academy.mindswap.sims.house;

public enum RoomType {
    LIVING_ROOM(10),
    BATHROOM(15),
    BEDROOM(10),
    KITCHEN(20),
    LIBRARY(5),
    OFFICE(6),
    GYM(4),
    SWIMMING_POOL(3),
    CINEMA(4);

    private int houseCleanlinessDecrease;
    RoomType(int houseCleanlinessDecrease){
        this.houseCleanlinessDecrease =houseCleanlinessDecrease;
    }

    public int getHouseCleanlinessDecrease() {
        return houseCleanlinessDecrease;
    }
}
