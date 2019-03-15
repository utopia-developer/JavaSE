package part3_Java常用工具类.chapter16_异常.exception;

import part3_Java常用工具类.chapter16_异常.exception.Exception_custom.HotelAgeException;

public class ExceptionChain {
    public static void ExceptionOne() throws HotelAgeException {
        throw new HotelAgeException();
    }

    public static void ExceptionTwo() throws Exception {
        try {
            ExceptionOne();
        } catch (HotelAgeException e1) {
            //构造方法组合旧的异常信息，生成新的异常信息
            throw new Exception("异常链1", e1);
        }
    }

    public static void ExceptionThree() throws Exception {
        try {
            ExceptionTwo();
        } catch (Exception e2) {
            Exception e3 = new Exception("异常链2");
            //通过initCause()方法组合生成新的异常信息
            e3.initCause(e2);
            throw e3;
        }
    }

    public static void main(String[] args) {
        try {
            ExceptionThree();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
