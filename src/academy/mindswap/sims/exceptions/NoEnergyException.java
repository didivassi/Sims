package academy.mindswap.sims.exceptions;

import academy.mindswap.sims.utils.Messages;

public class NoEnergyException extends SimsExceptions{
    public NoEnergyException(){
        super(Messages.YOU_HAVE_NO_ENERGY);
    }
}
