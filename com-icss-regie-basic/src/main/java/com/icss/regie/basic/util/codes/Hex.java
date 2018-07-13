/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.icss.regie.basic.util.codes;

/**
 *
 * @author johnson
 */
public class Hex {

    private static final String ZERO = "0";
    private static final String EMPTY = "";
    private static final String SPACE = " ";
    private static final String COMMA = ",";

    public static String bytesToHexString(byte[] array) {
        return bytesToHexString(array, EMPTY, 0, array.length);
    }
    public static String bytesToHexString(byte[] array,String space) {
        return bytesToHexString(array, space, 0, array.length);
    }
    public static String bytesToHexString(byte[] array, String separator, int startIndex, int endIndex) {
        if (array == null || array.length < 1) {
            return null;
        }
        if (separator == null) {
            separator = EMPTY;
        }
        int bufSize = (endIndex - startIndex);
        if (bufSize <= 0) {
            return EMPTY;
        }
        StringBuilder buffer = new StringBuilder(2 * bufSize);
        for (int i = 0; i < array.length - 1; i++) {
            buffer.append(byteToHexString(array[i])).append(separator);
        }
        buffer.append(byteToHexString(array[array.length - 1]));
        String result = buffer.toString();
        return result;
    }

    public static String byteToHexString(byte src) {
        String result = EMPTY;
        int v = src & 0xFF;
        String hv = Integer.toHexString(v);
        if (hv.length() < 2) {
            result = ZERO + hv;
        } else {
            result = hv;
        }
        return result.toUpperCase();
    }

    public static byte charToByte(char c) {
        return (byte) "0123456789ABCDEF".indexOf(c);
    }
    public static byte[] hexStringToBytes(String hexString) {
        return hexStringToBytes(hexString,EMPTY);
    }
    public static byte[] hexStringToBytes(String hexString,String space) {
        if (hexString == null || hexString.equals("")) {
            return null;
        }
        hexString = hexString.replaceAll(space, EMPTY);
        int length = hexString.length() / 2;
        char[] hexChars = hexString.toCharArray();
        byte[] result = new byte[length];
        for (int i = 0; i < length; i++) {
            int pos = i * 2;
            result[i] = (byte) (charToByte(hexChars[pos]) << 4 | charToByte(hexChars[pos + 1]));
        }
        return result;
    }

    public static char[] hexStringToChars(String hexString) {
        if (hexString == null || hexString.equals("")) {
            return null;
        }
        hexString = hexString.replaceAll(SPACE, EMPTY);
        int length = hexString.length() / 2;
        char[] hexChars = hexString.toCharArray();
        char[] result = new char[length];
        for (int i = 0; i < length; i++) {
            int pos = i * 2;
            result[i] = (char) (charToByte(hexChars[pos]) << 4 | charToByte(hexChars[pos + 1]));
        }
        return result;
    }
}
