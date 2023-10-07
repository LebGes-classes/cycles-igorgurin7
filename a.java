import java.util.*;

import static java.lang.Math.pow;

public class a {
 public static void main(String[] args) {
 for(int i=10;i<100;i++){
  if((pow(fa(i),2)+pow(fb(i),2))%17==0){
   System.out.println(i);
  }
 }
 }

 public static int fa(int i) {
  int a = 0;
  a += i % 10;
  return a;
 }
 public static int fb(int i) {
  int b = 0;
  i=i/10;
  b+=i%10;
  return b;
 }
}