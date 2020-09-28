
package abdelmalek.brakena;


import java.util.Scanner;
 class matrix extends malk{
    
    
    
    
    
    
    
     public double[][] addnomber(double val){
	        double e[][]=new double [nline][column];
for (int i=0 ; i < nline ; i++){
			for (int j=0 ; j < column ; j++){
	e[i][j]=matrice [i][j]+val;

}}
	
	return e;
    }
    
    public double[][] multinomber(double val){
	        double ek[][]=new double [nline][column];
for (int i=0 ; i < nline ; i++){
			for (int j=0 ; j < column ; j++){
	ek[i][j]=matrice [i][j]*val;

}}
	
	return ek;
    }
      
    
    
    
    
    
    
    
    
public static void afficheMatrice(double matrice[][]){
		for (int i=0 ; i < matrice.length ; i++){
			for (int j=0 ; j < matrice[0].length ; j++)
				
					System.out.print("  " + matrice[i][j]) ;
			
			
			System.out.println();
		}
	}
public double[][] sommeMatrices(int nbcol,int nbnl, double[][] b)  {
    	double[][] ee = new double[nline][column];

		if(nbcol!=nline ||nbnl!=column){
		           System.out.println("erurr ");
}
                else{		
	for (int i = 0; i< nline; i++) {
	    for ( int j = 0; j< column; j++) {
		ee[i][j] = matrice[i][j] + b[i][j];
            } }
	}
   		return ee;
 }
		
	
	
	
    
 public double[][] produitMatrice(int nbcol,int nbnl, double[][] b){
     	double [][] eee = new double[nline][column];

		if(nbcol!=nline ||nbnl!=column){
		           System.out.println("erurr ");
}
                else{
		
	double val   = 0;
	for (int i = 0; i< nline; i++) {
	    for ( int j = 0; j< column; j++) {
		for ( int k = 0; k< column; k++) {
		    val = matrice[k][j] * b[j][k] + val;
		}
		eee[i][j] = val;
	    }
	}
    }
	return eee;

}}
 class    malk   {
    
    
    int nline;
   int column;   
  double matrice[][];
 private String nom ;
 public malk(){
     //intialise
 this.nline=1;
 this.column=1;
 for (int i=0 ; i < nline ; i++){
			for (int j=0 ; j < column ; j++){
matrice[i][j]=0;

}}
 
 }
    public malk(int nline,int column,double matrice[][],String nom){
   this.nline=nline;
   this.column=column;
    this.matrice=matrice;
    this.nom=nom;
    }   
 public int getnline(){
     
     return nline ;
     
     }
  public double getdata(int i,int j){
     double val= matrice[i][j];
     return val ;
     
     }
  public String getnom(){
     
     return nom ;
     
     }
      public double[][] setElem(int i, int j, double val){
	
	this.matrice [i][j]=val;
	return matrice;
    }
      
      public int getcolumn(){
    
     return column ;
     }





}
        



