package algorithms_recap;


public class test02 {
    public static void main(String[] args) {
// sort
        int a, b, c, nnp=0, s, p, n=10, k;
        long[] ss=new long[n+1];
        a=1;b=1;c=2;
        s=-b/a;
        p=c/a;
        ss[1]=s;
        ss[2]=s*s-2*p;
        for(k=3;k<=n;k++) ss[k]=s*ss[k-1]-p*ss[k-2];
        for(k=1;k<=n;k++)
            if(esteprim(Math.abs(ss[k])))
                System.out.println(k+" : "+ss[k]+" PRIM "+(++nnp));
            else
            {
                System.out.print(k+" : "+ss[k]+" = ");
                descfact(Math.abs(ss[k]));
            }
        System.out.println("nnp = "+nnp);
    }// main
    static void descfact(long nr)
    {
        long d=2;
        if((nr==0)||(nr==1)){System.out.println(); return;}
        while(nr%d==0){System.out.print(d+""); nr=nr/d;}
        d=3;
        while((d*d<=nr)&&(nr!=1))
        {
            while(nr%d==0){System.out.print(d+" "); nr=nr/d;}
            d=d+2;
        }
        if(nr!=1) System.out.println(nr);
        else System.out.println();
    }
    static boolean esteprim(long nr)
    {
        if((nr==0)||(nr==1)) return false;
        if((nr==2)||(nr==3)) return true;
        if(nr%2==0) return false;
        long d=3;
        while((nr%d!=0)&&(d*d<=nr)) d=d+2;
        if(nr%d==0) return false; else return true;

    }
}