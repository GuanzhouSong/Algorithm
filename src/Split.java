public class Split {

  public static void split() {
    String str = "330103196809061325";
    String strs="";
    strs=str.replaceAll("(\\d{4})\\d{10}(\\w{4})","$1*****$2");
    System.out.println(strs);
  }

  public static void main(String args[]) {
    split();
  }
}
