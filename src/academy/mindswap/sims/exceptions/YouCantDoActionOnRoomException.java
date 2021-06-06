package academy.mindswap.sims.exceptions;

import academy.mindswap.sims.utils.Messages;

public class YouCantDoActionOnRoomException extends SimsExceptions{

    public YouCantDoActionOnRoomException() {
        super(Messages.YOU_CANT_DO_ACTION_ON_ROOM);
    }
}
