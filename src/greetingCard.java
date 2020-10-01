public class greetingCard {
    private String sender, recipient, message, occasion;
    public greetingCard(String sender, String recipient, String message, String occasion){
        this.sender = sender;
        this.recipient = recipient;
        this.message = message;
        this.occasion = occasion;
    }

    public String getSender(){
        return sender;
    }
    public String getRecipient(){
        return recipient;
    }
    public String getMessage(){
        return message;
    }
    public String getOccasion(){
        return occasion;
    }
    public String toString (){
        String outputString = sender + " is sending a card to " + recipient+" for "+ occasion + " and the card says "+ message;
        return outputString;
    }

}
