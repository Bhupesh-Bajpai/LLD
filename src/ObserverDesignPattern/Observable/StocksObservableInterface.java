package ObserverDesignPattern.Observable;

import ObserverDesignPattern.Observer.NotificationObserver;

public interface StocksObservableInterface {

    public void add(NotificationObserver observer);
    public void remove(NotificationObserver observer);

    public void notifySubscriber();

    public void setStockAdded(int newStock);

    public int getStockCount();

}
