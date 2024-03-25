package ObserverDesignPattern;

import ObserverDesignPattern.Observable.IphoneObservabele;
import ObserverDesignPattern.Observable.StocksObservableInterface;
import ObserverDesignPattern.Observer.EmailAlertObserver;
import ObserverDesignPattern.Observer.NotificationObserver;
import ObserverDesignPattern.Observer.SmsAlertObserver;

public class Store {
    public static void main(String[] args) {

        StocksObservableInterface iphoneObservable = new IphoneObservabele();

        NotificationObserver observer1 = new EmailAlertObserver("bb@gmail.com",iphoneObservable);
        NotificationObserver observer2 = new EmailAlertObserver("bb1@gmail.com",iphoneObservable);
        NotificationObserver observer3 = new SmsAlertObserver("335435366",iphoneObservable);
        NotificationObserver observer4 = new SmsAlertObserver("8734848",iphoneObservable);

        iphoneObservable.add(observer1);
        iphoneObservable.add(observer2);
        iphoneObservable.add(observer3);
        iphoneObservable.add(observer4);

        iphoneObservable.setStockAdded(10);
    }
}
