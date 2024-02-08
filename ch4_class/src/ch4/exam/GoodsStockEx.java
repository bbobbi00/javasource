package ch4.exam;

public class GoodsStockEx {

  public static void main(String[] args) {
    GoodsStock goodsStock = new GoodsStock("p1011", 150);

    int stockNum = goodsStock.addStock(20);
    System.out.println("현재 재고 수량 + stockNum");
    // 재고수량 추가

    stockNum = goodsStock.substractStock(100);
    System.out.println("현재 재고 수량" + stockNum);
  }
}
