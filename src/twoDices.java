public class twoDices {


        public static void main(String[] args) {
            int SIDES = 6;
            int a = (int) (Math.random() * SIDES);
            int b = (int) (Math.random() * SIDES);
            int sum = a + b;
            System.out.println(sum);
        }
    }

