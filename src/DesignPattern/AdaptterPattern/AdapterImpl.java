package DesignPattern.AdaptterPattern;

public class AdapterImpl implements Adapter {
    public Float twiceOf(Float f) {
        return (float) Math.TwoNum(f.doubleValue());
    };
    public Float halfOf(Float f) {
        System.out.println(f);
        return (float) Math.half(f.doubleValue());
    }
}
