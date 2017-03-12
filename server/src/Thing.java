public class Thing {
	private int num;
    private String name;

    public Thing(String name) {
        this.num = 0;
        this.name = name;
    }

    /**
     * Get the number
     */
    public int getNum() {
        return num;
    }

    /**
     * Increment the number
     */
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
