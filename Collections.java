import java.util.*;
public class Collections {

   public static void main(String[] args) {
      ArrayList<String> a = new ArrayList<String>();
      a.add("1");
      a.add("2");
      a.add("3");
      System.out.println("ArrayList: " + a);
      
      LinkedList<String> l = new LinkedList<String>();
      l.add("1");
      l.add("2");
      l.add("3");
      System.out.println("LinkedList: " + l);
      
      l.addFirst("4");
      l.addLast("2");
      l.add(3, "4");
      
      System.out.println("LinkedList changes: " + l);
      
      l.remove("2");
      System.out.println("LinkedList after removing: " + l);

      HashSet<String> s = new HashSet<String>(); 
      s.add("1");
      s.add("2");
      s.add("3");
      System.out.println("HashSet: " + s);
      
      s.removeAll(s);
      System.out.println("HashSet after removing all: " + s);
      
      s.remove("4");
      System.out.println("Removing an element in HashSet that is not in the set: " + s);
      
  	  HashMap<Integer, String> hm = new HashMap<Integer, String>();
	
  	  hm.put(1, "a");
  	  hm.put(2, "b");
  	  hm.put(3, "c"); 
  	  
  	  System.out.println("HashMap: " + hm);
  	  System.out.println("Get key value: " + hm.get("3"));
  	  System.out.println("Get key value: " + hm.get(3));
  	
  	  LinkedHashSet<String> lhs = new LinkedHashSet<String>();
      lhs.add("1");
      lhs.add("2");
      lhs.add("3");
      lhs.size();
      System.out.println("LinkedHashSet: " + lhs);
      System.out.println("lhs size: " + lhs.size());
      
      LinkedHashMap<String, String> lhm = new LinkedHashMap<String, String>();
      lhm.put("1", "a");
      lhm.put("2", "b");
      lhm.put("3", "c");
      System.out.println("LinkedHashMap: " + lhm);
      System.out.println("Getting keys in LinkedHashMap: " + lhm.keySet());
      System.out.println("Getting values in LinkedHashMap: " + lhm.values());
      System.out.println("LinkedHashMap empty or not: " + lhm.isEmpty());
      System.out.println("LinkedHashMap conatins key: " +lhm.containsKey("3"));

  
   }
}