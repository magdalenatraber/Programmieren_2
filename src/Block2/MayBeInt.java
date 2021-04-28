package Block2;

public class MayBeInt {
    private int data;
    private int status;
    public MayBeInt(int data, int status){
       this.data = data; this.status = status;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}
