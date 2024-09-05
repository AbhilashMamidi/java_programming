class Father{
    public int property = 10;
}
class FirstSon extends Father {
    int sharing = 5;
    public void results(){
    System.out.println("Father shares his half of his property to the first one " + property+ "acres");
    System.out.println("After sharing his first son gets "+ sharing + "acres");
    }
}
class SecondSon extends Father{
    int sharings = 5;
    void display(){
    System.out.println("Father shares his half of his property to the second one " + property+ "acres");
    System.out.println("After sharing his second son gets "+ sharings + "acres");
    }
}
class MainClass5 {
    public static void main(String[]args){
     FirstSon s1 = new FirstSon();
     SecondSon s2 = new SecondSon();
     s1.results();
     s2.display();
    }
    
}
