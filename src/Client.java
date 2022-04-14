public class Client {
    public static void main(String[] args) {
        //使用春节促销活动
        SalesMan salesMan = new SalesMan(new StrategyA());
        salesMan.salesManShow();
        SalesMan salesMan2 = new SalesMan(new StrategyB());
        salesMan2.salesManShow();
    }
}
