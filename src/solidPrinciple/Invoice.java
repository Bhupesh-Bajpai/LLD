package solidPrinciple;

public class Invoice {
    private  Marker marker;
    private int quantity;

    public Invoice(Marker marker,int quantity){
        this.marker = marker;
        this.quantity = quantity;
    }
    public int calculateBill(){
        int total = (marker.price)*(this.quantity);
        return total;
    }

    public void printInvoice(){

    }

    public void saveDB(){

    }
}



//here if you see if we chnage inside calculatorBill that thing we depend on other things too like print invoice save db also
//we need every class like that depends on one thing only

//we need only one reason to change a class not more than