public class CodeSignal {
    public static void main(String[] args) {
        //System.out.println(solution("e5", "d3"));
        System.out.println('a' < 'b');
    }

    public static boolean solution(String bishop, String pawn) {
        char bTar = bishop.charAt(0);
        int bTiv = Integer.parseInt(String.valueOf(bishop.charAt(1))); 
        char pTar = pawn.charAt(0);
        int pTiv =  Integer.parseInt(String.valueOf(pawn.charAt(1)));

        if(achNerqev(bTar, bTiv, pTar, pTiv) || dzaxNerqev(bTar, bTiv, pTar, pTiv)){
            return true;
        }else if(achVerev(bTar, bTiv, pTar, pTiv) || dzaxVerev(bTar, bTiv, pTar, pTiv)){
            return true;
        }

        return false;
    }

    static boolean achVerev(char bTar, int bTiv, char pTar, int pTiv){
        for(; bTiv <= 8; bTiv++, bTar++){
            if(bTar == pTar && bTiv == pTiv){
                return true;
            }
        }
        return false;
    }

    static boolean dzaxVerev(char bTar, int bTiv, char pTar, int pTiv){
        for(; bTiv <= 8; bTiv++, bTar--){
            if(bTar == pTar && bTiv == pTiv){
                return true;
            }
        }
        return false;
    }

    static boolean dzaxNerqev(char bTar, int bTiv, char pTar, int pTiv){
        for(; bTiv >= 1; bTiv--, bTar--){
            if(bTar == pTar && bTiv == pTiv){
                return true;
            }
        }
        return false;
    }

    static boolean achNerqev(char bTar, int bTiv, char pTar, int pTiv){
        for(; bTiv >= 1; bTiv--, bTar++){
            if(bTar == pTar && bTiv == pTiv){
                return true;
            }
        }
        return false;
    }
}
