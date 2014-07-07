package com.team.htli.util;

import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;

import org.apache.commons.codec.digest.DigestUtils;

import sun.misc.BASE64Encoder;

public class MD5Tool {

	/**
	 * 利用MD5进行加密
	 * 
	 * @param str
	 *            待加密的字符串
	 * @return 加密后的字符串
	 * @throws NoSuchAlgorithmException
	 *             没有这种产生消息摘要的算法
	 * @throws UnsupportedEncodingException
	 */
	public static String EncoderByMd5(String str)
			throws NoSuchAlgorithmException, UnsupportedEncodingException {
		// 确定计算方法
		BASE64Encoder base64en = new BASE64Encoder();
		// 加密后的字符串
		return base64en.encode(DigestUtils.md5Hex(str).getBytes());
	}

}
