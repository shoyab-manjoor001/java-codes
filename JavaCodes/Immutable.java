final class Immutable {

    private int i;

    Immutable(int i)
    {
        this.i=i;
    }

    public Immutable modify(int i)
    {
        if(this.i==i)
        {
            return this;
        }
        else
        {
            return new Immutable(i);
        }
    }

   public static void main(String[] args) 
   {
       Immutable i1 = new Immutable(10);
       Immutable i2 = i1.modify(100);
       Immutable i3 = i1.modify(10);
       
       System.out.println(i1==i2);
       System.out.println(i1==i3); 
   }
    
}
