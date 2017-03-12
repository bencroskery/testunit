public class Thing {
	private int num;
    private String num;

    public Thing(String name) {
        this.num = 0;
        this.name = name;
    }

    public int getNum() {
        return num;
    }

    public void incNum() {
        num++;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}
