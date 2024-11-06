package Enum;

public enum Transportation {
    SUBWAY("지하철"){
        @Override
        public int getTotal(int person) {
            return person*1450;
        }
    }, TAXI("택시"){
        @Override
        public int getTotal(int person) {
            return person*4500;
        }
    }, BUS("버스") {
        @Override
        public int getTotal(int person) {
            return person * 1500;
        }
    };

    private final String title;
    Transportation(String title){
        this.title=title;
    }
    public String getTitle(){
        return title;
    }
    public abstract int getTotal(int person);
}
