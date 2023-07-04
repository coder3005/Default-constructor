/* Default Constructor */
class A 
{
    int a; String b; Boolean c;
    /*A()//default
    {
        a=100; b="abhi"; c=true;
    }*/
    void Disp()
    {
        System.out.print(a+" "+b+" "+c);
    }
}
class B 
{
    public static void main(String[] args) {
       A r=new A();
       r.Disp(); 
    }
    
}
