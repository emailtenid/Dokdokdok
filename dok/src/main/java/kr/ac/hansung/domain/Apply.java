package kr.ac.hansung.domain;

public class Apply {
	
	private String id;
	private String book_name;
	private String apply_text;
	
	public Apply(){
		
	}
	
	public Apply(String id, String book_name, String apply_text){
		
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getBook_name() {
		return book_name;
	}
	public void setBook_name(String book_name) {
		this.book_name = book_name;
	}
	public String getApply_text() {
		return apply_text;
	}
	public void setApply_text(String apply_text) {
		this.apply_text = apply_text;
	}
	
}
