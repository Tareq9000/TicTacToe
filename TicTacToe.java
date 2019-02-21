import java.util.Scanner;
public class TicTacToe {

Scanner scan = new Scanner(System.in);	
	
	public static void main(String[] args) {
		TicTacToe program = new TicTacToe();
        program.run();
		
	}
	
    char[][] feld = {
    				{'_','_','_'},
    				{'_','_','_'},
    				{'_','_','_'}
    				};
    

    int zahl = 0;
    int zahl1 = 0;
    int i = 0;

    public void run() {
    	
    	do {
        	spieler1();	
        	spieler2();
        	ansprechenX();	
        	ansprechenO();
        	
        	for(int i = 0; i < feld.length; i++) {
    			for(int j = 0;j < feld[0].length; j++) {
    				System.out.print(feld[i][j]);
    				feld[i][j] = '_';
    			}	 
    			System.out.println();	 
        	}
    	}while(i == 0);


 }
    	 
    
    public void spieler1()	{
    	System.out.println("---Spieler 1---");
    	System.out.println("Geben Sie die Zahl Ihres Feldes ein \\(> - <)/ (1 - 9) > ");
    	zahl = scan.nextInt();
    }
    
    public void spieler2() {
    	System.out.println("---Spieler 2---");
    	System.out.println("Geben Sie die Zahl Ihres Feldes ein \\(> - <)/ (1 - 9) > ");
    	zahl1 = scan.nextInt();
    }
    
    
    
    
    public void ansprechenX()	{
        
    	
    	if(zahl == 1)
    	{
    		feld[0][0] = 'X';
    	}
    	else if(zahl == 2)
    	{
    		feld[0][1] = 'X';
    	}
    	else if(zahl == 3)
    	{
    		feld[0][2] = 'X';
    	}
    	else if(zahl == 4)
    	{
    		feld[1][0] = 'X';
    	}
    	else if(zahl == 5)
    	{
    		feld[1][1] = 'X';
    	}
    	else if(zahl == 6)
    	{
    		feld[1][2] = 'X';
    	}
    	else if(zahl == 7)
    	{
    		feld[2][0] = 'X';
    	}
    	else if(zahl == 8)
    	{
    		feld[2][1] = 'X';
    	}
    	else if(zahl == 7)
    	{
    		feld[2][0] = 'X';
    	}
    	else if(zahl == 8)
    	{
    		feld[2][1] = 'X';
    	}
    	else if(zahl == 9)
    	{
    		feld[2][2] = 'X';
    	}
    }
    
    public void ansprechenO()	{
        
    	
    	if(zahl1 == 1)
    	{
    		feld[0][0] = 'O';
    	}
    	if(zahl1 == 2)
    	{
    		feld[0][1] = 'O';
    	}
    	if(zahl1 == 3)
    	{
    		feld[0][2] = 'O';
    	}
    	if(zahl1 == 4)
    	{
    		feld[1][0] = 'O';
    	}
    	if(zahl1 == 5)
    	{
    		feld[1][1] = 'O';
    	}
    	if(zahl1 == 6)
    	{
    		feld[1][2] = 'O';
    	}
    	if(zahl1 == 7)
    	{
    		feld[2][0] = 'O';
    	}
     	if(zahl1 == 8)
    	{
    		feld[2][1] = 'O';
    	}
     	if(zahl1 == 7)
    	{
    		feld[2][0] = 'O';
    	}
     	if(zahl1 == 8)
    	{
    		feld[2][1] = 'O';
    	}
     	if(zahl1 == 9)
    	{
    		feld[2][2] = 'O';
    	}
    }
    
      
}
