#include <stdio.h>

float balance = 0; // intial balance to be zero for everyone 
int anotherTransaction; 


void transaction(){
  int choice; 
  printf("Enter any option to be served!\n\n");
  printf("1. Withdraw\n"); 
  printf("2. Deposit\n"); 
  printf("3. Balance\n");
  scanf("%d",  &choice); 
  
  switch(choice){
    case 1:
    // first option should be withdraw
    int amountToWidthdraw; 
    printf("Please enter amount to withdraw: "); 
    scanf("%d", &amountToWidthdraw); 
    if(amountToWidthdraw > balance){
      printf("There is no insuffient funds in your account"); 
      // ask them for another transaction
      printf("\n\nDo you want another transaction?\nPress 1 to proceed and 2 to exit\n\n"); 
      scanf("%d", &anotherTransaction); 
      if(anotherTransaction == 1){
        // call our transaction method here
        transaction();
      }
    } else {
      // this means account has something
      // so withdraw amount and update the balance variable 
      balance = balance - amountToWidthdraw; 
      
      printf("You have withdrawn %d and your new balance is %f ", amountToWidthdraw, balance);
      
      // request for another transaction
      printf("\n\nDo you want another transaction?\nPress 1 to proceed and 2 to exit\n\n"); 
      scanf("%d", &anotherTransaction); 
      if(anotherTransaction == 1){
        // call our transaction method here
        transaction();
      }
      
      
    }
    break; 
    
    case 2:
    // DEPOSIT
    
    int amountToDeposit; 
    printf("Please enter amount to deposit: "); 
    scanf("%d", &amountToDeposit); 
    // now that you have deposited something, update the balance variable
    
    balance = amountToDeposit + balance; 
    
    printf("Thank you for depositing, new balance is: %f", balance); 
    
    // request for another transaction
      printf("\n\nDo you want another transaction?\nPress 1 to proceed and 2 to exit\n\n"); 
      scanf("%d", &anotherTransaction); 
      if(anotherTransaction == 1){
        // call our transaction method here
        transaction();
      }
    
    break; 
    
    case 3:
    
    // BALANCE
    printf("Your bank balance is: %f", balance); 
    
    // request for another transaction
      printf("\n\nDo you want another transaction?\nPress 1 to proceed and 2 to exit\n\n"); 
      scanf("%d", &anotherTransaction); 
      if(anotherTransaction == 1){
        // call our transaction method here
        transaction();
      }
    
    break;
  }
  
}



int main(){
  
  // let's try to run our application and see if it's working, please
  
  transaction();
  
  return 0;
