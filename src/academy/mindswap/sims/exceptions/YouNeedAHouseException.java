package academy.mindswap.sims.exceptions;

import academy.mindswap.sims.utils.Messages;

public class YouNeedAHouseException extends SimsExceptions{
    public YouNeedAHouseException() {
        super(Messages.YOU_NEED_A_HOUSE);
    }
}
