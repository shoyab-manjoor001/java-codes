public class ArrayDemo
{
    public static void main(String[] args) {
        int a[] = {1,2,3,4,5};
        int sum=0;
        int b[] =  new int[5];
        for(int i=0;i<a.length;i++)
        {
            sum+=a[i];
        }
        System.out.println("Sum of Array: "+sum);
        b[0]=0;
        for(int j=1;j<5;j++)
        {
            b[j]=j;
        }
        for(int j=0;j<5;j++)
        {
            System.out.println(b[j]);
        }
    }
}