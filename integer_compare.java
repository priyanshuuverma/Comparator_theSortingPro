class MyComparator implements Comparator<Integer>{
  @Override
  public int compare(Integer o1, Integer o2){
    return o1-o2;
  }
} 
public class Main {
    public static void main(String[] args) {
      ArrayList<Integer> arr = new ArrayList<>();
      arr.add(1);
      arr.add(5);
      arr.add(0);
      arr.add(4);
      System.out.println(arr);
      arr.sort(new MyComparator());   //passed null so it sorted it in a assending order
      System.out.println(arr);
      }
}
