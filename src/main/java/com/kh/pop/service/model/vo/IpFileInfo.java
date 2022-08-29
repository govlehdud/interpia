package com.kh.pop.service.model.vo;

import java.sql.Date;

public class IpFileInfo {
	private int fileNo;
	private String fileName;
	private String changeName;
	private Date fileCreateDate;
	private int fileLevel;
	private String filePath;
	private String fileStatus;
	private int code;
	
	public IpFileInfo() {}

	public int getFileNo() {
		return fileNo;
	}

	public void setFileNo(int fileNo) {
		this.fileNo = fileNo;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public String getChangeName() {
		return changeName;
	}

	public void setChangeName(String changeName) {
		this.changeName = changeName;
	}

	public Date getFileCreateDate() {
		return fileCreateDate;
	}

	public void setFileCreateDate(Date fileCreateDate) {
		this.fileCreateDate = fileCreateDate;
	}

	public int getFileLevel() {
		return fileLevel;
	}

	public void setFileLevel(int fileLevel) {
		this.fileLevel = fileLevel;
	}

	public String getFilePath() {
		return filePath;
	}

	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}

	public String getFileStatus() {
		return fileStatus;
	}

	public void setFileStatus(String fileStatus) {
		this.fileStatus = fileStatus;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	@Override
	public String toString() {
		return "ScFileInfo [fileNo=" + fileNo + ", fileName=" + fileName + ", changeName=" + changeName
				+ ", fileCreateDate=" + fileCreateDate + ", fileLevel=" + fileLevel + ", filePath=" + filePath
				+ ", fileStatus=" + fileStatus + ", code=" + code + "]";
	}

	

	

}
