class MyComparator implements Comparator<String>{
  @Override
  public int compare(String o1, String o2){
    return o1.length() - o2.length();
  }
} 
public class Main {
    public static void main(String[] args) {
      ArrayList<String> arr = new ArrayList<>();
      arr.add("banana");
      arr.add("okey");
      arr.add("Mango");
      arr.add("bye");
      System.out.println(arr);
      arr.sort(new MyComparator());   //passed null so it sorted it in a assending order
      System.out.println(arr);
      }
}
