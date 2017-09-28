package _class;
//person¿‡
public class Lx5_5_class {
    String name;
    double heigh;
    int age;
    Lx5_5_class() {
    	 this.name="null";
    	 this.heigh=0;
    	 this.age=0;
     }
    public void setName(String name) {
    	this.name=name;
    }
    public String getName() {
    	return this.name;
    }
    public void setHeigh(double heigh) {
    	this.heigh=heigh;
    }
    public double getheigh() {
    	return this.heigh;
    }
    public void setAge(int age) {
    	this.age=age;
    }
    public int getAge() {
    	return this.age;
    }
     public void sayHello() {
    	 System.out.println("hello,my name is"+this.name);
     }
    
}
