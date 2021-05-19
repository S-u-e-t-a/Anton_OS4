package konarparti;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void showArrays(ArrayList<Integer> list){
        for(int i = 0; i< list.size(); i++)
        {
            System.out.print(list.get(i) + "  ");
        }
        System.out.print("  ");
    }

    public static ArrayList<Integer> SearchFreeRes(Resources res){
        System.out.println("Оставшиеся свободные ресурсы: ");
        System.out.print("   ");
        for (int i = 0; i < 4; i++){
            res.availResources.add(res.amountofResources.get(i) - (res.AprocessProvided.get(i) + res.BprocessProvided.get(i) + res.CprocessProvided.get(i) + res.DprocessProvided.get(i)));
            System.out.print(res.availResources.get(i) + "  ");
        }
        System.out.println();
        return res.availResources;
    }

    public static boolean CheckLaunchProc(Resources res, ArrayList<Integer> processProvided, ArrayList<Integer> processRequire){
        ArrayList<Integer> temp = new ArrayList<Integer>();

        for(int i = 0; i < processRequire.size(); i++){
            temp.add(processProvided.get(i) + res.availResources.get(i));
        }
        for(int i = 0; i < temp.size(); i++){
            if(temp.get(i) < processRequire.get(i)){
                return false;
            }
        }
        res.availResources.clear();
        for (var i: temp) {
            res.availResources.add(i);
        }
        return true;
    }

    public static void main(String[] args) {
        Resources res = new Resources();

        System.out.println("В системе имеются 4 одинаковых ресурсов R1, " +
                "4 одинаковых ресурсов R2, " +
                "4 одинаковых ресурсов R3 и 4 одинаковых ресурсов R4.");
        System.out.println("   Предоставлено Максимум");
        System.out.println("   R1 R2 R3 R4   R1 R2 R3 R4");

        System.out.print("A  ");
        showArrays(res.AprocessProvided);
        showArrays(res.AprocessRequire);
        System.out.println();

        System.out.print("B  ");
        showArrays(res.BprocessProvided);
        showArrays(res.BprocessRequire);
        System.out.println();

        System.out.print("C  ");
        showArrays(res.CprocessProvided);
        showArrays(res.CprocessRrequire);
        System.out.println();

        System.out.print("D  ");
        showArrays(res.DprocessProvided);
        showArrays(res.DprocessRrequire);
        System.out.println();

        res.availResources = SearchFreeRes(res);

        ArrayList<ArrayList<Integer>> processProvided = new ArrayList<ArrayList<Integer>>();
        processProvided.add(res.AprocessProvided); processProvided.add(res.BprocessProvided); processProvided.add(res.CprocessProvided); processProvided.add(res.DprocessProvided);

        ArrayList<ArrayList<Integer>> processRequire = new ArrayList<ArrayList<Integer>>();
        processRequire.add(res.AprocessRequire); processRequire.add(res.BprocessRequire); processRequire.add(res.CprocessRrequire); processRequire.add(res.DprocessRrequire);

        for(int i = 0; i < processProvided.size(); i++){
            if(CheckLaunchProc(res, processProvided.get(i), processRequire.get(i))){
                System.out.println(res.nameOfProcess.get(i) + " процесс завершен");
                System.out.print("Свободные ресурсы на данный момент ");
                for(int j = 0; j < res.availResources.size(); j++)
                {
                    System.out.print(res.availResources.get(j) + " ");
                }
                System.out.println();
                processRequire.remove(i);
                processProvided.remove(i);
                res.nameOfProcess.remove(i);
                i = -1;
            }
        }
        if(res.nameOfProcess.isEmpty()){
            System.out.println("Состояние является безопасным");
        }
        else{
            System.out.println("Состояние не является безопасным");
        }

    }
}
