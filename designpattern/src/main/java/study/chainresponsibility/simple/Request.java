package study.chainresponsibility.simple;

/**
 * 请求类
 *  定义请求对象，包含了需要处理的数据或者信息，以及判断是否需要处理的方法。
 */
public class Request {

    private boolean needsHandling ;

    public Request(boolean needsHandling) {
        this.needsHandling = needsHandling;
    }

    public boolean needsHandling() {
        return needsHandling;
    }



}
