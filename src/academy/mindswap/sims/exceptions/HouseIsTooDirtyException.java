package academy.mindswap.sims.exceptions;

import academy.mindswap.sims.utils.Messages;

import javax.xml.ws.Holder;

public class HouseIsTooDirtyException extends SimsExceptions{

    public HouseIsTooDirtyException(){
        super(Messages.HOUSE_IS_TOO_DIRTY);
    }
}
