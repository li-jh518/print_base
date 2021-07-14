/** 

* @author LI 
* @version 创建时间：2021年7月12日 下午7:32:29 
* package:com.print.paper.impl
* 纸张打印实现，TextPaper实现Paper接口

*/ 
package com.print.paper.impl;

import com.print.paper.Paper;

public class TextPaper implements Paper {

	//每行字符数
	private int charPerLine;
	//每页行数
	private int linePerPage;
	//打印纸张的内容
	private String Content = "";
	//当前横向位置，从0 - charPerLine-1
	private int posX = 0;
	//当前行数，从0 - linePerPage-1
	private int posY = 0;
	//当前页数
	private int posP = 1;
	
	//getter,setter方法，用于属性注入
	public int getCharPerLine() {
		return charPerLine;
	}

	public void setCharPerLine(int charPerLine) {
		this.charPerLine = charPerLine;
	}

	public int getLinePerPage() {
		return linePerPage;
	}

	public void setLinePerPage(int linePerPage) {
		this.linePerPage = linePerPage;
	}

	@Override
	public void putInchar(char c) {
		// TODO Auto-generated method stub
		Content += c;
		++posX;
		//判断是否换行
		if(posX == charPerLine){
			Content += Paper.newline;
			posX = 0;
			++posY;
		}
		//判断是否翻页
		if(posY == linePerPage){
			Content += "== 第" + posP + "页  ==";
			Content += Paper.newline + Paper.newline;
			posY = 0;
			++posP;
		}
	}

	@Override
	public String getContent() {
		// TODO Auto-generated method stub
		String ret = this.Content;
		if(!(posX == 0 && posY == 0)){
			int count = linePerPage - posY;
			for(int i = 0;i < count; ++i){
				ret += Paper.newline;
			}
			ret += "== 第" + posP + "页  ==";
		}
		return ret;
	}

}
