
import Generales.clsGenerales;

public class Punto1 {
        
 static clsGenerales objG = new clsGenerales();
   
  
    public static void main(String[] args) {
    	
    	Serie();
      
    }
    
    private static void Serie()
    {
    	int Num,suma=0,R1=9,R2=8,R3=7,sw=2,New;
    	Num=validarNum();
    	New=R1;
    	R1=R1+1;
    	while(New<=Num)
    	{
    		objG.Mensaje(New + ",");
    		suma=suma+New;
    		if(sw==1)
    		{
    			New=R1;
    			R1=R1+1;
    			sw=2;
    		}else{
    			if(sw==2){
    				New=R2;
    				R2=R2+2;
    				sw=3;
    			}else{
    				New=R3;
    				R3=R3+3;
    				sw=1;
    			}
    		}
    	}
    	
    	objG.Mensaje("la suma es: " + suma);
    }
    
    private static int validarNum(){
    	int N;
    	do{
    		N=objG.leerEnteroPosMy0("Ingrese un numero mayor o igual a 9 para calcular la serie ");
    		if(N<9)
    			objG.Mensaje("Valor no valido, reintente ");
    	}while(N<9);
    		return N;
    	
    		
    }
}