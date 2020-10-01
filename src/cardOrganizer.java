public class cardOrganizer {
    private greetingCard[] cards = new greetingCard[20];
    private int count = 0;

    public boolean addCard(String sender, String recipient, String message, String occasion) {
        if (count < 20) {
            cards[count] = new greetingCard(sender, recipient, message, occasion);
            count++;
            return true;
        } else
            return false;

    }

    public String findRecipient(String recipient){
        String cardInfo = "";
        int found = binarySearch(cards,recipient,0, cards.length-1);
        if (found >=0){
            cardInfo = cards[found].toString();
        }
        else
            cardInfo ="Card not found";
        return cardInfo;
    }

    public void displayCards(String occasion){
        for(int j = 0; j < cards.length;j ++ ){
            if (occasion.compareToIgnoreCase(cards[j].getOccasion())==0){
                System.out.println(cards[j].toString() +"\n");
            }
        }
    }

    public String toString() {
        String finalString = "";
        for (int k = 0; k < count; k++) {
            finalString += "Recipient: " + cards[k].getRecipient() + " Occasion: " + cards[k].getOccasion() + "\n";
        }
        return finalString;

    }

    public static boolean floatLargestToTop(greetingCard[] data, int top){
        boolean changed = false;
        greetingCard temp;

        // notice we stop at length -2 because of expr. k+1 in loop
        for (int k = 0; k < top; k++)
            if (data[k].getRecipient().compareToIgnoreCase(data[k + 1].getRecipient()) > 0)
            {
                temp = data[k];
                data[k] = data[k + 1];
                data[k + 1] = temp;
                changed = true;
            }
        return changed;

    }
    public static void arraySort(greetingCard[] array)
    {
        for (int k = 0; k < array.length; k++)
            if ( !floatLargestToTop(array, array.length - 1 - k) )
                return;
    }
    public static int binarySearch(greetingCard[] array, String keyLast,
                                   int firstIndex, int lastIndex)
    {
        arraySort(array);
        int middleIndex, result;

        if (firstIndex > lastIndex)
            return -1;
        middleIndex = (firstIndex + lastIndex) / 2;
        result = keyLast.compareToIgnoreCase(array[middleIndex].getRecipient());

        if (result == 0)
            return middleIndex;
        else if (result < 0)
            return binarySearch(array, keyLast, firstIndex, middleIndex - 1);
        else
            return binarySearch(array, keyLast, middleIndex + 1, lastIndex);
    }

}
