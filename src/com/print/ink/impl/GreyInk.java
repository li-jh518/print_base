/** 

 * @author LI 
 * @version 创建时间：2021年7月12日 下午7:26:03 
 * package:com.print.ink.impl
 * 灰色墨盒，GreyInk实现Ink接口

 */ 
package com.print.ink.impl;

import java.awt.Color;

import com.print.ink.Ink;

public class GreyInk implements Ink{
	
	//打印使用的颜色
	@Override
	public String getColor(int r, int g, int b) {
		// TODO Auto-generated method stub
		int c = (r + g + b) / 3;
		Color color = new Color(c, c, c);
		return '#' + Integer.toHexString(color.getRGB()).substring(2);
	}
}
