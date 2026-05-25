class Human{
    private int age;
    private String name;

    public Human(){
        age=20;
        name="bhagyashree";
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
public class Constructor {
    public static void main(String a[]){
        Human obj=new Human();
        Human obj1=new Human();

        obj1.setAge(21);
        obj1.setName("mahi singh");
        
        System.out.println(obj.getAge()+":"+obj.getName());
        System.out.println(obj1.getAge()+":"+obj1.getName());
    }
    
}
