class Solution
{
    public static void generate(int a[],int index,ArrayList<String> ls,String[] map,StringBuilder output){
        if(index>=a.length){
            ls.add(output.toString());
            return;
        }
        
        int number=a[index];
        String word=map[number];
        
        for(int i=0;i<word.length();i++){
            output.append(word.charAt(i));
            generate(a,index+1,ls,map,output);
            output.deleteCharAt(output.length()-1);
        }
    }
    //Function to find list of all words possible by pressing given numbers.
    static ArrayList <String> possibleWords(int a[], int N)
    {
        ArrayList<String> ans=new ArrayList<>();
        
        if(N==0){
            return ans;
        }
        
        int index=0;
        StringBuilder output=new StringBuilder();
        
        String map[]={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
       
        generate(a,index,ans,map,output);
        return ans;
        // your code here  
    }
}


