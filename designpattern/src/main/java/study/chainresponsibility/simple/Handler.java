package study.chainresponsibility.simple;

/**
 * 定义一个抽象处理者接口，规定了处理请求的方法以及设置下一个处理者的方法。这样可以使得具体的处理者更容易扩展和替换。
 */
public interface Handler {

    // 1、规定了处理请求的方法
    void hanlerRequest(Request request);

    // 2、设置下一个处理者的方法
    void setNextHandler(Handler handler);

}
