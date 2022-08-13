class GfG
{
    int maxChainLength(Pair arr[], int n)
    {
        Arrays.sort(arr,(a,b)->a.y-b.y);
        int ans=1;
        int prev=arr[0].y;
        for(int i=1;i<n;i++){
            if(arr[i].x>prev){
                prev=arr[i].y;
                ans++;
            }
        }
        return ans;
    }
}


/* ------------------------------------------------------------------------------------------------  */

class CompareByFirst implements Comparator<Pair>
{
   public int compare(Pair a, Pair b)
    {
        return a.x - b.x;
    }
}

class GfG
{
    int maxChainLength(Pair arr[], int n)
    {   
        Arrays.sort(arr,new CompareByFirst());
   
        int count = 1;
        Pair value = null;
   
        for(int i=arr.length-1;i>=0;i--)
         {
             if(value==null) {value = arr[i]; continue; }
       
             if(arr[i].y<value.x)
               {
                 value = arr[i];
                 count++;
             } 
        }
        
        return count;    
    }
}

/*------------------------------------------------------------------------------------------------------*/
