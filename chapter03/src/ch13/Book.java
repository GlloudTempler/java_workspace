package ch13;

// 모든 클래스의 최상의 클래스는 Object 클래스 이다.
public class Book extends Object {
	
	private int bookId;
	private String author;
	private String title;
	
	public Book(int bookId, String author, String title) {
		super();
		this.bookId = bookId;
		this.author = author;
		this.title = title;
	}

	public int getBookId() {
		return bookId;
	}

	public String getAuthor() {
		return author;
	}

	public String getTitle() {
		return title;
	}
	
	@Override
	public String toString() {
		return this.bookId + ", " + this.title + ", " + this.author;
	}
	// 아주 간혹 코딩테스트에 나올 수 있음
	// equals 메서드 재정의
	// 책 이름이 같고 저자 이름이 같다면 물리적으로 같은 책이라고 판별하는 기능을 만들자
	// 실제 존재하는 책1, 책2 가정
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Book) {
			// 여기안에서 검사
			Book target = (Book)obj;
			if(this.title == target.title) {
				return true;
			}
		}
		
		return false;
		
//		if(this.title == obj.title || this.author == object.author) {
//			// 논리적으로 같은 책 = true리턴
//		}
//		
//		return false;
	}
	
	
}
