package smoothSailing;

public class SortByHeight {

    public int[] solution(int[] a) {
        int numbersOfPeople = 0;
        // bucle para calcular el número de "personas"
        for (int i = 0; i < a.length; i++){
            if (a[i] != -1){
                numbersOfPeople += 1;
            }
        }

        int[] people = new int[numbersOfPeople];
        int index = 0;
        // se mete en el nuevo array todos los numeros menos los "arboles"
        for (int i = 0; i < a.length; i++){
            if (a[i] != -1){
                people[index] = a[i];
                index += 1;
            }
        }
        // se ordena el nuevo array
        for (int i = 1; i < people.length; i++){
            for (int j = 0; j < people.length - i; j++){
                if (people[j] > people[j+1]){
                    int value = people[j+1];
                    people[j+1] = people[j];
                    people[j] = value;
                }
            }
        }
        index = 0;
        // se introduce en el array original los numeros ya ordenados
        for (int i = 0; i < a.length; i++){
            if (a[i] != -1){
                a[i] = people[index];
                index += 1;
            }
        }
        return a;
    }
}
