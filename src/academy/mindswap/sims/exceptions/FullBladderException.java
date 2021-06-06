package academy.mindswap.sims.exceptions;

import academy.mindswap.sims.utils.Messages;

public class FullBladderException extends SimsExceptions{

    public FullBladderException(){
        super(Messages.YOU_HAVE_A_FULL_BLADDER);
    }
}
