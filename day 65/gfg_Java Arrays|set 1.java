class Compute
{
    String average(int a[], int n)
  {
    int sum = 0;
    for (int i = 0; i < n; i++)
    {
      sum += a[i];
    }
    double avg = (double)sum / n;
    
    return /*sum + " " +*/ String.format("%.2f", avg);
  
    }}
