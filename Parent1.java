class Parent {  
void v1() //Declaring function  
{  
System.out.println("Inside the Parent Class");  
}  
}  
class Child extends Parent
{  
            void v1() // Overriding function from the Parent class  
            {  
            System.out.println("Inside the Child Class");  
            }
}  
class Parent1
{
            public static void main(String args[])
            {  
            Parent ob1 = new Child(); //Refering the child class object using 
            //the parent class  
            ob1.v1();  
            }  
}  