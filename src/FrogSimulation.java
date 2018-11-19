public class FrogSimulation {
    private int goalDistance;
    private int maxHops;
    private int[] CurrentSteps;

    public FrogSimulation(int dist, int numHops)
    {
        goalDistance = dist;
        maxHops = numHops;
    }
    public int hopDistance()
    {
        return (int)(Math.random()*31)-15;
    }
    public boolean simulate()
    {
        /*CurrentSteps = new int [this.maxHops-1];
        int temp = 0;
        for (int i =0;i<this.maxHops-1;i++)
        {
            CurrentSteps[i] = hopDistance();
            for(int x = 0;x<i;x++)
            {
                temp += CurrentSteps[x];
                if(temp>=goalDistance)
                {
                    return true;
                }
                else if(temp<=0)
                {
                    return false;
                }
            }
            temp = 0;
        }
        return false; */
        int position = 0;
        for (int count  = 0; count < maxHops; count++)
        {
            position += hopDistance();
            if(position >= goalDistance)
            {
                return true;
            }
            else if (position < 0)
            {
                return false;
            }
        }
        return false;
    }

    public double runSimulations(int num)
    {
        int correct =0;
        boolean isCorrect = false;
        for(int i =1;i<num;i++)
        {
            isCorrect = simulate();
            if (isCorrect == true)
            {
                correct++;
            }
        }
        double Done = correct/num;
        return (Done);
    }
}
