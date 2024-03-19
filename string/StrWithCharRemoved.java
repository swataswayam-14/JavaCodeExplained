package string;

public class StrWithCharRemoved {
    public static void main(String[] args) {
        String str = "aabvcdsseeeqa";
        removechar(str, 0, 'e');
        System.out.println(ans);
        String p = "";
        skip(p, str, 's'); 
        System.out.println(p);
        String updatedStr = removeChar(str, 'a', "");
        System.out.println(updatedStr);
        String word = "apple";
        String strr = "heymynameappleisboy";
        System.out.println(skipWord(strr, word));
        System.out.println("helloappappleisnotapplebutapp");
        System.out.println(SkipIt("helloappappleisnotapplebutapp"));
    }
    static String ans = "";
    static void removechar(String a, int i, char toremove){
        if(i == a.length()){
            return;
        }
        if(a.charAt(i) != toremove){
            ans = ans+ a.charAt(i);
            removechar(a, i+1, toremove);
        }else{
            removechar(a, i+1, toremove);
        }
    }

    static void skip(String p , String up, char toremove){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);

        if(ch == toremove ){
            skip(p, up.substring(1), toremove);
        }else{
            skip(p+ch, up.substring(1), toremove);
        }
    }

    //recursion which is having a return type (String)
    static String removeChar(String str, char toremove, String strupdated){
        if(str.isEmpty()){
            return "";
        }
        char ch = str.charAt(0);
        if(ch == toremove){
            return removeChar(str.substring(1), toremove, strupdated);
        }else{
            return ch + removeChar(str.substring(1), toremove, strupdated);
        }
    }


    //skip a word

    static String skipWord(String str, String wordtoberemoved){
        if(str.isEmpty()){
            return "";
        }
        int length = wordtoberemoved.length();
        if(str.startsWith(wordtoberemoved)){
            return skipWord(str.substring(length), wordtoberemoved);
        }else{
            return str.charAt(0) + skipWord(str.substring(1), wordtoberemoved);
        }
    }

    //case : skip app when its not apple, if it is apple then donot skip

    static String SkipIt(String str){
        if(str.isEmpty()){
            return "";
        }
        
        if(str.startsWith("app") && !str.startsWith("apple")){
            return SkipIt(str.substring(3));
        }else{
            return str.charAt(0) + SkipIt(str.substring(1));
        }
    
    }
}
