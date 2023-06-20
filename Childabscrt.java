class Childabscrt extends Parentabscrt{
    void message(){
        System.out.println("This is First Subclass");
    }

public static void main(String []args){
    Childabscrt child = new Childabscrt();
    child.message();
}
}