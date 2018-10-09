import java.util.*;

/**
 * Islemler sınıfı içindeki 4 metodun yazılması istenmektedir
 */
public class Islemler {
    /**
     * Yığıtın elemnlarının sırasını tersine çevirir
     * @param s Tersine çevrilecek yığıt
     * @return Tersine çevirlmiş yığıtı döndürür
     */
    public static <T> Stack<T> tersCevir(Stack<T> s){
        Stack<T> sc=(Stack<T>)s.clone();
        Stack<T> r=new Stack<>();
        while (!sc.isEmpty())
            r.push(sc.pop());
        return r;
    }

    /**
     * İki yığıtın eşit olup olmadığını kontrol eder
     * @param s1 Birinci yığıt
     * @param s2 İkinci yığıt
     * @return İki yığıtın eşit olma durumunu döndürür
     */
    public static <T> boolean esit(Stack<T> s1, Stack<T> s2)
    {
        s1.equals(s2);
        Stack<T> y1=(Stack<T>)s1.clone();
        Stack<T> y2=(Stack<T>)s2.clone();
        while (!y1.isEmpty() && !y2.isEmpty())
            if(y1.pop() != y2.pop())
                return false;
        if(y1.isEmpty() && y2.isEmpty())
            return true;
        return true;
    }

    /**
     * Postfix ifadeyi değerlendirir. İşlemler tamsayılar üzerinde gerçekleşir. "7 5 /" işleminin sonucu 1'dir.
     * @param girdi Girdi ifadesi
     * @return İfadenin sonucu
     */
    public static int postfixDegerlendir(String girdi) {
        Stack<Integer> ostack=new Stack<Integer>();
        String[] gm=girdi.split(" ");
        for (String s: gm) {
            if (Character.isDigit(s.charAt(0)))
                ostack.push(Integer.parseInt(s));
            else{
                int d1=ostack.pop();
                int d2=ostack.pop();
                int sonuc=0;
                switch (s) {
                    case "+":
                        sonuc=d1+d2;
                        break;
                    case "-":
                        sonuc=d2-d1;
                        break;
                    case "*":
                        sonuc=d1*d2;
                        break;
                    case "/":
                        sonuc=d2/d1;
                        break;
                    default:
                        throw new UnsupportedOperationException("Desteklenmeyen işlem");
                }
                ostack.push(sonuc);
            }

        }
        return ostack.pop();
    }

    /**
     * Infix ifadeyi postfix'e dönüştürür.
     * @param girdi Infix girdi metni
     * @return Dönüştürülmüş postfix ifade
     */
    public static String infixToPostfix(String girdi){
        Stack<String> opstack=new Stack<>();
        Map<String, Integer> precedence=new HashMap<>();
        precedence.put("+",2);
        precedence.put("-",2);
        precedence.put("*",3);
        precedence.put("/",3);
        precedence.put("(",1);
        precedence.put(")",1);
        String[] gm=splitToTokens(girdi);
        String postfix="";
        for (String s:gm){
            if (Character.isDigit(s.charAt(0)))
                postfix+=s+" ";
            else if(s.equals("("))
                opstack.push(s);
            else if(s.equals(")")) {
                String o=opstack.pop();
                while(!o.equals("(")) {
                    postfix+=o+" ";
                    o=opstack.pop();
                }
            }
            else {
                while (!opstack.isEmpty() && precedence.get(opstack.peek())>precedence.get(s)) {
                    postfix+=opstack.pop()+" ";
                }
                opstack.push(s);
            }

        }
        while (!opstack.isEmpty())
            postfix+=opstack.pop()+" ";
        postfix=postfix.substring(0,postfix.length()-1);
        return postfix;
    }

    /**
     * Infix ifadeyi sembollerine ayıran metod
     * @param girdi Infix ifade
     * @return Sembol dizisi
     */
    private static String[] splitToTokens(String girdi)
    {
        StringTokenizer t=new StringTokenizer(girdi, "+-*/^() ",true);
        List<String> tokenList=new ArrayList<>();
        while (t.hasMoreTokens()){
            String s=t.nextToken().trim();
            if(!s.equals(""))
                tokenList.add(s);
        }
        String [] tl=new String[tokenList.size()];
        tokenList.toArray(tl);
        return tl;
    }
}
