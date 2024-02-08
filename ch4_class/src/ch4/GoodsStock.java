package ch4;

public class GoodsStock {

  // 속성- 상품코드(p1011) goodsCode ,재고수량(300) stockNum

  private String goodsCode;
  private int stockNum;

  //    default 생성자
  public GoodsStock(String goodsCode, int stockNum) {
    this.goodsCode = goodsCode;
    this.stockNum = stockNum;
  }

  //    재고수량 추가 addStock(int amount)
  //    재고수량 리턴
  int addStock(int amount) {
    // 현재재고수량 + 추가수량
    stockNum = stockNum + amount;
    return stockNum;
  }

  //    재고수량 감소 subtractStock(int amount)
  //    재고수량 리턴
  int subtractStock(int amount) {
    stockNum = stockNum - amount;
    return stockNum;
  }
}
