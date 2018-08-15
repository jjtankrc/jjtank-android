package com.jjstudio.jjtank.model;

public class TankControlData {
    public static byte[] GO = {(byte) 0xA5,(byte) 0xC5,(byte) 0x32,(byte) 0x00,(byte) 0xAA};
    public static byte[] STOP = {(byte) 0xA5,(byte) 0xC5,(byte) 0x00,(byte) 0x00,(byte) 0xAA};
    public static byte[] SWT_1_ON = {(byte) 0xC6,(byte) 0x50,(byte) 0x0A,(byte) 0xAA};
    public static byte[] SWT_1_OFF = {(byte) 0xC6,(byte) 0x50,(byte) 0x05,(byte) 0xAA};
    public static byte[] SWT_2_ON = {(byte) 0xC6,(byte) 0x10,(byte) 0x0A,(byte) 0xAA};
    public static byte[] SWT_2_OFF = {(byte) 0xC6,(byte) 0x10,(byte) 0x05,(byte) 0xAA};
    public static byte[] SWT_3_ON = {(byte) 0xC6,(byte) 0x0A,(byte) 0x0A,(byte) 0xAA};
    public static byte[] SWT_3_OFF = {(byte) 0xC6,(byte) 0x0A,(byte) 0x05,(byte) 0xAA};
    public static byte[] SWT_4_ON = {(byte) 0xC6,(byte) 0x0A,(byte) 0x0A,(byte) 0xAA};
    public static byte[] SWT_4_OFF = {(byte) 0xC6,(byte) 0x0A,(byte) 0x05,(byte) 0xAA};
    public static byte[] TURRENT_LEFT = {(byte) 0xC7,(byte) 0x32,(byte) 0x4A,(byte) 0xAA};
    public static byte[] TURRENT_RIGHT = {(byte) 0xC7,(byte) 0x32,(byte) 0x0A,(byte) 0xAA};
    public static byte[] GYRO_ON = {(byte) 0xC6,(byte) 0x0A,(byte) 0x00,(byte) 0xAA};
    public static byte[] GYRO_OFF = {(byte) 0xC6,(byte) 0x0A,(byte) 0x00,(byte) 0xAA};
    public static byte[] FIRE = {(byte) 0xC8,(byte) 0x32,(byte) 0x32,(byte) 0xAA};
    public static boolean isTest = true;
}
