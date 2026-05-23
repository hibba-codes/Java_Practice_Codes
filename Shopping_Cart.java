class Shopping_Cart{
    String productName;
    double price;
    int quantity;
    double totalBill;



    public Shopping_Cart(String n, double p, int q ){
        this.productName = n;
        this.price = p;
        this.quantity = q;

    }
    public void calculate_Bill(){
        totalBill = price * quantity;
    }


    public void display_Cart(){
        System.out.println("\n======Shopping Cart======\n");
        System.out.println("Product Name = " + productName);
        System.out.println("Price = " + price);
        System.out.println("Quantity = " + quantity);

    }
}
public class Information{
    public static void main(String[] args){

        double grandTotal = 0;

        Shopping_Cart[] order = new Shopping_Cart[3];
        order[0] = new Shopping_Cart("Shoes", 3000 , 2);
        order[1] = new Shopping_Cart("Dress" , 5000 , 2);
        order[2] = new Shopping_Cart("Bag" , 2000, 1 );

        for(int i = 0 ;i < order.length; i++ ){
            order[i].calculate_Bill();
            grandTotal += order[i].totalBill;
            order[i].display_Cart();
            System.out.println("Total Bill = " + order[i].totalBill);

            if(order[i].price > 2000){
                System.out.println(order[i].productName + " is Expensive");
            }

        }
        System.out.println("\n=======================\n");

        System.out.println("Grand Total = " + grandTotal);
        if(grandTotal > 10000){
            System.out.println("Discount Applied");
        }
        System.out.println("\n=====Thank You=====\n");

    }
}
