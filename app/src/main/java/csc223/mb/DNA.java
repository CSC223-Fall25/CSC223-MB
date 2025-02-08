package csc223.mb;
public class DNA {
    
    public DNA(){

    }
    public static String countNucleotides(String dna){
        int Acount = 0;
        int Ccount = 0;
        int Gcount = 0;
        int Tcount = 0;
        
        for (int i= 0; i< dna.length(); i++){
            if (dna.charAt(i) == 'A'){
                Acount += 1;
            }
            if (dna.charAt(i)== 'C'){
                Ccount += 1;
            }
            if (dna.charAt(i)== 'G'){
                Gcount += 1;
            }
            if (dna.charAt(i)== 'T'){
                Tcount +=1;
            }
        
        }
       return String.format(" %d  %d  %d  %d ",Acount, Ccount ,Gcount, Tcount);
    }

    
    public static String transcribe(String dna){
        return dna.replace('T', 'U');
    }
    public static String reverseComplement(String dna){
        String compDna = "";
        for (int i = dna.length()-1; i >= 0; i--){
            if (dna.charAt(i) == 'C'){
                 compDna += 'G';
            }
            if (dna.charAt(i) == 'A'){
                compDna += 'T';

            }
            if (dna.charAt(i) == 'G'){
                compDna += 'C';

            }
            if (dna.charAt(i) == 'T'){
                compDna += 'A';
            }
            
        }
        return compDna;
    }

    public static void main(String[] args){
        System.out.println(DNA.reverseComplement("ACTG"));
    } 
}
