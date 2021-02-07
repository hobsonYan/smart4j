package chapter3.bean;

/**
 * @author yan hongbo
 * @date 2021/2/3 16:45
 * @description 返回数据对象
 */
public class Data {

    /**
     * 模型数据
     */
    private Object model;

    public Data(Object model) {
        this.model = model;
    }

    public Object getModel() {
        return model;
    }
}
