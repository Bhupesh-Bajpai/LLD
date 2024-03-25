package ObserverDesignPattern.Observer;

import ObserverDesignPattern.Observable.StocksObservableInterface;

public class EmailAlertObserver implements NotificationObserver{


    String emailId;
    StocksObservableInterface stocksObservable;

//     constructor injection
    public EmailAlertObserver(String emailId,StocksObservableInterface observable){
        this.stocksObservable = observable;
        this.emailId = emailId;
    }

    @Override
    public void update() {
       sendMail(emailId,"Product in stock.");
    }


    private void sendMail(String emailId,String msg){
        System.out.println("Mail Sent to...."+emailId+"..."+msg);

    }
}
