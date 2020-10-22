public class Order {
    public static final int MAX_ORDER = 10;

    private int orderNumber;
    private Customer custoOrdered;
    private Restaurant restoReceived;
    private FoodApp appUsed;
    private FoodItem[] listItems;
    private int numOrdered;
    private double priceOfOrder;
    public static int initialOrderNum = 9000000;


    public Order(Customer custoOrdered, Restaurant restoOrdered, FoodApp appUsed) {
        this.custoOrdered = custoOrdered;
        restoReceived = restoOrdered;
        this.appUsed = appUsed;
        listItems = new FoodItem[MAX_ORDER];
        numOrdered = 0;
        priceOfOrder = 0;
        initialOrderNum++;
        orderNumber = initialOrderNum;
    }


    public boolean addToOrder(FoodItem newfoodItem) {
        boolean check = false;
        double price = newfoodItem.getSellingPrice();
        if (newfoodItem.isAvailable() && (numOrdered<MAX_ORDER)) {
            //for (int i = 0; i < numOrdered; i++) {
            listItems[numOrdered] = newfoodItem;
            newfoodItem.decrementStock();
            priceOfOrder+=price;
            numOrdered++;
            check = true;
        }


            return check;
        }


        public String toString () {
         String outPut= "--AvoidThePlate order #"+orderNumber+"\n"+"For Customer "+custoOrdered.getName()+" with the restaurant "
                 + restoReceived.getName()+"\n";
         for(int i= 0;i<numOrdered;i++){
            outPut+= listItems[i];

         }
         outPut+="Total Price: $" + priceOfOrder;
         return outPut;
    }
}