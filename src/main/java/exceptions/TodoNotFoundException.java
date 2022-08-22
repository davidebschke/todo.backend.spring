package exceptions;

public class TodoNotFoundException extends RuntimeException {

    public TodoNotFoundException(){

        super("No data found",null,false,false);

    }
}
