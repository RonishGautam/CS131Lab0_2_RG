public class ArrayFun {
private Square [] myArray;
private double sum;

	public ArrayFun(){
	myArray = new Square[6];
	for(int i =0; i< 6; i++) {
		myArray[i]=new Square (i);
		}
	}
	public void setArrayitem(int index, Square s){
		myArray[index]=s;
	}
	public Square getArrayitem(int index) {
		return myArray[index];
	}
	public void forword() {
		for(int i=0; i<6; i++) {
			System.out.println("Area of square forword is: " + i + myArray[i].getArea());
		}
	}
	public void backword() {
		for(int i= 5; i>=0; i--) {
	System.out.println("Area of square backword is: " + i + myArray[i].getArea());
		}
	}
	public void sum() {
		sum = 0;
		for(int i=0; i<myArray.length; i++) {
			sum+= myArray[i].getArea();
		}
	System.out.println("The sum of the square area: " + sum);
	}
	
	
}
