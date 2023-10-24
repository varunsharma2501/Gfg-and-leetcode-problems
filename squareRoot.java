class Solution
{
     long floorSqrt(long x)
	 {
	     if(x==1){
	         return 1;
	     }
	     
	     int i=1;
	     for(;i*i<=x;i++){
	       if(i*i==x){
	           return i;
	       }
	     }
	     return (long)(i-1);
		// Your code here
	 }
}
