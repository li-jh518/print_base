/** 

* @author LI 
* @version 创建时间：2021年7月12日 下午7:49:40 
* package:com.print.printer
* 打印机程序

*/ 
package com.print.printer;

import com.print.ink.Ink;
import com.print.paper.Paper;

public class Printer {
	// 面向接口编程，而不是具体的实现类
    private Ink ink = null;
    // 面向接口编程，而不是具体的实现类
    private Paper paper = null;
    /**
     * 设值注入所需的setter方法。
     * @param ink 传入墨盒参数
     */
    public void setInk(Ink ink) {
        this.ink = ink;
    }

    /**
     * 设值注入所需的setter方法。
     * @param paper 传入纸张参数
     */
    public void setPaper(Paper paper) {
        this.paper = paper;
    }

    /**
     * 打印机打印方法。
     * @param str 传入打印内容
     */
    public void print(String str) {
        // 输出颜色标记
        System.out.println("使用" + ink.getColor(255, 200, 0) + "颜色打印:\n");
        // 逐字符输出到纸张
        for (int i = 0; i < str.length(); ++i) {
            paper.putInchar(str.charAt(i));
        }
        // 将纸张的内容输出
        System.out.print(paper.getContent());
    }
}
