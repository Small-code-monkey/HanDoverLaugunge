package com.handoverlaugunge;

import java.io.IOException;

import taobe.tec.jcc.JChineseConvertor;

/**
 * Date:2017/4/27
 * Function:
 */

public class HanDover {

    /**
     * 简体切换繁体
     *
     * @param s
     * @return
     */
    public static String J_Change(String s) {
        try {
            JChineseConvertor jChineseConvertor = JChineseConvertor.getInstance();
            s = jChineseConvertor.t2s(s);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return s;
    }

    /**
     * 繁体切换简体
     *
     * @param s
     * @return
     */
    public static String F_Change(String s) {
        try {
            JChineseConvertor jChineseConvertor = JChineseConvertor.getInstance();
            s = jChineseConvertor.s2t(s);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return s;
    }
}
