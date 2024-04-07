package study.chainresponsibility.simple;

/**
 * 实现抽象处理者接口的具体类，每个类负责处理特定类型的请求。这些处理者可以按照一定的顺序连接起来形成责任链。
 */
//  具体处理请求的类
public class ConcreteHandler implements Handler{

    private Handler nextHandler;
    // 每个类负责处理特定类型的请求
    @Override
    public void hanlerRequest(Request request) {
        if (request.needsHandling()){
            // 处理请求
            System.out.println("Handling request in ConcreteHandler");
        } else if (nextHandler != null) {
            // 将请求传递给下一个处理者
            nextHandler.hanlerRequest(request);
        }
    }
    // 按照一定的顺序连接起来形成责任链
    @Override
    public void setNextHandler(Handler handler) {
        this.nextHandler = handler;
    }
}
