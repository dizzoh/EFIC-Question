import java.util.*;
// public 
class App {
    private int age;
    private String name;

    // public static void main(String[] args) throws Exception {
      App(int age, String name){
        this.age = age;
        this.name = name; 
      } 
      public int getAge(){
        return age;
      } 
      public String getName(){
        return name;
      }
      public String toString(){
        return age+" " +name+" ";
      }
    }

    class CRUDOperation(){
        public static void main(String[] args){
            Collection<App> c = new ArrayList<App>();
            Scanner d = new Scanner(System.in);
            int data;
            do{
                System.out.println("1.Insert");
                System.out.println("2.Display");
                System.out.println("3.Update");
                System.out.println("4.Delete");
                System.out.print("Please choose operation");
                data = d.nextInt();
                switch(data){
                    case1: 
                          System.out.print("Enter your age: ");
                            int age = d.nextInt();
                            System.out.printl("Enter your Name: ");
                            String name = d.nextline();
                            c.add(new App(age,name));
                            break;
                    case2: 
                    System.out.println(c);
                    Iterator<App> i = c.iterator();
                    while(i.hasNext()){
                        App e = i.next();
                        System.out.println(e);
                    }
                    
                    break;
                    case3:
                    boolean found = false;
                    System.out.print("Enter name to search");
                    System.out.println("  ..");
                    i = c.iterator();
                    while(i.hasNext()){
                        App e = i.next();
                        System.out.print(e);
                    }
                    break;
                    case4:
                    System.out.print("Enter name to delete");
                    i = c.iterator();
                    while(i.hasNext()){
                        App e = i.next();
                        System.out.print(e);
                }
            }while (data !=0);
        }
    }
}
