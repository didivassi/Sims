package academy.mindswap.sims;

import academy.mindswap.sims.exceptions.YouCantDoActionOnRoomException;
import academy.mindswap.sims.exceptions.YouNeedARoomException;
import academy.mindswap.sims.house.RoomType;

import java.util.ArrayList;
import java.util.Arrays;

public enum SimsRoomsActions {
    SLEEP("Sleeping", -50,
            new ArrayList<RoomType>(Arrays.asList(RoomType.LIVING_ROOM,RoomType.LIBRARY,RoomType.BEDROOM,RoomType.OFFICE,RoomType.CINEMA))
    ),
    EAT("Eating",-3,
            new ArrayList<RoomType>(Arrays.asList(RoomType.LIVING_ROOM,RoomType.KITCHEN,RoomType.OFFICE,RoomType.CINEMA))
    ),
    WATCH_TV("Watching TV",5,
            new ArrayList<RoomType>(Arrays.asList(RoomType.LIVING_ROOM,RoomType.BEDROOM))
    ),
    WATCH_MOVIE("Watching a movie",10,
            new ArrayList<RoomType>(Arrays.asList(RoomType.LIVING_ROOM,RoomType.BEDROOM,RoomType.CINEMA))
    ),
    WORK("Working to earn money",40,
            new ArrayList<RoomType>(Arrays.asList(RoomType.LIVING_ROOM,RoomType.OFFICE,RoomType.LIBRARY))
    ),
    SWIM("Swimming",10,
            new ArrayList<RoomType>(Arrays.asList(RoomType.SWIMMING_POOL))
    ),
    USE_BATHROOM("Using the bathroom",4,
            new ArrayList<RoomType>(Arrays.asList(RoomType.BATHROOM))
    ),
    WORKOUT("Working out",50,
            new ArrayList<RoomType>(Arrays.asList(RoomType.GYM,RoomType.SWIMMING_POOL))
    );

    private ArrayList<RoomType> allowedRoomTypes;
    private String description;
    private int energyChange;
    SimsRoomsActions(String description, int energyChange, ArrayList<RoomType> allowedRoomTypes){
        this.allowedRoomTypes=allowedRoomTypes;
        this.description=description;
        this.energyChange=energyChange;
    }

    public ArrayList<RoomType> getAllowedRoomTypes() {
        return allowedRoomTypes;
    }

    public void canDoAction(RoomType roomType) throws YouCantDoActionOnRoomException {
        if(!allowedRoomTypes.contains(roomType)){
            throw new YouCantDoActionOnRoomException();
        }
    }

    @Override
    public String toString() {
        return description;
    }

    public int getEnergyConsumption() {
        return energyChange;
    }

}
