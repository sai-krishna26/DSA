class BestTimeToBuyAndSellAStock
{
    public static void main(String[] args)
    {
        int[] prices = {7,1,5,3,6,4};
		
		int max=0;
		int min=prices[0];
		if(prices.length==0)
		{
			System.out.println(0);
		}
		else
		{
			for(int i=1;i<prices.length;i++)
			{
				if(prices[i]<min)
				{
					min=prices[i];
				}
				
				int profit=prices[i]-min;
				{
					if(profit>max)
					{
						max=profit;
					}
				}
			}
		}
		System.out.println("buying price:"+min);
		System.out.println("selling price:"+(min+max));
		System.out.println("profit:"+max);
	}
}

