class Rectangle2{
	int length = 0;
	int breadth = 0;
Rectangle2(){
	this.length = 0;
	this.breadth = 0;
	}
Rectangle2(int length, int breadth){
	this.length = length;
	this.breadth = breadth;
	}
Rectangle2(int length){
	this.length = length;
	this.breadth = length;
	}
public int Area(){
	return length*breadth;
	}
public static void main(String args[]){
	Rectangle2 obj1 = new Rectangle2();
	System.out.println("Area with no parameter:"+obj1.Area());
	Rectangle2 obj2 = new Rectangle2(5,6);
	System.out.println("Area with two parameter:"+obj2.Area());
	Rectangle2 obj3 = new Rectangle2(3);
	System.out.println("Area with one parameter:"+obj3.Area());
	}
}