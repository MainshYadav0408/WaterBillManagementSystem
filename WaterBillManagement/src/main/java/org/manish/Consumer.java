package org.manish;


public class Consumer {
    private int guest;
    private int BHK;
    private int ratioCorporation;
    private int ratioBorewell;

    private int amount;
    private int litre;


    public Consumer(int BHK, int ratioCorporation, int ratioBorewell, int guest) {
        this.BHK = BHK;
        this.ratioCorporation = ratioCorporation;
        this.ratioBorewell = ratioBorewell;
        this.guest = guest;
        calcNormal();
        calcGuest();
    }

    public int getLitre(){
        return litre;
    }

    private void calcGuest(){
        int litreGuest = guest * 10 *30;
        int amountGuest = 0;

        if (litreGuest <= 500) {
            amountGuest = litreGuest * 2;
        } else if(litreGuest > 500 && litreGuest <= 1500) {
            amountGuest = 1000 + (litreGuest - 500) * 3;
        } else if (litreGuest > 1500 && litreGuest <= 3000) {
            amountGuest = 1000 + 3000 + (litreGuest - 1500) * 5;
        } else {
            amountGuest = 1000 + 3000 + (litreGuest - 3000) * 8;
        }

        litre = litre+litreGuest;
        amount = amount + amountGuest;
    }

    private void calcNormal(){
        int litreNormal = (BHK == 2 ? 3 : 5) * 10 * 30;
        int ratioSum = ratioCorporation + ratioBorewell;
        int amountNormal =  (int) ((litreNormal * ratioCorporation/ratioSum)+  (litreNormal * ratioBorewell/ratioSum*1.5));
        litre = litre+litreNormal;
        amount = amount + amountNormal;
    }

    public int getAmount() {
        return amount;
    }
}
