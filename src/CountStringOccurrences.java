/**
 * Created by sony on 8/4/2016.
 */
import java.util.*;
import java.util.Map;
import java.util.Map.Entry;
public class CountStringOccurrences {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        //String s = in.nextLine();
        String s  = "From the moment the first immigrants arrived on these shores, generations of parents have worked hard and sacrificed whatever is necessary so that their children could have the same chances they had; or the chances they never had. Because while we could never ensure that our children would be rich or successful; while we could never be positive that they would do better than their parents, America is about making it possible to give them the chance. To give every child the opportunity to try. Education is still the foundation of this opportunity. And the most basic building block that holds that foundation together is still reading. At the dawn of the 21st century, in a world where knowledge truly is power and literacy is the skill that unlocks the gates of opportunity and success, we all have a responsibility as parents and librarians, educators and citizens, to instill in our children a love of reading so that we can give them the chance to fulfill their dreams.";
        String[] str = s.toLowerCase().replaceAll("[-+.^:,;]","").split("\\s");

        HashMap<String,Integer> map =  new HashMap<>();
        for(int i = 0; i < str.length; i++){
            if(map.containsKey(str[i])){
                map.put(str[i], map.get(str[i])+1);
            }
            else{
                map.put(str[i],1);
            }
        }
        Set<Entry<String, Integer>> set = map.entrySet();
        List<Entry<String,Integer>> list = new ArrayList<Entry<String,Integer>>(set);
        Collections.sort( list, new Comparator<Map.Entry<String, Integer>>() {
            public int compare( Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2 )
            {
                return (o2.getValue()).compareTo( o1.getValue() );
            }
        } );
        for(Map.Entry<String, Integer> entry:list){
            System.out.println(entry.getKey()+" ---- "+entry.getValue());
        }
    }
}
