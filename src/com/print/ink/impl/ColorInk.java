/** 

* @author LI 
* @version 创建时间：2021年7月12日 下午7:19:43 
* package:com.print.ink.impl
* 彩色墨盒，ColorInk实现Ink接口

*/ 
package com.print.ink.impl;

import java.awt.Color;

import com.print.ink.Ink;

public class ColorInk implements Ink{

	//打印使用的颜色
	@Override
	public String getColor(int r, int g, int b) {
		// TODO Auto-generated method stub
		Color color = new Color(r, g, b);
		return '#' + Integer.toHexString(color.getRGB()).substring(2);
	}

}
