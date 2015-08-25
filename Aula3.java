class Aula3{
        public static void main(String[] args){
            
            boolean ok = true;
            if(ok){
            System.out.println("condicao true");
            }
            
            String nome = "maria";
            if(nome.equals("maria")){
            System.out.println("condicao true 2");
            }
            
            
            int ano = 2012;
            
            if(ano%4==0 && (ano%100!=0 || ano%400==0)){
            System.out.println(ano + "eh bissexto");
            }else{
            System.out.println(ano + "Não eh bissexto");
            }
            System.out.println("------------------------");
            boolean sol = true;
            boolean dinheiro = true;
            
            if(sol){
                System.out.println("Piscina");
                if(dinheiro){
                    System.out.println("Corona");
                }else{
                    System.out.println("Minalar to liso");
                }
            }else {
                if(dinheiro){
                System.out.println("Cinema");
                }else{
                System.out.println("PopCornTime");    
                }
            }
            System.out.println("------------------------");
            int idade = 16;
            boolean amigoDono = false;
            
            if(idade<21){
            System.out.println("Voce eh menor");
                if(amigoDono){
                    System.out.println("Entra merrmo");
                }else{
                    System.out.println("Game Over");
                }
            } else if(idade>=21){
                    System.out.println("entrada liberada");    
            }
            
            System.out.println("------------------------");
            
            int diaSemana = 3;
            
            switch(diaSemana){
                case 1:
                    System.out.println("Segunda-Feira");
                    break;
                case 2:
                    System.out.println("Terca-Feira");
                    break;
                case 3:
                    System.out.println("Quarta");
                    break;
                case 4:
                    System.out.println("Quinta");
                    break;
                case 5:
                    System.out.println("Sexta");
                    break;
                default:
                    System.out.println("Dia invalido");
                    break;
            }
            
            System.out.println("-------------------while");
            int x = 1;
            while(x<=10){
                System.out.println("O valor de i eh: " + x++);
            }
            
            System.out.println("-------------------do-while");
            int i2 = 1;
            do{
            System.out.println("O valor de i eh: " + i2++);
            }while(i2<=10);

            System.out.println("-------------------for---");
            for(int i=0; i<5; i++){
            System.out.println("O valor do for eh"+i);
            }
            
            
            System.out.println("-------------------6.9---");
            int y4 = 0;
            while (y4++<5){
                System.out.println("y"+y4);
                switch (y4%2){
                default:
                    System.out.println("default");
                    break;
                case 1:
                    System.out.println("1");
                    break;
                }
            }
            
            
            
        }        
}