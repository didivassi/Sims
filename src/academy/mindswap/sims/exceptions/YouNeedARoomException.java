package academy.mindswap.sims.exceptions;

import academy.mindswap.sims.utils.Messages;

public class YouNeedARoomException extends SimsExceptions{
    public YouNeedARoomException(){
        super(Messages.YOU_NEED_A_ROOM);
    }
}
