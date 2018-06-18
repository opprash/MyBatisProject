package study;

public class TestSychronized {
    public static void main(String[] args){
    ThreadDemo td=new ThreadDemo();
    new Thread(td).start();
        while(true){
            synchronized (td){
                if(td.getFlag()){
                    System.out.println("主线程flag:"+td.getFlag());
                    break;
                }
            }
        }
    }
}
class ThreadDemo implements Runnable {
    private boolean flag = false;

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    public boolean getFlag() {
        return flag;
    }

    // @Override
    public void run() {
        try {
            Thread.sleep(200);

        } catch (Exception e) {
            e.printStackTrace();
        }
        flag = true;
        System.out.println("其他线程flag=" + flag);
    }
}