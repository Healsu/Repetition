public class MainExercise4 {

    public static void main(String[] args) {
        int subtract = 0;
        int increase = 0;
        int population = 331002651;

        //Got very lazy on this one
        for (int i = 0; i < 157784630; i++) {
            subtract += 1;
            increase += 1;
            if (increase >= 7) {

            population += 1;
            increase = 0;
        }

        if (subtract >= 14) {
            population -= 1;
            subtract = 0;

        }
        if (i == 31556926){
            System.out.println("Year 1, current population: "+population);
        }
        else if (i == 31556926*2){
            System.out.println("Year 2, current population: "+population);
        }
        else if (i == 31556926*3){
            System.out.println("Year 3, current population: "+population);
        }
        else if (i == 31556926*4){
            System.out.println("Year 4, current population: "+population);
        }
        else if (i == 31556926*5){
            System.out.println("Year 5, current population: "+population);
        }
    }

    }
        
    }

