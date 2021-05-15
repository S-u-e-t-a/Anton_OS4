package konarparti;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    private static ArrayList<Integer> amountfResources = new ArrayList<> (Arrays.asList(4, 4, 4, 4));  //предоставлено процессу А
    private static ArrayList<String> nameOfProcess = new ArrayList<> (Arrays.asList ("A", "B", "C", "D" ));

    private static ArrayList<Integer> AprocessProvided = new ArrayList<> (Arrays.asList (2, 0, 0, 0));  //предоставлено процессу А
    private static ArrayList<Integer> BprocessProvided = new ArrayList<> (Arrays.asList (2, 2, 0, 0 ));  //предоставлено процессу B
    private static ArrayList<Integer> CprocessProvided = new ArrayList<> (Arrays.asList (0, 2, 2, 0 ));  //предоставлено процессу C
    private static ArrayList<Integer> DprocessProvided = new ArrayList<> (Arrays.asList (0, 0, 2, 2 ));  //предоставлено процессу D

    private static ArrayList<Integer> AprocessRequire = new ArrayList<> (Arrays.asList (2, 0, 2, 2) );  //предоставлено процессу А
    private static ArrayList<Integer> BprocessRequire = new ArrayList<> (Arrays.asList (2, 2, 2, 2 ));  //предоставлено процессу B
    private static ArrayList<Integer> CprocessRrequire = new ArrayList<> (Arrays.asList (2, 4, 2, 4 ));  //предоставлено процессу C
    private static ArrayList<Integer> DprocessRrequire = new ArrayList<> (Arrays.asList (0, 0, 2, 4 ));  //предоставлено процессу D

    public static void showArrays(ArrayList<Integer> list){
        for(int i = 0; i< list.size(); i++)
        {
            System.out.print(list.get(i) + "  ");
        }
        System.out.print("  ");
    }

    public static void main(String[] args) {
        ArrayList<Integer> availResources = new  ArrayList<>(amountfResources.size());
        System.out.println("В системе имеются 4 одинаковых ресурсов R1, 4 одинаковых ресурсов R2, 4 одинаковых ресурсов R3 и 4 одинаковых ресурсов R4.");
        System.out.println("   Предоставлено Максимальная");
        System.out.println("   ресурсов      потребность");
        System.out.println("   R1 R2 R3 R4   R1 R2 R3 R4");

        System.out.print("A  ");
        showArrays(AprocessProvided);
        showArrays(AprocessRequire);
        System.out.println();

        System.out.print("B  ");
        showArrays(BprocessProvided);
        showArrays(BprocessRequire);
        System.out.println();

        System.out.print("C  ");
        showArrays(CprocessProvided);
        showArrays(CprocessRrequire);
        System.out.println();

        System.out.print("D  ");
        showArrays(DprocessProvided);
        showArrays(DprocessRrequire);
        System.out.println();

        // тут как бы нужно сделать основной алгоритм
    }
}
