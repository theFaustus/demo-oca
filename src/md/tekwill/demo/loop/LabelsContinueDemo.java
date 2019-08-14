package md.tekwill.demo.loop;

class LabelsContinueDemo {
    public static void main(String[] args) {
        // 0 example
        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 5; j++){
                if(j == 2)
                    continue;
                System.out.println( i + " / " + j);
            }
            System.out.println();
        }
        System.out.println("------------------");

        // first example
        for(int i = 0; i < 5; i++){
            outer:
            for(int j = 0; j < 5; j++){
                if(j == 2)
                    continue outer;
                System.out.println( i + " / " + j);
            }
            System.out.println();
        }

        System.out.println("------------------");

        // second example
        outer:
        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 5; j++){
                if(j == 2)
                    continue outer;
                System.out.println( i + " / " + j);
            }
            System.out.println();
        }

        System.out.println("------------------");

        // third example
        for(int i = 0, j = 0; i < 5; i++){
            if(j == 2)
                continue;
            for(j = 0; j < 5; j++){
                if(j == 2)
                    break;
                System.out.println( i + " / " + j);
            }
            System.out.println();
        }

        System.out.println("------------------");
    }
}
