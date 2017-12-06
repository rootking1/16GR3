package com.qhit.lh.gr3.wjw.t7.action;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import org.apache.struts2.ServletActionContext;
import com.opensymphony.xwork2.ActionSupport;

/**
 * @author 王军伟
 * 文件上传和下载
 * 2017年12月6日上午8:33:41
 */
public class UserAction extends ActionSupport {
	private String name;
	private File file;
	private String fileFileName;
	private String fileContentType;
	private InputStream down_is;

	public String downfile() throws Exception {
		String down_file = ServletActionContext.getServletContext().getRealPath("/upload/") + fileFileName;
		down_is = new FileInputStream(down_file);
		return "down";
	}

	/**
	 * @return 文件上传
	 * @throws Exception
	 */
	public String load() throws Exception {
		// 获取资源文件路径
		String path = ServletActionContext.getServletContext().getRealPath("/upload");
		// 创建输入流
		InputStream is = new FileInputStream(file);
		// 判断文件夹路径是否存在
		if (!new File(path).exists()) {
			// 创建文件夹路径
			new File(path).mkdirs();
		}
		// 创建输入流
		OutputStream os = new FileOutputStream(new File(path, fileFileName));
		// 设置单次读取写入byte的大小
		byte[] buffer = new byte[8096];
		// 以字节遍历输入流，写入文件
		while (is.read(buffer, 0, buffer.length) != -1) {
			os.write(buffer);
		}
		// 关闭流
		os.close();
		is.close();
		// 返回成功
		return super.execute();
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the file
	 */
	public File getFile() {
		return file;
	}

	/**
	 * @param file
	 *            the file to set
	 */
	public void setFile(File file) {
		this.file = file;
	}

	/**
	 * @return the fileFileName
	 */
	public String getFileFileName() {
		return fileFileName;
	}

	/**
	 * @param fileFileName
	 *            the fileFileName to set
	 */
	public void setFileFileName(String fileFileName) {
		this.fileFileName = fileFileName;
	}

	/**
	 * @return the fileContentType
	 */
	public String getFileContentType() {
		return fileContentType;
	}

	/**
	 * @param fileContentType
	 *            the fileContentType to set
	 */
	public void setFileContentType(String fileContentType) {
		this.fileContentType = fileContentType;
	}

	/**
	 * @return the down_is
	 */
	public InputStream getDown_is() {
		return down_is;
	}

	/**
	 * @param down_is
	 *            the down_is to set
	 */
	public void setDown_is(InputStream down_is) {
		this.down_is = down_is;
	}

}