import java.io.Serializable;
import java.util.HashSet;

public class Prob4 {

	public static void main(String[] args) {
		Product[] prodList = {
				new Product("NT450R5E-K24S",500000,"�Ｚ����"),
				new Product("15UD340-LX2CK",400000,"LG����"),
				new Product("G2-K3T32AV",600000,"HP") };
		HashSet product_hs = makeHashSet(prodList, 500000);
		makeFile(product_hs);
		readFile();
		
	}

	
	private static HashSet makeHashSet(Product[] prodList, int price) {
		//�����Ͻÿ�...return�� �����ϱ� 
		
		
		return null;
	}


	private static void makeFile(HashSet resultList)  {
		//�����Ͻÿ�.
		 
		
		
	}
	private static void readFile()  {
		//�����Ͻÿ�. 
	}

}


class Product implements Serializable{
	private String model_name;
	private int price;
	private String company;
	
	
	public Product(String model_name, int price, String company) {
		super();
		this.model_name = model_name;
		this.price = price;
		this.company = company;
	}


	public String getModel_name() {
		return model_name;
	}


	public void setModel_name(String model_name) {
		this.model_name = model_name;
	}


	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}


	public String getCompany() {
		return company;
	}


	public void setCompany(String company) {
		this.company = company;
	}


	@Override
	public String toString() {
		return "Product [model_name=" + model_name + ", price=" + price
				+ ", company=" + company + "]";
	}
	
	

}