import java.util.*;
class Big
{
public static void main(String args[ ])
{
Scanner sc=new Scanner(System.in);
int a,b,c,d,e,f,g,h,i,j,k,l,m,n,o,p;
a=sc.nextInt();
b=sc.nextInt();
c=sc.nextInt();
d=sc.nextInt();
e=sc.nextInt();
f=sc.nextInt();
g=sc.nextInt();
h=sc.nextInt();
i=sc.nextInt();
j=sc.nextInt();
k=sc.nextInt();
l=sc.nextInt();
m=sc.nextInt();
n=sc.nextInt();
o=sc.nextInt();
p=sc.nextInt();
int c1=Math.max(Math.max(a,b),Math.max(c,d));
int c2=Math.max(Math.max(e,f),Math.max(g,h));
int c3=Math.max(Math.max(i,j),Math.max(k,l));
int c4=Math.max(Math.max(m,n),Math.max(o,p));
int c5=Math.max(Math.max(c1,c2),Math.max(c3,c4));
System.out.println("Biggest number = "+c5);
}
}
