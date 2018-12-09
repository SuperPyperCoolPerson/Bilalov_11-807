public class CrashTest03 {
    public static void main(String[] args) {
        Live(5, 7, 56, 56);
    }


      static void Live(int x, int y, int ... array) {
          int с = x + y;
          int pop = 1;
          for (int z: array) {
              pop =  pop * z + с;
          }
          int all = pop + с ;
            System.out.println(all);

        }
    }

