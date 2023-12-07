

//User function Template for Java

class Solution{


static void NumAdd(List<Integer> ls,int d,int N){
N=N+d;
ls.add(N);
if(N==ls.get(0)){
    return;
}

if(N<=0){
    d=-d;
}

NumAdd(ls,d,N);
}   

    static List<Integer> pattern(int N){
     List<Integer> list=new ArrayList<Integer>();
     list.add(N);
     
     NumAdd(list,-5,N);
     return list;
        // code here
    }
}
