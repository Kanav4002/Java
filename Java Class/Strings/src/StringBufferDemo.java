public class StringBufferDemo {
  public static void main(String[] args) {
    StringBuffer sb = new StringBuffer("abcde");
    // append 
    sb.append((String)null);

    // length
    sb.length();

    // charAt
    sb.charAt(0);

    // setChar
    sb.setCharAt(0, '1');

    // insert 
    sb.insert(0, 0);

    // substring
    sb.substring(0);
    sb.substring(0, 1);

    // delete char 
    sb.deleteCharAt(0);

    // delete substring
    sb.delete(0, 1);

    // replace substring
    sb.replace(0, 0, "Hello");

    // convert string buffer to string
    sb.toString();

    // convert string to stringBuffer
    String str = "hello";
    sb = new StringBuffer(str);

    System.out.println(sb);

  }
}
