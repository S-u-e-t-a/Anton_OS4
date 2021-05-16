package konarparti;

import java.util.ArrayList;
import java.util.Arrays;

public class Resources {
    public ArrayList<Integer> amountofResources = new ArrayList<> (Arrays.asList(4, 4, 4, 4));  //предоставлено процессу А
    public ArrayList<String> nameOfProcess = new ArrayList<> (Arrays.asList ("A", "B", "C", "D" ));

    public ArrayList<Integer> AprocessProvided = new ArrayList<> (Arrays.asList (2, 0, 0, 0));  //предоставлено процессу А
    public ArrayList<Integer> BprocessProvided = new ArrayList<> (Arrays.asList (2, 2, 0, 0 ));  //предоставлено процессу B
    public ArrayList<Integer> CprocessProvided = new ArrayList<> (Arrays.asList (0, 2, 2, 0 ));  //предоставлено процессу C
    public ArrayList<Integer> DprocessProvided = new ArrayList<> (Arrays.asList (0, 0, 2, 2 ));  //предоставлено процессу D

    public ArrayList<Integer> AprocessRequire = new ArrayList<> (Arrays.asList (2, 0, 2, 2) );  //предоставлено процессу А
    public ArrayList<Integer> BprocessRequire = new ArrayList<> (Arrays.asList (2, 2, 2, 2 ));  //предоставлено процессу B
    public ArrayList<Integer> CprocessRrequire = new ArrayList<> (Arrays.asList (2, 4, 2, 4 ));  //предоставлено процессу C
    public ArrayList<Integer> DprocessRrequire = new ArrayList<> (Arrays.asList (0, 0, 2, 4 ));  //предоставлено процессу D

    public ArrayList<Integer> availResources = new  ArrayList<>(amountofResources.size()); // доступные ресурсы
}
