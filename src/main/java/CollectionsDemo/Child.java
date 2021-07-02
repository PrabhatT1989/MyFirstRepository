package CollectionsDemo;

public class Child  extends Parent {
public void m2()
{
	
System.out.println("M3 method :: ");
}

public static void main(String args[])
{

Parent p1 = new Child();
p1.m1();

Child c= new Child();
c.m2();


}


}
