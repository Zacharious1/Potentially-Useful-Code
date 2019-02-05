//Help Received: none
public class EcosystemArray {
    public static void main(String[] args) {
        String[] river = new String[30];                                                                        //creates the array
        boolean flag = false;
        for (int i = 0; i < river.length; i++) {                                                                //populates the array
            int random = (int) (1 + Math.random() * 3);
            if (random == 1)
                river[i] = "Fish";
            else if (random == 2)
                river[i] = "Bear";
            else if (random == 3)
                river[i] = null;
        }
        for (int b = 0; b < 15; b++) {
            for (int a = 0; a < river.length; a++) {
                System.out.print(river[a] + " ");
            }
            System.out.println();

            for (int i = (int) (Math.random() * 30); i < river.length; i = (int) (Math.random() * 30)) {        //Selects a random target index
                int j = (int) (1 + Math.random() * 3);
                flag = false;

                if (j == 1) {                                                                                   //Attempt to move left

                    if (i == 0)
                        break;

                    else if (river[i - 1] == null) {                                                                 //If cell is null
                        String temp = river[i];
                        river[i - 1] = temp;
                        river[i] = null;

                    } else if (river[i] != null && river[i].equals(river[i - 1])) {                                                 //If cell has same animal
                        int k = 0;
                        do {                                                                                    //Loop keeps going until it finds a null cell
                            if (river[k] == null) {
                                river[k] = river[i];
                                flag = true;
                            } else if (river[k] != null && k != 29) {
                                k++;
                            } else {
                                break;
                            }
                        } while (!flag);
                    } else if (river[i] != null && river[i].equals("Bear") && river[i - 1].equals("Fish")) {                        //If current cell is bear and target cell is a fish
                        river[i - 1] = "Bear";
                        river[i] = null;
                    } else if (river[i] != null && river[i].equals("Fish") && river[i - 1].equals("Bear")) {                        //If current cell is fish and target cell is bear
                        river[i] = null;
                    }
                } else if (j == 2) {                                                                            //Stay still
                    river[i] = river[i];
                } else if (j == 3) {                                                                            //Attempt to move right
                    if (i == 29)
                        break;

                    else if (river[i + 1] == null) {                                                                 //If cell is null
                        String temp = river[i];
                        river[i + 1] = temp;
                        river[i] = null;

                    } else if (river[i] != null && river[i].equals(river[i + 1])) {                                                 //If cell has same animal
                        int k = 0;
                        do {                                                                                    //Loop keeps going until it finds a null cell
                            if (river[k] == null) {
                                river[k] = river[i];
                                flag = true;
                            } else if (river[k] != null && k != 29) {
                                k++;
                            } else {
                                break;
                            }
                        } while (!flag);
                    } else if (river[i] != null && river[i].equals("Bear") && river[i + 1].equals("Fish")) {                        //If current cell is bear and target cell is a fish
                        river[i + 1] = "Bear";
                        river[i] = null;
                    } else if (river[i] != null && river[i].equals("Fish") && river[i + 1].equals("Bear")) {                        //If current cell is fish and target cell is bear
                        river[i] = null;
                    }
                }
            }
        }
    }
}
