package StringPractices;

public class Example_2 {
    
    public static void main(String[] args) {
        
        String Ta = "A";
        Ta = Ta.concat("B");
        String Tb = "C";
        Ta = Ta.concat(Tb);
        Ta.replace('C', 'D');
        Ta = Ta.concat(Tb);
        System.out.println(Ta);
    }
}
