package chap07;

public class Parameter {
	private String searchType;
	private String searchWord;
	private String orderCond;
	private int startIdx; //limit 시작값
	private int page; //사용자가 요청한 페이지
	
	/* 생성자
	 * 생성자를 여기에 만든 잉?
	 * 사용자가 요청하지 않으면 0페이지는 말이 안되니까 1로 초기화 할려고
	 */
	
	public Parameter() {
		page = 1;
		
	}
	
	public int getStartIdx() {
		return startIdx;
	}
	public void setStartIdx(int startIdx) {
		this.startIdx = startIdx;
	}
	public int getPage() {
		return page;
	}
	public void setPage(int page) {
		this.page = page;
	}
	public String getSearchType() {
		return searchType;
	}
	public void setSearchType(String searchType) {
		this.searchType = searchType;
	}
	public String getSearchWord() {
		return searchWord;
	}
	public void setSearchWord(String searchWord) {
		this.searchWord = searchWord;
	}
	public String getOrderCond() {
		return orderCond;
	}
	public void setOrderCond(String orderCond) {
		this.orderCond = orderCond;
	}

}
