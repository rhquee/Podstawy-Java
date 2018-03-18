package string;

/**
 * Created by Lenovo on 2018-03-01.
 */
public class StringUtils {
//    public String removeSpaces(String param) {
//        String result = "";
//        int i = 0;
//        while (i < param.length() - 1) {
//            char c = param.charAt(i);
//            char c1 = param.charAt(i+1);
////            if (c == ' ' && c == ' ') {
////            i++;
////            } else {
////                result = result + c;
////                i++;
////            }
//            if(c!=' ' || c1 !=' '){
//                result = result + c;
//            }
//            i++;
//        }
//        return result;
//    }
//}

    public String removeSpaces(String param) {
        String result = "";
        int i = 0;
        while (i < param.length() - 1) {
            char c = param.charAt(i);
            char c1 = param.charAt(i + 1);
            if (c != ' ' || c1 != ' ') {
                result = result + c;
            }
            i++;
        }
        return result;
    }
}
