package cn.banny.unidbg.linux.android.dvm.array;

import cn.banny.unidbg.linux.android.dvm.Array;
import cn.banny.unidbg.linux.android.dvm.DvmObject;

public class ArrayObject extends BaseArray<DvmObject[]> implements Array<DvmObject[]> {

    public ArrayObject(DvmObject...value) {
        super(value);
    }

    @Override
    public int length() {
        return value.length;
    }

    @Override
    public void setData(int start, DvmObject[] data) {
        System.arraycopy(data, 0, value, start, data.length);
    }
}
