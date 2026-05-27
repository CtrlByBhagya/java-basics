class Human{
    private int age;
    private String name;

    public Human(int age,String name){
        this.age=age;
        this.name=name;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age=age;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
}
public class ParameterizedConstructor {
    public static void main (String a[]){
        Human obj=new Human(20,"bhagyashree");
        System.out.println(obj.getAge()+":"+obj.getName());
    }
    
}
