package Training;

public class XNhoNhi {
	public static void main(String[] args) {
	int[] array = {0,2,4,7,3,6,5,9,8};		
	int max = array[0], almostMax = 0, min = array[0], almostMin = 0;		
	for(int i = 0; i < array.length; i ++) {		        
			if(array[i] > almostMax) {		            
				if(array[i] > max) {		               
					almostMax = max;		              
					max = array[i];		            
				} else {		               
					almostMax = array[i];		         
				}		      
			} else {		   
				if(almostMax >= max) {		    
					almostMax = array[i];		    
				}		      
			}		     
			if(array[i] < almostMin) {		     
				if(array[i] < min) {		      
					almostMin = min;		        
					min = array[i];		           
				} else {		             
					almostMin = array[i];		    
				}		       
			} else {		
				if(almostMin <= min) {		        
					almostMin = array[i];		     
				}		     
			}	
		}
		System.out.println("phan tu lon thu 2 la: " + almostMax);		
		System.out.println("phan tu nho thu 2 la: " + almostMin);
	}
	

}
