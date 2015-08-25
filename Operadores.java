class Operadores{
        public static void main(String[] args){
        
            boolean ok = true;
            System.out.println(ok);
            
            boolean notOk = !ok;
            System.out.println(notOk);
            
            int x = 5;
            System.out.println(x++);//5
            
            int y = 5;
            System.out.println(y--);//5
            
            int w = 5;
            System.out.println(++w);//6
            
            int z = 5;
            System.out.println(--z);//4
            
            int a = +3; //mesmo que 3
            System.out.println(a);
            int b = -3;
            System.out.println(b);
            
            int cx = ~7;//soma +1, inverte o sinal
            System.out.println(cx);
            System.out.println("------------------");
            
            double d = 125;
            System.out.println(d);
            char c = 214;
            System.out.println(c);
            short s = 'a';
            System.out.println(s);
            byte b2 = 'a';
            System.out.println(b2);
            
            int i = (int) 5658.0f;
            System.out.println(i);
            System.out.println("------------------");
            
            byte bb = -127;
            int inteiro = 12;
            char caractere = 'f';
            long numeroLong = 901;
            float numeroFloat = 990.99f;
            double numeroDouble = 90.98;
            
            System.out.println(bb);
            System.out.println(inteiro);
            System.out.println(caractere);
            System.out.println(numeroLong);
            System.out.println(numeroFloat);
            System.out.println(numeroDouble);
            System.out.println("--------###---------");
            inteiro = caractere;
            System.out.println(inteiro);
            
            inteiro = bb;
            System.out.println(inteiro);
            
            inteiro = (int) numeroFloat;
            System.out.println(inteiro);

            b = (byte) inteiro;
            System.out.println(b);
            
            
            
        }
}