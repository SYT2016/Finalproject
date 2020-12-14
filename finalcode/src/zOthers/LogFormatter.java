/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zOthers;

import java.util.Date;
import java.util.logging.Formatter;
import java.util.logging.LogRecord;

/**
 *
 * @author liu
 */
public class LogFormatter extends Formatter {
	@Override
	public String format(LogRecord record) {
		Date date = new Date();
		String sDate = date.toString();
		return "[" + sDate + "]" + "[" + record.getLevel() + "]"
				+ record.getClass() + record.getMessage() + "\n";
	}
 
}
