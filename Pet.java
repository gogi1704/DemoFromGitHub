public class Pet {
    public String clas;
    public int age;

    public Pet(String clas, int age) {
        this.clas = clas;
        this.age = age;
    }
    public void sayAge(){
        System.out.println(age);
    }
    public void voice(){
        System.out.println("gav");
    }
}
