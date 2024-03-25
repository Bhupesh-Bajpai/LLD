package ObserverDesignPattern.Observable;

import ObserverDesignPattern.Observer.NotificationObserver;

import java.util.ArrayList;

public class IphoneObservabele implements StocksObservableInterface{
 public ArrayList<NotificationObserver> observerList = new ArrayList<>();
 public int stockCount = 0;

    @Override
    public void add(NotificationObserver observer) {
        observerList.add(observer);
    }

    @Override
    public void remove(NotificationObserver observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifySubscriber() {
        for(NotificationObserver observer : observerList){
            observer.update();
        }
    }

    @Override
    public void setStockAdded(int newStock) {
        if(stockCount == 0){
            notifySubscriber();
        }
        stockCount = stockCount + newStock;
    }

    @Override
    public int getStockCount() {
        return stockCount;
    }
}
