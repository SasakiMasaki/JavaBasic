package practice10;

public class Car {
	int serialNo;
	String color;
	int gasoline;

	public int run() {
		gasoline -= 1;

		if(0 > gasoline) {
			return -1;
		}else{
			return 1 + new java.util.Random().nextInt(15);
		}
	}

}
