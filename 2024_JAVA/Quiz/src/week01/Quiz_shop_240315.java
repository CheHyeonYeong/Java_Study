package week01;

public class Quiz_shop_240315 {

	public static void main(String[] args) {
		// Test
		Buyer b1 = new Buyer();
		b1.cash = 500000;
		b1.addToCart(new Coffee(10000, "이디야 원두"));
		b1.addToCart(new Coffee(15000, "커피빈 원두"));
		b1.addToCart(new Coffee(20000, "스타벅스 원두"));
		b1.addToCart(new Coffee(10000, "이디야 원두"));
		b1.addToCart(new Coffee(15000, "커피빈 원두"));
		b1.addToCart(new Coffee(20000, "스타벅스 원두"));
		b1.addToCart(new Coffee(10000, "이디야 원두"));
		b1.addToCart(new Coffee(15000, "커피빈 원두"));
		b1.addToCart(new Coffee(20000, "스타벅스 원두"));
		b1.addToCart(new Coffee(10000, "이디야 원두"));
		b1.addToCart(new Coffee(15000, "커피빈 원두"));
		b1.addToCart(new Coffee(20000, "스타벅스 원두"));
		b1.addToCart(new Coffee(10000, "이디야 원두"));
		b1.addToCart(new Coffee(15000, "커피빈 원두"));
		b1.addToCart(new Coffee(20000, "스타벅스 원두"));
		b1.addToCart(new Coffee(10000, "이디야 원두"));
		b1.addToCart(new Coffee(15000, "커피빈 원두"));
		b1.addToCart(new Coffee(20000, "스타벅스 원두"));
		b1.addToCart(new Vaccine(69000, "V3"));
		
		b1.buyAll();
		System.out.println("============= 카트 정보 ================");
		b1.receiptCart();
		System.out.println("============= 트렁크 정보 ==============");
		b1.receipt();
		b1.addToCart(new Coffee(15000,"커피빈 원두"));
		b1.buyAll();
		
		b1.receipt();
		
		for (int i = 0; i <b1.trunkcount;i++) {
			Product p = b1.trunk[i];
			
			if (p instanceof Vaccine) {
				Vaccine v = (Vaccine)p;
				v.checkComputer();
			}else if(p instanceof Coffee) {
				Coffee c = (Coffee)p;
				c.drink();						
			}else {
				
			}
			
		}
	
	}

}


class Buyer {
    int MAXCART = 100;
    int MAXTRUNK = 100;
    Product[] trunk = new Product[MAXTRUNK];
    Product[] cart = new Product[MAXCART];
    int trunkcount = 0;
    int cartcount = 0;
    int cash;

    public Buyer(){
        this.cash = 0;
    }
    public Buyer(int money){
        cash  = money;
    }

    public void buy(Product p){
        if(p.getPrice()> cash){
            System.out.println("구매 불가합니다. 돈이 없습니다.");
        }
        else{
            cash -=p.getPrice();
            trunk[trunkcount] = p;
            trunkcount++;
        }
    }


    public void buyAll(){
        for(int i =0; i<cartcount;i++){
            buy(cart[i]);
        }
    }

    public void buyAll(Product[] cart){
        for(int i =0; i<cart.length;i++){
            buy(this.cart[i]);
        }
    }
    public void addToCart(Product p){
        if(cartcount==(MAXCART-1) ){
            MAXCART*=2;
        }
        cart[cartcount] = p;
        cartcount++;
        
    }

    public void cancel(int cart_index){

        for (int i =cart_index; i<=cartcount;i++){
            cart[i]=cart[i+1];
        }
        cartcount--;
    }

    public void receipt(){
        System.out.println("====구매목록===");

        for (int i =0;i<trunkcount;i++){
            System.out.println(i+"번째 구입 물품 이름 : " +trunk[i].getName()+" \t 가격 : " +trunk[i].getPrice());
        }
        System.out.println("====현재 잔고 상태===");
        System.out.println(cash);
    }


    
    public void receiptCart(){
        System.out.println("====장바구니 목록===");

        for (int i =0;i<trunkcount;i++){
            System.out.println(i+"번째 장바구니 물품 이름 : " +cart[i].getName()+" \t 가격 : " +cart[i].getPrice());
        }
        System.out.println("====현재 잔고 상태===");
        System.out.println(cash);
    }


}

class Product{  // 부모 클래스 사용할 예정!!
	
	String name;
	private int price; // private : 내 클래스 내부에서만 사용하려고 함.
	public Product(int price) {
		this.price = price;
	}
	
	public String getName() {
		return name;
	}
	public int getPrice() {
		return price;
	}
}


class Coffee extends Product{
    
    public Coffee(){
        super(0);
        super.name = "coffee";
    }

    public void drink() {
        
        System.out.println(name+"쩔죠?");
    }

    public Coffee(int pay, String name){
        super(pay);
        super.name = name;
    }
}

class Vaccine extends Product{
    
    public Vaccine(){
        super(0);
        super.name = "Vaccine";
    }

    public void checkComputer() {
        System.out.println(name+"쩔죠?");
    }

    public Vaccine(int pay, String name){
        super(pay);
        super.name = name;
    }
}

class Computer extends Product{
    
    public Computer(){
        super(0);
        super.name = "Computer";
    }

    public Computer(int pay, String name){
        super(pay);
        super.name = name;
    }
}