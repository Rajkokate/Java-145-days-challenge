public class strinbuil {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("");

        for(char ch ='a';ch<'z';ch++){ // time complexity is O(n)
            sb.append(ch);
        }
        System.out.println(sb);
    }
}
