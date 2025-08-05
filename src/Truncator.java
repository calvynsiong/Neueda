public class Truncator {

    public String truncate(String input) throws EmptyStringException {
        if(input == null) {
            throw new NullPointerException("Get with the program, moron.  The Input cannot be null");
        }

        if(input.isEmpty()) {
            throw new EmptyStringException("Get with the program, moron.  The Input cannot be empty");
        }

        String truncatedInput;
        if (input.length() <= 1) {
            truncatedInput = input;
        } else {
            truncatedInput = input.substring(2);
        }
        return truncatedInput;
    }
}