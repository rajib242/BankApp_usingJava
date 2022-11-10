import java.util.Scanner;


public class BankingApp{
	public static void main(String[] args){
	    //  Scanner input =new Scanner(System.in);
	    //   System.out.println("Enter your Name");
	      BankAccount obj1=new BankAccount("Rajib Santra",01);
	    //  BankAccount obj2=new BankAccount("Satyam Kumar",02);

	      obj1.ShowMenu();
	     // obj2.ShowMenu();
    }
}
class BankAccount{
	double Balance;
	double previousTransaction;
    String Cusname;
    double Cusid;


    BankAccount(String Cusname, double Cusid){
    	        this.Cusname=Cusname;
    	        this.Cusid =Cusid;
    }


	void deposit(double amount){
         if(amount!=0){            //500
         	Balance+=amount;
         	previousTransaction=amount;
         }     
	}
	void Withdrawl(double amount){
          if(amount!=0){
          	Balance-=amount;
          	previousTransaction=amount;
          }
	}

	void getPreTrans(){
		if(previousTransaction>0){
			System.out.println("Deposit Money "+ previousTransaction);
		}
		else if(previousTransaction<0){
			System.out.println("Withdrawl "+ Math.abs(previousTransaction));
		}
		else{
			System.out.println("No transaction Available");
		}
	}
	void ShowMenu(){
		int opt=1;
		Scanner input=new Scanner(System.in);

		System.out.println("Welcome "+ Cusname);
		System.out.println ("Your Id: "+ Cusid);
		System.out.println();
		System.out.println("1. Check Balance : ");
		System.out.println("2. Deposit : ");
		System.out.println("3. Withdrawl : ");
		System.out.println("4. Previous Transaction : ");
		System.out.println("5. Exit : ");

		while(opt!=0){
			System.out.println("<<<<<------------------------->>>>>");
			System.out.println("Enter your choice");
			int option=input.nextInt();

			switch(option){
			     case 1 :
			     	System.out.println("Balance is "+Balance);
			     	break;
			     case 2 :
			     	System.out.println("Enter the amount to deposit  : ");
			     	double amount =input.nextInt();
			     	deposit(amount);
			     	break;
			     case 3 :
                    System.out.println("Enter the amount to Withdrawl : ");
                    double withd=input.nextInt();
                    Withdrawl(withd);
                    break;
                case 4 :
                	getPreTrans();
                	break;
                case 5 :
                	System.out.println("Exit to Program:");
                	System.exit(0);

                	break;
                default:
                	System.out.println("Invalid input");
                	break;

			}
		}
	}
}