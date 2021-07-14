/** 

* @author LI 
* @version 创建时间：2021年7月12日 下午7:20:39 
* package:com.print.ink
* 墨盒颜色接口

*/ 
package com.print.ink;
public interface Ink {

	/**
	 * @param r 红色值
	 * @param g 绿色值
	 * @param b 蓝色值
	 * @return 返回打印采用的颜色
	 */
	public String getColor(int r, int g, int b);
}
