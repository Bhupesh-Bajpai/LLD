package ObserverDesignPattern.Observer;

import ObserverDesignPattern.Observable.StocksObservableInterface;

public class SmsAlertObserver implements NotificationObserver{


    String emailId;
    StocksObservableInterface stocksObservable;

    public SmsAlertObserver(String emailId,StocksObservableInterface observable){
        this.stocksObservable = observable;
        this.emailId = emailId;
    }
    @Override
    public void update() {
        sendSms(emailId,"Product is in stock.");
    }

    private void sendSms(String emailId,String msg){
        System.out.println("Sms send to....."+emailId+"...."+msg);
    }
}
