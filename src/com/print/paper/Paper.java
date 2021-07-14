/** 

* @author LI 
* @version 创建时间：2021年7月12日 下午7:29:55 
* package:com.print.paper
* 纸张接口

*/ 
package com.print.paper;
public interface Paper {
	
	/**
	 * 换行标志
	 */
	public static final String newline = "\r\n";
	/**
	 * @param c
	 * 输出一个字符到纸张
	 */
	public void putInchar(char c);
	/**
	 * @return 返回输出到纸张上的内容
	 */
	public String getContent();
}
