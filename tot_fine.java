//java program to calculate the total fine collected 
class tot_fine  
{ 
  
// function to calculate 
// the total fine collected 
static int totFine(int car_num[], int n, 
                   int date, int fine) 
{ 
int tot_fine = 0; 
  
// traverse the array elements 
for (int i = 0; i < n; i++) 
  
    // if both car no and date  
    // are odd or both are even,  
    // then statement evaluates to true 
    if (((car_num[i] ^ date) & 1) == 1) 
        tot_fine += fine; 
  
// required total fine 
return tot_fine; 
} 
  
public static void main(String[] args) 
{ 
    int car_num[] = { 3, 4, 1, 2 }; 
    int n = car_num.length; 
    int date = 15, fine = 250; 
  
    System.out.println(totFine(car_num, n,  
                               date, fine)); 
} 
} 
  