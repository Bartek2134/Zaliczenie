class Main {
  public static void main(String[] args) {
 int[] tablica = {1,2,2,3,4};

        for (int i = 0; i < 5; i++)
        {
            for (int j = i+1; j < 5; j++)
            {
                if(tablica[i] == tablica[j])
                System.out.println(tablica [i]);
            }
        }
      
  }
}