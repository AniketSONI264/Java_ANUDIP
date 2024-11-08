// \Null Pointer Exception

// Question: Write a method that takes a string as input and returns its length. Handle the NullPointerException in case a null string is passed to the method, and return -1 if the string is null.
// Hint: A try-catch block can help here, or you can use an if-check before calling .length() to avoid the exception entirely.

class nullPt{
  public static int getStr(String str){
      try{
          int l= str.length();
          return l;
      } catch(Exception e){
          System.out.println(e);
      }
      return 0;
  }
  
  public static void main(String[] args){
      String str1 ="Aniket", str2 = null;
      System.out.println(getStr(str1));
      System.out.println(getStr(str2));
  }
}