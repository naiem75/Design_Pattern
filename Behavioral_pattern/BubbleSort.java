

public class BubbleSort implements SortingStrategy{

public void sort(int [] array)
{
    int size=array.length;
    for(int i=0;i<size;i++)
    {

        for(int j=0;j<size-i-1;j++)
        {
            if(array[j]>array[j+1])
            {
                int t=array[j];
                array[j]=array[j+1];
                array[j+1]=t;

            }
        }
    }
}


}
