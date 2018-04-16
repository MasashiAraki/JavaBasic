package practice16;

import java.text.SimpleDateFormat;
import java.util.Date;

/*
 */
public class PTra16_01 {
    public static void main(String[] args) {

        /*
        * ★ 現在時刻を「YYYY年MM月DD日」形式で出力してください
        */

//    	Data型は日付を取得
    	Date date = new Date();
//    	SimpleDateFormatでフォーマットを設定
    	SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日");
//    	format()で日付を文字列に変換し、変数dateStr(String型)に代入
    	String dateStr = sdf.format(date);
    	System.out.println(dateStr);
    }
}