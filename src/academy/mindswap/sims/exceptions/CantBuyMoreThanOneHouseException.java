package academy.mindswap.sims.exceptions;

import academy.mindswap.sims.utils.Messages;

public class CantBuyMoreThanOneHouseException extends SimsExceptions{

    public CantBuyMoreThanOneHouseException(){
        super(Messages.CANT_BUY_MORE_THAN_ONE_HOUSE);

    }
}
