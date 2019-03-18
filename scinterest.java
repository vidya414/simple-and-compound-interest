import java.util .*
class scinterest
{
    double p,r,t,s,c;//p=principle amount,r=rate of interest,t=time,s=simple interest,c-=compound interest
    Scanner s=new Scanner (System.in);
    //Enter the amount
    p=s.nextDouble();
    //Enter the No.of years:
    t=s.nextDouble();
    //Enter the Rate of  interest
    r=s.nextDouble();
    s=((p * t * r)/100);
    c=p * Math.pow(1.0+r/100.0,t) - p;
    //Simple Interest=s
    //Compound Interest=c
   }
}
