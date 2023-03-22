class TwoGenerics<T>
{
    T a;
    T b;
    TwoGenerics(T al,T bl) {
        a=al;
        b=bl;
    
    }
    void swap()
    {
        T c=a;
        a=b;
        b=c;
    }
void print(){
    System.out.println(a);
    System.out.println(b);
    }
}
class GDemo
{
    public static void main(String args[])
    {
        TwoGenerics<Integer>obj=new TwoGenerics<Integer>(45,50);
        System.out.println("Before Swapping");
            obj.print();

            System.out.println("After Swapping");
            obj.swap();
            obj.print();
    }
}