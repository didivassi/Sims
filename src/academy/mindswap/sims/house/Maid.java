package academy.mindswap.sims.house;

import academy.mindswap.sims.exceptions.MaidNotEnoughPaymentException;
import academy.mindswap.sims.exceptions.YouNeedAHouseException;
import academy.mindswap.sims.house.House;

public class Maid{

    private final double PAYMENT_FEE=0.5d;

    public void cleanHouse(House house, double payment) throws MaidNotEnoughPaymentException,YouNeedAHouseException {
        if(house==null){
            throw new YouNeedAHouseException();
        }
        double neededPayment= PAYMENT_FEE*house.getDirtinessLevel();
        if(payment<neededPayment){
            throw new MaidNotEnoughPaymentException(payment,neededPayment);
        }
        house.cleanHouse();
    }
}
