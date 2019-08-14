package md.tekwill.demo.loop;

class LabelsBreakDemo {
    public static void main(String[] args) {

        // 0 example
        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 5; j++){
                System.out.println( i + " / " + j);
                if(j == 2)
                    break;
            }
            System.out.println();
        }
        System.out.println("------------------");

        // first example
        for(int i = 0; i < 5; i++){
            outer:
            for(int j = 0; j < 5; j++){
                System.out.println( i + " / " + j);
                if(j == 2)
                    break outer;
            }
            System.out.println();
        }

        System.out.println("------------------");

        // second example
        outer:
        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 5; j++){
                System.out.println( i + " / " + j);
                if(j == 2)
                    break outer;
            }
            System.out.println();
        }

        System.out.println("------------------");

        // third example
        for(int i = 0, j = 0; i < 5; i++){
            if(j == 2)
                break;
            for(j = 0; j < 5; j++){
                System.out.println( i + " / " + j);
                if(j == 2)
                    break;
            }
            System.out.println();
        }

        System.out.println("------------------");



    }
}
