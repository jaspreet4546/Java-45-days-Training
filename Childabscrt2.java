class Childabscrt2 extends Parentabscrt{
    void message(){
        System.out.println("This is Second subclass");
    }
    public static void main(String []args){
        Childabscrt2 child2 = new Childabscrt2();
        child2.message();
    }
}