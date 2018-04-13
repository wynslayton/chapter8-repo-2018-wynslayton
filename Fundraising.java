public class Fundraising
{
    int people = 0;
    public Fundraising(int m)
    {
        System.out.println(callNum(m));
    }
    
    public int callNum(int m){
        if(m ==1)
            return 1;
        else{
                people += callNum(m/10)*10+1;
                return people;
            
        }
    }

}
