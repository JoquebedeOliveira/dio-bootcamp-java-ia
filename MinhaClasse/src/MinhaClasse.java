public class MinhaClasse {

    public static void main(String[] args) {
         System.out.println("Hellou, vamos começar!!");
           
         String primeiroNome = "Joquebede";
         String segundoNome = "Oliveira";

         String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);
        
         System.out.println(nomeCompleto);

    }
    public static String nomeCompleto (String primeiroNome, String segundoNome){
        return  "Resultado do método " + primeiroNome.concat(" ").concat( segundoNome);
    }

}