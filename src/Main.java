import exceptionhandle.ExceptionHandle;
import singletonlazyinitialization.MoleManor;

/**
 * 项目主流程
 */
public class Main {
    public static void main(String[] args) throws CloneNotSupportedException,InterruptedException {
        System.out.println("欢迎来到摩尔庄园！");
        System.out.println("选择运行方式：[1]游玩模式 [2]测试模式");
        //异常处理
        ExceptionHandle exceptionHandle=new ExceptionHandle();


        int key=0;
        while(key==0) {
            key = exceptionHandle.exception();
            switch (key){
                case 1:
                    MoleManor MM = MoleManor.getInstance();
                    MM.flowController();
                    break;
                case 2:
                    break;
                default:
                    System.out.println("输入模式错误，请重新输入！！");
                    key=0;
                    break;
            }
        }
    }
}