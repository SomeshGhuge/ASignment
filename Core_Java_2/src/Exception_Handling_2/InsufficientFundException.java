 package Exception_Handling_2;

public class InsufficientFundException extends RuntimeException {
      private String message;
      public InsufficientFundException(String message) {
    	  // this.message = message;
    	  super(message);
      }
}
