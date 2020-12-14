/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zOthers;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author liu
 */
public class changeDate {
    public static String change(Date d){
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return sdf.format(d);
    }
}
