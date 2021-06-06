package academy.mindswap.sims.exceptions;

import academy.mindswap.sims.utils.Messages;

public class MaidNotEnoughPaymentException extends SimsExceptions{
    public MaidNotEnoughPaymentException(double receivedPayment, double neededPayment){
        super(String.format(Messages.MAID_NEEDS_PAYMENT_FIRST,receivedPayment,neededPayment));

    }

}
