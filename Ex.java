public class Ex{
    
    public static void main(String args[]){
        Ex ob=new Ex();
        String S=ob.greet("CSE");
        System.out.print(S);
    }
    String greet(String a){
        return ("Good Morning..."+a);
    }
}
