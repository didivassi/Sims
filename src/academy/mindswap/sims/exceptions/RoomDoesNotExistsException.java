package academy.mindswap.sims.exceptions;

import academy.mindswap.sims.utils.Messages;

public class RoomDoesNotExistsException extends SimsExceptions{
    public RoomDoesNotExistsException(){
        super(Messages.ROOM_DOES_NOT_EXISTS);
    }

}
