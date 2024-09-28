package search_algorithms;

public class BinarySearch {

    public static void main(String[] args) {
        int[] idsClientes = {101, 203, 345, 456, 567, 678, 789, 890, 901};
        int idProcurado = 567;

        int resultado = binarySearch(idsClientes, idProcurado);

        if(resultado == -1){
            System.out.println("Cliente com ID " + idProcurado + " não encontrado.");
        }else{
            System.out.println("Cliente com ID " + idProcurado + " encontrado na posição " + resultado + ".");
        }
    }

    public static int binarySearch(int[] array, int value){
        int start = 0;
        int end = array.length - 1;

        while(start <= end){
            int quite = start + ((end - start) / 2);

            //Verificar se o valor está no meio
            if(array[quite] == value){
                return quite;
            }

            //Se o valor for maior, ignora a metade esquerda
            if(array[quite] < value){
                start = quite + 1;
            }else {
                //Se for menor, ignora a metade direita
                end = quite - 1;
            }
        }

        return -1;
    }
}
