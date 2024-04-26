class ClumsyFactorial {
    public int clumsy(int n) {
        int ans=0;
        int j=0;
        int temp=1;
        int flag=1;
        Stack<Integer> stk=new Stack<>();
        for(int i=n;i>0;i--){
            if(j==0){
                temp=i*flag;
                stk.push(temp);
            }
            else if(j==1){
                temp=stk.pop();
                temp*=i;
                stk.push(temp);
            }
            else if(j==2){
                temp=stk.pop();
                temp/=i;
                System.out.println("2 "+i);
                stk.push(temp);
            }
            else if(j==3){
                stk.push(i);
                j=-1;
                flag=-1;
                System.out.println("j"+j);
                System.out.println("3 "+i);
            }
            j++;
          
        }
        System.out.println(stk);
        while(!stk.isEmpty()){
            ans+=stk.pop();
        }
        return ans;
    }
}