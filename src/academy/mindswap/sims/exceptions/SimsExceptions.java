package academy.mindswap.sims.exceptions;

public abstract class SimsExceptions extends Exception{

    private String message;
    public SimsExceptions(String message){
        this.message=message;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
