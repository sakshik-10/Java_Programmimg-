class Demo
{
    public int i ;
    public int j;
    public static int k;

    static 
    {
        System.out.println("Inside Static Block");
        k =51;


    }
    public Demo()
    {   
        System.out.println("Inside Constructor");
        this.i=11;
        this.j=21;
    }
    public void Fun()
    {
       System.out.println("Inside Fun method");
       System.out.println(this.i);
       System.out.println(this.j);
       System.out.println(Demo.k);
    }
    public static void Gun()
    {
      System.out.println("Inside Gun Method");
      System.out.println(Demo.k);
    }

}

class StaticDemo 
{
    public static void main(String A[]) 
    {
      System.out.println("Inside Main");
      System.out.println("Value of k:"+Demo.k);
      Demo.Gun();

      Demo dobj1 =new Demo();
      Demo dobj2 =new Demo();

      dobj1.Fun();
      dobj2.Fun(); 


        
    }
    
}
