class Operadores2{
        public static void main(String[] args){
            
            String mensagem= "O numero eh: ";
            int numero = 15;
            int resto = numero %2;
            
            mensagem +=(resto==0)?"par":"Impar";
            System.out.println(mensagem);
            
            boolean c = true;
            String str = (c=!c)?(c=!c)?"Hello":"hello":(c=!c)?"world":"World";
            System.out.println(str);
            
            
            
            
        }        
}