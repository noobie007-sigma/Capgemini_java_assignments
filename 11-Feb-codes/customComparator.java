interface Comparator<T> {
    int compare(T o1, T o2);
}
class IntegerCompare implements Comparator<Integer> {
    public int compare(Integer a, Integer b) {
        return a - b;
    }
}
class StringCompare implements Comparator<String> {
    public int compare(String a, String b) {
        int len = Math.min(a.length(), b.length());
        for(int i = 0; i < len; i++) {
            if(a.charAt(i) != b.charAt(i)) {
                return a.charAt(i) - b.charAt(i);
            }
        }
        return a.length() - b.length();

class customComparator {
    public static void main(String[] args) {
        Comparator<Integer> intCmp = new IntegerCompare();
        System.out.println(intCmp.compare(10, 20)); 

        Comparator<String> strCmp = new StringCompare();
        System.out.println(strCmp.compare("ABC", "BCD"));
    }
}
class UniComparator implements Comparator<T> {
    public int compare(T a, T b) {
        if(a == null && b == null) return 0;
        if(a == null) return -1;
        if(n == null) return 1;
        if(a instanceof Integer && b instanceof Integer) {
            return ((Integer)a) - ((Integer)b);
        }
        if(a instanceof String && b instanceof String) {
            String strA = (String)a;
            String strB = (String)b;
            int len = Math.min(strA.length(), strB.length());
            for(int i = 0; i < len; i++) {
                if(strA.charAt(i) != strB.charAt(i)) {
                    return strA.charAt(i) - strB.charAt(i);
                }
            }
            return strA.length() - strB.length();
        }
    }
}
