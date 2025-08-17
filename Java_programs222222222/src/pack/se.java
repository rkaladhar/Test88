package pack;

public class se
{
  public static void main(String args[ ])
  {
    String tmp = "This is a string";
    System.out.println("Length of the string: " + tmp.length());
    System.out.println(tmp.substring(5,9));
    //System.out.println(tmp.substring(8,17));

    Object o[ ] = new String[3];
    o[0] = new Float(123.8f);

    System.out.println(o[0]);
  }
}