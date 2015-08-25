class Array{
        public static void main(String[] args){

            int[] umArray = new int[5];
            umArray[0] = 1;
            umArray[1] = 10;
            umArray[2] = 29;
            umArray[3] = -5;
            umArray[4] = 13;
            
            System.out.println("tamanho " + umArray.length);
            System.out.println("Posicao " + umArray[1]);
            
            
            int[] umArray2 = {1,0,3,4,8};
            
            int[] umArray3 = new int[]{2,5,9,0,1,50,30,28,82};
            //imprimindo um array
            for(int i=0; i<umArray3.length ;i++){
            System.out.println("Posicao " + i + " Valor " + umArray3[i] );
                
            //Array bidimensional
            int[][]arrayB1 = new int [3][2];
            int arrayB2[][] = new int [3][2];
            int[] arrayB2[] = new int [3][2];
            }

        }
}