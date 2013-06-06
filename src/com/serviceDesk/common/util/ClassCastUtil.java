package com.serviceDesk.common.util;

import java.io.IOException;
import java.io.Reader;
import java.sql.Clob;
import java.sql.SQLException;

public class ClassCastUtil {
	
	public static final String GIF = "image/gif";
	public static final String JPEG = "image/jpeg";
	public static final String PNG = "image/png";
	public static final String PJPEG = "image/pjpeg"; // IE8 中取得这样的格式
	public static final String XPNG = "image/x-png"; // IE8 中取得这样的格式
	public static final String IMAGE_ERROR_MSG = "文件格式错误，请上传*.gif,*.jpg,*.jpeg,*.png格式的图片。";
	
	/**
	 * 对象转换字符串
	 * @param obj
	 * @return
	 */
	public static String transString(Object obj) {
		String str = "";
		if (obj != null) {
			str = obj.toString();
		}
		return str;
	}

	/**
	 * 数据库Clob对象转换为String
	 * 
	 */
	public static String clobToString(Clob clob) {
		try {
			// 以 java.io.Reader 对象形式（或字符流形式）
			// 检索此 Clob 对象指定的 CLOB 值 --Clob的转换
			Reader inStreamDoc = clob.getCharacterStream();
			// 取得clob的长度
			char[] tempDoc = new char[(int) clob.length()];
			inStreamDoc.read(tempDoc);
			inStreamDoc.close();
			return new String(tempDoc);
		} catch (IOException e) {
			e.printStackTrace();
		} catch (SQLException es) {
			es.printStackTrace();
		}
		return null;
	}
	
	/**
	 * 对象转换Integer
	 * 
	 * @param obj
	 * @return
	 */
	public static int transInteger(Object obj) {
		int it = 0;
		if(transString(obj) != null && !"".equals(transString(obj))) {
			it = Integer.parseInt(obj.toString());
		}
		return it;
	}
	
	/**
	 * 对象转换Double
	 * 对象为空，返回值 0.0
	 * 
	 * @param obj
	 * @return
	 */
	public static double transDouble(Object obj) {
		double db = 0D;
		if(transString(obj) != null && !"".equals(transString(obj))) {
			db = Double.parseDouble(obj.toString());
		}
		return db;
	}
	
	/**
	 * 判断是否是图片
	 * 
	 * @param fileType - 文件类型
	 * @return
	 */
	public static boolean isImage(String fileType) {
		boolean flag = false;
		if(GIF.equals(fileType) || JPEG.equals(fileType) || PNG.equals(fileType) 
				|| PJPEG.equals(fileType) || XPNG.equals(fileType)) {
			flag = true;
		}
		return flag;
	}
	
	/**
	 * 判断字符串不为空
	 * 
	 * @param str
	 * @return
	 */
	public static boolean isNotNull(String str) {
		if(str != null && !"".equals(str)) 
			return true;
		return false;
	}
	
	/**
	 * 为pirobox构建图片格式
	 * 
	 * @param imgURL - 图片路径
	 * @return
	 */
	public static String replaceImg4PiroBox(String imgURL) {
		String result = "";
		if(imgURL != null && !"".equals(imgURL)) {
			String imgName = imgURL.substring(imgURL.lastIndexOf("/"));
			result = "<a href='" + imgURL + "' title='" + imgName + "' class='pirobox_gall'><img src='" + imgURL + "' class='img_pirobox' /></a>";
		}
		return result;
	}
	
}
