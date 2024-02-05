package ch4.exam;

public class Board {

  // 번호, 제목, 내용, 작성자, 작성날짜, 수정날짜

  private int bno;
  private String title;
  private String content;
  private String writer;
  private LocalDateTime regDate;
  private LocalDateTime lastModifedDate;

  // default

  public Board() {}

  // 4 개만
  public Board(int bno, String title, String content, String writer) {
    this.bno = bno;
    this.title = title;
    this.content = content;
    this.writer = writer;
  }
}
