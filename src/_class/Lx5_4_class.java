package _class;

public class Lx5_4_class {
    public char name;
    public int num;
    public int score;
    public Lx5_4_class() {
    	this.name='¿Õ';
    	this.num=000000;
    	this.score=0;
    }
    public Lx5_4_class(char name,int num,int score) {
    	this.name=name;
    	this.num=num;
    	this.score=score;
    }
    public Lx5_4_class copy(Lx5_4_class stu) {
    	this.name=stu.name;
    	this.num=stu.name;
    	this.score=stu.score;
    	return this;
    }
    public void print() {
    	System.out.print("ÐÕÃû£º"+this.name+"\t");
    	System.out.print("Ñ§ºÅ£º"+this.num+"\t");
    	System.out.println("³É¼¨£º"+this.score+"\t");
    }
//    public boolean operate()>
//    public void sort(Lx5_4_class[] student,int score)
//    {
//    	int n=student.length;
//    	for(int i=1;i<n;i++) {
//    		for(int j=0;j<n-i;j++) 
//    		{
//    			if(student[j].score<student[j+1].score) 
//    			{
//    			char temp1=student[j].name;
//    			student[j].name=student[j+1].name;
//    			student[j+1].name=temp1;
//    			int temp2=student[j].num;
//    			student[j].num=student[j+1].num;
//    			student[j+1].num=temp2;
//    			int temp3=student[j].score;
//    			student[j].score=student[j+1].score;
//    			student[j+1].score=temp2;
//    			}
//    		}
//    	}
   // }
	
}
