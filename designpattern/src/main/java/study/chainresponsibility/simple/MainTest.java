package study.chainresponsibility.simple;

public class MainTest {
    public static void main(String[] args) {
        // 创建责任链
        Handler handler1 = new ConcreteHandler();
        Handler handler2 = new ConcreteHandler();
        handler1.setNextHandler(handler2);
        // 创建请求
        Request request1 = new Request(true);
        Request request2 = new Request(false);

        // 处理请求
        handler1.hanlerRequest(request1);
        handler1.hanlerRequest(request2);

    }
}
