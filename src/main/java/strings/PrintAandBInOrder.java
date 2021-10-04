package strings;

public class PrintAandBInOrder {
    public void printInOrder(int numberOfAs, int numberOfBs) {
        int count = 0;
        Boolean flag = true;
        int diff = Math.abs(numberOfAs - numberOfBs);
        if (diff < 3) {
            if (numberOfAs < numberOfBs) {
                flag = true;
                for (int i = 0; i < numberOfAs; i++) {
                    System.out.print("a");
                    System.out.print("b");
                    count++;
                }
            } else {
                flag = false;
                for (int i = 0; i < numberOfBs; i++) {
                    System.out.print("a");
                    System.out.print("b");
                    count++;
                }
            }
            if (flag) {
                int x = numberOfBs - count;
                while (x > 0) {
                    System.out.print("b");
                    x--;
                }
            } else {
                int x = numberOfAs - count;
                while (x > 0) {
                    System.out.print("a");
                    x--;
                }
            }
        }else{
            int min = Math.min(numberOfBs, numberOfAs);
            int max = Math.max(numberOfBs, numberOfAs);
            while (min>0 && max>0){
                System.out.print("bb");
                System.out.print("a");
                min--;
                max=max-2;
            }
            System.out.print("bb");
        }
    }

    public static void main(String[] args) {
        PrintAandBInOrder printAandBInOrder = new PrintAandBInOrder();
        printAandBInOrder.printInOrder(3, 7);
    }
}