public class AbdelmalekBrakena {

    
    public static void main(String[] args) {
       int Ligne, Colonne;
        Scanner input = new Scanner(System.in);
        System.out.println("le nom de la matrice: ") ;
       String nom = input.nextLine();
           System.out.println("Nombre de lignes: ") ;
        Ligne = input.nextInt() ;
		System.out.println("Nombre de colonnes: ") ;
        Colonne = input.nextInt() ;
        
        double matrice[][]=new double [Ligne][Colonne];
		for (int i=0 ; i < Ligne ; i++){
			for (int j=0 ; j < Colonne ; j++){
		           System.out.println("données la valeur ["+i+"]"+"["+j+"]") ;
matrice[i][j]=input.nextDouble();

}}
                malk mat=new malk(Ligne,Colonne,matrice,nom) ;
                matrix matix=new matrix() ;
  System.out.println("choisise la devise a exécuter ") ;
                    System.out.println("____________________________________________________________________________________________________________________________ ") ;

                    System.out.println("informations sur la matrice entrer'1' ") ;
           System.out.println("renvoie la valeur d'une cellule du la matrice entrer'2' ") ;
           System.out.println("ajouter et modifier la valeur d'une cellule du la matriceentrer'3'  ") ;
           System.out.println("affiche la matrice entrer '4' ") ;
                      System.out.println("faire l' addition avec un auter matrice ou nomber entrer '5' ") ;
           System.out.println("faire la multi avec un auter matrice ou avec un nomber '6' ") ;

                  System.out.println("____________________________________________________________________________________________________________________________ ") ;
       int choi; 
  choi=input.nextInt();
           
           

switch(choi) {

    case 1:
                               System.out.println("colonne: "+ mat.getnom()) ;
                       System.out.println(mat.getnline()+":ligne ") ;
                       System.out.println(mat.getcolumn()+":colonne ") ;
matrix.afficheMatrice(matrice);

        break;

    case 2:
           int ii;
           int jj;
           System.out.println("données l'indece de cellule (i-j)") ;
           
         ii = input.nextInt() ;
         jj = input.nextInt() ;
               if(matrice!=null && ii<Ligne &&  jj< Colonne){
                   
                                       System.out.println("la valuer de la case["+ii+"]["+jj+"]="+mat.getdata(ii, jj)) ;
           }
               else{
                                    System.out.println("errurr la case n'exsiste pas ou la matrice vide") ;
               }
  
        break;

case 3:
     int ir ;
           int jr ;
           System.out.println("données l'indece de cellule a modifier (i-j)") ;
           ir = input.nextInt() ;
         jr = input.nextInt() ;
      if(ir < Ligne && jr <Colonne){
                              System.out.println("données la valuer de cellule ") ;
    double     vale = input.nextDouble();

                                       mat.setElem(ir, jr, vale) ;
                                       
           }
               else{
                                    System.out.println("errurr la case n'exsiste pas ou la matrice vide") ;
               }
        break;


case 4:
    matrix.afficheMatrice(matrice);

        break;
        

        case 5:
                                          System.out.println("l'addition avec un nomber enter'1' ") ;
                                          System.out.println("l'addition avec un matrice enter'2' ") ;
int uu=input.nextInt();
                        if(uu== 1){
                         System.out.println("données la valuer de l' addition ") ;
    double     va = input.nextDouble();
                     
                System.out.println("la l'addition  de la matrice avec un nomber :\n "+   matix.addnomber( va)) ;
                        }
                        else {if(uu==2){
 System.out.println("Nombre de lignes de la 2eme matrice: ") ;
    int    nbln = input.nextInt() ;
		System.out.println("Nombre de colonnes de la 2eme matrice: ") ;
      int nbcol = input.nextInt() ;
                         double ee[][]=new double [nbln][nbcol];
		for (int i=0 ; i < Ligne ; i++){
			for (int j=0 ; j < Colonne ; j++){
		           System.out.println("données la valeur ["+i+"]"+"["+j+"]") ;
ee[i][j]=input.nextDouble();

}} 
  System.out.println("la l'addition  de  les deux matrices :\n "+matix.sommeMatrices(nbcol, nbcol, ee)) ;

                        }
                        else{
                        		           System.out.println("erurr ");

                        }
                        }

        break;
        
        case 6:
 System.out.println("la multi avec un nomber enter'1' ") ;
     System.out.println("la multi avec un matrice enter'2' ") ;
     int kk=input.nextInt();
                        if(kk== 1){
                        System.out.println("données la valuer de la multi  ") ;
    double     vr = input.nextDouble();
                     
                System.out.println("la multi  de la matrice avec le nomber : "+vr+"=\n" +  matix.multinomber( vr)) ;
                        
                        
                        }
                        else {if(kk==2){
                            
                          System.out.println("Nombre de lignes de la 2eme matrice: ") ;
    int    nblnn = input.nextInt() ;
		System.out.println("Nombre de colonnes de la 2eme matrice: ") ;
      int nbcoll = input.nextInt() ;  
                        double ek[][]=new double [nblnn][nbcoll];
		for (int i=0 ; i < Ligne ; i++){
			for (int j=0 ; j < Colonne ; j++){
		           System.out.println("données la valeur ["+i+"]"+"["+j+"]") ;
ek[i][j]=input.nextDouble();

}} 
  System.out.println("la l'addition  de  les deux matrices :\n "+matix.produitMatrice(nbcoll, nblnn, ek)) ;    
                        }
                        else{
                          System.out.println("erurr ");

                        }
                        }
        break;
        

        

    default:
        // Statements
        break;

}

        
        
              
        //create un opject
         
        
  
   
   
   
    }
        
        
        
        
        
        
    }
    


