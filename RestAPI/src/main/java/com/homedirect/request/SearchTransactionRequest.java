package com.homedirect.request;

public class SearchTransactionRequest {

	private int id;
	private String fromDate;
	private String toDate;
	private Byte type;
	private int pageNo;
	private int pageSize;

	public SearchTransactionRequest(int id, String fromDate, String toDate, Byte type, int pageNo, int pageSize) {
		super();
		this.id = id;
		this.fromDate = fromDate;
		this.toDate = toDate;
		this.type = type;
		this.pageNo = pageNo;
		this.pageSize = pageSize;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFromDate() {
		return fromDate;
	}

	public void setFromDate(String fromDate) {
		this.fromDate = fromDate;
	}

	public String getToDate() {
		return toDate;
	}

	public void setToDate(String toDate) {
		this.toDate = toDate;
	}

	public Byte getType() {
		return type;
	}

	public void setType(Byte type) {
		this.type = type;
	}

	public int getPageNo() {
		return pageNo;
	}

	public void setPageNo(int pageNo) {
		this.pageNo = pageNo;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
}
