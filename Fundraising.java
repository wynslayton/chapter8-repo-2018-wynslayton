public class Fundraising
{
    int people = 0;
    public Fundraising(int m)
    {
        System.out.println(callNum(m));
    }
    
    public int callNum(int m){
        System.out.println(m);
        if(m ==1)
            return 1;
        else{
                return callNum(m/10)*10+1 +callNum(m/10)*10 +callNum(m/10)*10 +callNum(m/10)*10 +callNum(m/10)*10 +callNum(m/10)*10 +callNum(m/10)*10 +callNum(m/10)*10 +callNum(m/10)*10 +callNum(m/10)*10;

            
        }
    }

}
