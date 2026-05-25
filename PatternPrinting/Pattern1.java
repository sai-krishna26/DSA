class Pattern1
{
    public static void main(String[] args) {
        Pattern1 pattern=new Pattern1();
        pattern.printP(5);
    }
    public void printP(int n) {
        for(int i=0;i<n-1;i++)
        {
            for(int j=0;j<n-1;j++)
            {
                System.out.print("* ");
            }
			 System.out.println();
        }
    }
}