import java.util.*;

public class PositiveNumbersSum {
    public static void main(String[] args) {
                System.out.println("Wprowadź liczby: ");
        try (Scanner in = new Scanner(System.in)){
            List<Double> list = getUserInput(in);
            printInReverseOrder(list);
            System.out.println(getSum(list));
            System.out.println("Największa wprowadzona wartość to : " + getMaxNumber(list));
            System.out.println("Najmniejsza wprowadzona wartość to : " + getMinNumber(list));
        } catch (InputMismatchException e){
            System.out.println("Wprowadzono złą wartość");
        }
    }

    private static double getMinNumber(List<Double> list) {
        return Collections.min(list);
    }

    private static double getMaxNumber(List<Double> list) {
        return Collections.max(list);
    }

    private static String getSum(List<Double> list) {
        double sum = 0;
        String elements = "";
        for(int i = 0; i < list.size(); i++){
            elements += list.get(i);
            if(i < list.size()-1){
                elements += "+";
            }
            sum+=list.get(i);
        }
        return elements + "=" + sum;
    }

    private static void printInReverseOrder(List<Double> list) {
        for(int i = list.size()-1; i>=0; i--){
            System.out.println(list.get(i));
        }
    }

    private static List getUserInput(Scanner in) {
        List<Double> list = new ArrayList<>();
        Double input = in.nextDouble();
        while (input >= 0){
            list.add(input);
            input = in.nextDouble();
        }
        return list;
    }
}
