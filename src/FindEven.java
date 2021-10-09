public class FindEven {

    public static void main(String[] args) {

        int count =1;
        int end = 10;

        while (count <= end) {
            System.out.println("bin in der Schleife");
            if (count % 2 == 0) {
                System.out.println("bin gerade: " + count);
            }

            count ++;
        }

        for (int i = 1; i <= 10; i++){
            System.out.println("Ich bin Durchlauf Nummer: " + i);
        }

    }


}
